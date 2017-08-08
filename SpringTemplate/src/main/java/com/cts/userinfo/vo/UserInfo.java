package com.cts.userinfo.vo;

import org.springframework.context.annotation.Primary;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String userName;
    private String mailId;
    private String location;
    private String createdDate;

    public UserInfo(long id, String userName, String mailId,
                    String location, String createdDate) {
        this.id = id;
        this.userName = userName;
        this.mailId = mailId;
        this.location = location;
        this.createdDate = createdDate;
    }

    public UserInfo() {
    }

    public UserInfo(String customerName) {
        this.userName = customerName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", mailId='" + mailId + '\'' +
                ", location='" + location + '\'' +
                ", createdDate='" + createdDate + '\'' +
                '}';
    }
}
