package com.crustwerk;

public class Article {
    private final String headline;
    private final String content;
    private final String topic;

    Article(String headline, String content, String topic) {
        this.headline = headline;
        this.content = content;
        this.topic = topic;
    }

    public String getHeadline() {
        return headline;
    }

    public String getContent() {
        return content;
    }

    public String getTopic() {
        return topic;
    }

    @Override
    public String toString() {
        return "Article{" +
               "headline='" + headline + '\'' +
               ", content='" + content + '\'' +
               ", topic='" + topic + '\'' +
               '}';
    }
}