package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String text = "My name, is sasha. 20";
        for (int i = 0; i < text.length(); i++) {
            Character g = text.charAt(i);
            int d = g.hashCode(g);
            if( d >= 48 && d <= 57 ||
                d >= 65 && d <= 90 ||
                d >= 97 && d <= 120){
                System.out.print(g);
            }


        }

    }
}