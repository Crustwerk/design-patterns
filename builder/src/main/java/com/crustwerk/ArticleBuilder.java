package com.crustwerk;

public class ArticleBuilder {
    private String headline;
    private String content;
    private String topic;

    public ArticleBuilder headline(String headline) {
        this.headline = headline;
        return this;
    }

    public ArticleBuilder content(String content) {
        this.content = content;
        return this;
    }

    public ArticleBuilder topic(String topic) {
        this.topic = topic;
        return this;
    }

    public Article build() {
        return new Article(headline, content, topic);
    }
}