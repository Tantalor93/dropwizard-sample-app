package com.github.tantalor93.dto;

public class Saying {
    private final Long id;
    private final String content;

    public Saying(Long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
