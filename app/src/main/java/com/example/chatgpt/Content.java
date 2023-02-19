package com.example.chatgpt;

public class Content {
    private final String SENT_BY_ME = "me";
    private final String SENT_BY_BOT = "bot";

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

    public Content(String content, String sentBy) {
        this.content = content;
        this.sentBy = sentBy;
    }

    public Content() {
    }
}
