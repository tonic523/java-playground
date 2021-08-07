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
            }else if (year < 1970){
                System.out.println("연도를 잘못 입력하셨습니다.");
                continue;
            }else
            System.out.println("월을 입력하세요.");
            System.out.print("MONTH> ");
            int month = Integer.parseInt(scanner.next());
            if (month < 1 | month > 12){
                System.out.println("월을 잘못 입력하셨습니다.");
                continue;
            }
            String buffer = scanner.nextLine();

            calendar.print(year, month);
        }
        scanner.close();
    }
}