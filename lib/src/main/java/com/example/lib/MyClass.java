package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Second:");
        int input = scanner.nextInt();
        int hour = input / 3600;
        int min = input / 60;
        int sec = input % 60;
        if(hour>=24)
            hour=hour%3600;
        if(min>=61);
        min=min%60;
        System.out.println(+hour + "hr" + min + "min" + sec+ "sec");
    }
}