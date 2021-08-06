package com.company;

import java.util.Scanner;

import calendar.Calendar;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calendar calendar = new Calendar();
        while(true){
            System.out.println("연도와 월을 입력하세요.");
            String input = scanner.nextLine();
            if (input == "-1"){
                System.out.println("Have a nice day!");
                break;
            }
            String[] year_month = input.split(" ");
            int year = Integer.parseInt(year_month[0]);
            int month = Integer.parseInt(year_month[1]);
            calendar.print(calendar.getDays(year, month));
        }
        scanner.close();
    }
}