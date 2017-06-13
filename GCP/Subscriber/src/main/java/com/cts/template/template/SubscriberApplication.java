package com.cts.template.template;

import com.google.cloud.pubsub.spi.v1.AckReplyConsumer;
import com.google.cloud.pubsub.spi.v1.MessageReceiver;
import com.google.cloud.pubsub.spi.v1.Subscriber;
import com.google.pubsub.v1.PubsubMessage;
import com.google.pubsub.v1.SubscriptionName;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SubscriberApplication {


	public static final String MY_PROJECT_ID = "pubsubdemo-169407";

	String subscriptionId = "mySubscription";

	public static void main(String[] args) {
		SpringApplication.run(SubscriberApplication.class, args);
	}

	@RequestMapping(value = "/getMessage", method = RequestMethod.GET)
	public void getMessage(){


		SubscriptionName subscriptionName = SubscriptionName.create(MY_PROJECT_ID, subscriptionId);
// Instantiate an asynchronous message receiver
		MessageReceiver receiver = new MessageReceiver() {
			@Override
			public void receiveMessage(PubsubMessage message, AckReplyConsumer consumer) {
				// handle incoming message, then ack/nack the received message
				System.out.println("Id : " + message.getMessageId());
				System.out.println("Data : " + message.getData().toStringUtf8());
				consumer.ack();
			}
		};

		Subscriber subscriber = null;
		try {
			// Create a subscriber for "my-subscription-id" bound to the message receiver
			subscriber = Subscriber.defaultBuilder(subscriptionName, receiver).build();
			subscriber.startAsync();
			// ...
		} finally {
			// stop receiving messages
			if (subscriber != null) {
				subscriber.stopAsync();
			}
		}

	}
}
