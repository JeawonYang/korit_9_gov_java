package com.korit.study.ch32;

import java.io.*;
import java.util.*;

public class StudentFileMain {
    public static void main(String[] args) {
        final String FILE_NAME = "Student.txt";

        try {
            // 1️⃣ 파일 읽기
            FileReader fileReader = new FileReader(FILE_NAME);
            StringBuilder builder = new StringBuilder();
            while (true) {
                int readData = fileReader.read();
                if (readData == -1) break;
                builder.append((char) readData);
            }
            fileReader.close();

            // 2️⃣ 수정할 데이터 정의
            Map<String, String> modifyDataMap = Map.of(
                    "이름", "김준이",
                    "나이", "33"
            );

            // 3️⃣ 파일 내용 한 줄씩 분리
            List<String> readLineList = new ArrayList<>(Arrays.asList(builder.toString().split("\n")));

            // 4️⃣ 수정된 내용 적용 후 파일 다시 쓰기
            FileWriter fileWriter = new FileWriter(FILE_NAME, false); // 덮어쓰기 모드

            readLineList.stream()
                    .map(line -> {
                        // 각 줄을 수정할 수 있도록 처리
                        String modifiedLine = line;
                        for (Map.Entry<String, String> entry : modifyDataMap.entrySet()) {
                            if (modifiedLine.contains(entry.getKey())) {
                                modifiedLine = String.format("%s : %s", entry.getKey(), entry.getValue());
                            }
                        }
                        return modifiedLine;
                    })
                    .forEach(modifiedLine -> {
                        try {
                            fileWriter.write(modifiedLine + "\n");
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });

            fileWriter.close();
            System.out.println("파일 수정 완료!");

        } catch (FileNotFoundException e) {
            System.out.println("파일 못 찾았어요 ㅠㅠ 뿌엥");
        } catch (IOException e) {
            System.out.println("파일을 읽거나 쓰는 중 오류 발생 ㅠㅠ");
        }
    }
}