package com.cts.template.template;

import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.cloud.pubsub.spi.v1.Publisher;
import com.google.protobuf.ByteString;
import com.google.pubsub.v1.PubsubMessage;
import com.google.pubsub.v1.TopicName;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RestController
public class PublisherApplication {

	public static final String MY_PROJECT_ID = "pubsubdemo-169407";
	public static final String MY_TOPIC_ID = "MyTripQ";

	public static void main(String[] args) {
		SpringApplication.run(PublisherApplication.class, args);
	}


	public void publish() throws Exception{
		TopicName topicName = TopicName.create(MY_PROJECT_ID, MY_TOPIC_ID);
		Publisher publisher = null;
		List<ApiFuture<String>> messageIdFutures = new ArrayList<>();

		try {
			// Create a publisher instance with default settings bound to the topic
			publisher = Publisher.defaultBuilder(topicName).build();

			List<String> messages = Arrays.asList("first message", "second message");

			// schedule publishing one message at a time : messages get automatically batched
			for (String message : messages) {
				ByteString data = ByteString.copyFromUtf8(message);
				PubsubMessage pubsubMessage = PubsubMessage.newBuilder().setData(data).build();

				// Once published, returns a server-assigned message id (unique within the topic)
				ApiFuture<String> messageIdFuture = publisher.publish(pubsubMessage);
				messageIdFutures.add(messageIdFuture);
			}
		} finally {
			// wait on any pending publish requests.
			List<String> messageIds = ApiFutures.allAsList(messageIdFutures).get();

			for (String messageId : messageIds) {
				System.out.println("published with message ID: " + messageId);
			}

			if (publisher != null) {
				// When finished with the publisher, shutdown to free up resources.
				publisher.shutdown();
			}
		}
	}
}
