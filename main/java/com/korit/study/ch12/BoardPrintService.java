package com.korit.study.ch12;

public class BoardPrintService {
    void printInfo(Board board) {



    }
    void printInfoAll(Board[] boards) {
        System.out.println("게시글 정보 전체 출력");
        for (Board board : boards) {
            System.out.println("게시글 번호 : " + board.ID);
            System.out.println("게시글 제목 : " + board.Title);
            System.out.println("게시글 내용 : " + board.Contents);
            System.out.println("게시글 작성자 ID : " + board.writer.ID);
            System.out.println("게시글 작성자 이름 : " + board.writer.name);
            for (Comment comment : board.comments) {
                System.out.println("댓글 ID : " + board.comments[0].ID);
                System.out.println("댓글 내용 : " + board.Contents);
                System.out.println("댓글 작성자 ID : " + board.writer.ID);
                System.out.println("댓글 작성자 이름 : " + board.writer.name);
            }
            System.out.println();
        }
    }
}

