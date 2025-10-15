package com.korit.study.ch16.entity;

import java.time.LocalDateTime;

public class Todo {
    private int id;
    private String content;
    private User user;
    private LocalDateTime createAt;

    public Todo(int id, String content, User user, LocalDateTime createAt) {
        this.id = id;
        this.content = content;
        this.user = user;
        this.createAt = createAt;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", user=" + user +
                ", createAt=" + createAt +
                '}';
    }
}
