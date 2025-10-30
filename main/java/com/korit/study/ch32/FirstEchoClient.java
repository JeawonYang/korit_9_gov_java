package com.korit.study.ch32;

import java.io.IOException;
import java.net.Socket;

public class FirstEchoClient {
    public static void main(String[] args) {
        final String SERVER_ADDRESS = "localhost";
        final int SERVER_PORT = 5000;

        try {
            Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
            System.out.println("서버 접속 완료");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

