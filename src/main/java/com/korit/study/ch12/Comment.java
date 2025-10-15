package com.korit.study.ch12;

public class Comment {
    int ID;
    String Contents;
    Writer writer;

    Comment(int ID, String contents, Writer writer) {
        this.ID = ID;
        this.Contents = contents;
        this.writer = writer;
    }
}
