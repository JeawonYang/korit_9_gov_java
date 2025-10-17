package com.korit.study.ch14;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Todo {
    int id;
    String content;
    User user;
    LocalDateTime createAt;

    public Todo(int id, String content, User user, LocalDateTime createAt) {
        this.id = id;
        this.content = content;
        this.user = user;
        this.createAt = createAt;
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
