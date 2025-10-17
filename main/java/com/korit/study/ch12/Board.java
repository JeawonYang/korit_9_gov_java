package com.korit.study.ch12;

public class Board {
    int ID;
    String Title;
    String Contents;
    Writer writer;
    Comment[] comments;

    Board(int ID, String title, String contents, Writer writer, Comment[] comments) {
        this.ID = ID;
        this.Title = title;
        this.Contents = contents;
        this.writer = writer;
        this.comments = comments;
    }
}
