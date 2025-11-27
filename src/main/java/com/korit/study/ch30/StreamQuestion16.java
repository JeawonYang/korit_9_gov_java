package com.korit.study.ch30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamQuestion16 {
    public static void main(String[] args) {
        List<String> filePaths = Arrays.asList(
                "/home/user/documents/report.pdf",
                "/var/log/system.log",
                "C:\\Users\\Admin\\Desktop\\image.jpg",
                "/downloads/music.mp3"
        );
        List<String> filename = filePaths.stream()
                .map(filePath -> filePath.substring(filePath.lastIndexOf("/") + 1))
                .map(filePath -> filePath.substring(filePath.lastIndexOf("\\") + 1))
                .collect(Collectors.toList());
        System.out.println(filename);

    }
}
