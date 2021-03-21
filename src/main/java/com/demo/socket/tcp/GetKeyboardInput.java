package com.demo.socket.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetKeyboardInput {

    public static String getInputString() {
        BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
        String readline = null;
        try {
            readline = sin.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return readline;
    }
}
