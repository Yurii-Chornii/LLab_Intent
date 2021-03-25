package com.project;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Front front = new Front();


        try {
            front.consoleDialog();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
