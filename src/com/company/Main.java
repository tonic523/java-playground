package com.company;

import java.util.Scanner;

import calendar.Calendar;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calendar calendar = new Calendar();
        while(true){
            System.out.println("연도를 입력하세요.(-1 입력시 종료)");
            System.out.print("YEAR> ");
            int year = Integer.parseInt(scanner.next());
            if (year == -1){
                System.out.println("Have a nice day!");
                break;
            }
            System.out.println("달를 입력하세요.");
            System.out.print("MONTH> ");
            int month = Integer.parseInt(scanner.next());

            System.out.println("첫번째 요일을 입력하세요.(SU, MO, TU, WE, TH, FR, SA)");
            System.out.print("WEEKDAY> ");
            String weekday = scanner.next();
            String buffer = scanner.nextLine();
            calendar.print(calendar.getDays(year, month), weekday);
        }
        scanner.close();
    }
}