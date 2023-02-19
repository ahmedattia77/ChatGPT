package com.example.chatgpt;

public class Message {
    public static final String SENT_BY_ME = "me";
    public static final String SENT_BY_BOT = "bot";

    private String content = null;
    private String sentBy = null;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSentBy() {
        return sentBy;
    }

    public void setSentBy(String sentBy) {
        this.sentBy = sentBy;
    }

    public Message(String content, String sentBy) {
        this.content = content;
        this.sentBy = sentBy;
    }

    public Message() {
    }
}
