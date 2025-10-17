package com.korit.study.ch12;

public class BoardMain {
    public static void main(String[] args) {


        // Board 배열 - Board => 게시글 2개

        // Board - ID (정수), Title (문자열), Contents(문자열) , Writer (Writer), Comment (Comment[])

        // Writer - ID (정수), Name (문자열)

        // Comment - ID (정수), Contents (문자열), Writer (Writer)

        // 1. Board 배열 2개의 공간 생성

        // 2. Writer 3명 생성
        Writer[] writers = new Writer[3];
        writers [0] = new Writer("김준일", 1);
        writers [1] = new Writer("김준이", 2);
        writers [2] = new Writer("김준삼", 3);

        // 3. Comment 4개 생성
        Comment[][] comments = new Comment[2][];
        comments[0] = new Comment[3];
        comments[1] = new Comment[3];
        comments[0][0] = new Comment(01, "게시글1의 댓글1", writers[0]);
        comments[0][1] = new Comment(01, "게시글1의 댓글2", writers[0]);
        comments[0][2] = new Comment(01, "게시글1의 댓글3", writers[0]);
        comments[1][0] = new Comment(04, "게시글2의 댓글1", writers[1]);
        comments[1][1] = new Comment(05, "게시글2의 댓글2", writers[0]);
        comments[1][2] = new Comment(06, "게시글2의 댓글3", writers[2]);

        // 4. Board 2개 생성 ->
        Board[] boards = new Board[2];
        boards[1] = new Board(01, "1번 테스트 게시글", "1번 테스트 게시글 내용", writers[1], comments[0]);
        boards[2] = new Board(02, "2번 테스트 게시글", "2번 테스트 게시글 내용", writers[0], comments[1]);

        BoardPrintService boardPrintService = new BoardPrintService();
        boardPrintService.printInfoAll(boards);

    }
}

