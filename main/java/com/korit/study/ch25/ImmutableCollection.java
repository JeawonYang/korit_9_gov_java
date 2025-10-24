package com.korit.study.ch25;

import com.korit.study.ch24.Board;
import com.korit.study.ch24.Comment;
import com.korit.study.ch24.Writer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// 불변 컬렉션
public class ImmutableCollection {
    public static void main(String[] args) {
        List<String> ilist = List.of("김준일", "김준이");
        System.out.println(ilist);
        Map<String, List<String>> iMap = Map.of(
                "k1", List.of("김준일", "김준이"),
                "k2", List.of("김준삼", "김준사"),
                "k3", List.of("김준오", "김준육"),
                "k4", List.of("김준칠", "김준팔", "김준구")
        );
        List<Board>boards = new ArrayList<>();
        boards.add(new Board("제목 1", new Writer("김준일", 32),
                "내용 1",
                List.of(
                        new Comment(new Writer("김준이", 32),"댓글 1"),
                        new Comment(new Writer("김준삼", 32),"댓글 2")
                )));
        System.out.println(iMap);
        System.out.println(boards);
    }
}
//제가뭘잘못햇는데요
//뭘잘못햇냐고
//머리색이나까맣게핫세요할아버지같음ㅁ