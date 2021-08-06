package com.company;

import java.util.Scanner;

import calendar.Calendar;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calendar calendar = new Calendar();
        int month;
        while(true){
            System.out.println("월을 입력하세요.");
            month = scanner.nextInt();
            if (month == -1){
                System.out.println("Have a nice day!");
                break;
            }
            scanner.nextLine();
            System.out.printf("%d월은 %d일까지 있습니다.\n",month,calendar.getDays(month));
        }
        scanner.close();
    }
}