package com.company;

import java.util.Scanner;

import calendar.Calendar;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calendar calendar = new Calendar();
        boolean isRun = true;
        String command;
        calendar.help();
        while(isRun){
            System.out.println("명령 (1, 2, 3, h, q)");
            System.out.print("> ");
            command = scanner.nextLine();
            switch (command){
                case "1":
                    System.out.println("일정 등록");
                    // 일정 등록 메소드
                    break;
                case "2":
                    System.out.println("일정 조회");
                    break;
                case "3":
                    calendar.getCalendar();
                    break;
                case "h":
                    calendar.help();
                    break;
                case "q":
                    isRun = false;
                    System.out.println("bye~");
                    break;
            }
        }
    }
}