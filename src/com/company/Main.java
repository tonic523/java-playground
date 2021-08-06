package com.company;

import java.util.Scanner;

import calendar.Calendar;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("달을 입력하세요.");
        int inValue = scanner.nextInt();
        Calendar calendar = new Calendar();
        int month = inValue;
        int days = calendar.getDays(month);
        if (days == 0){
            System.out.println("잘못된 입력입니다.");
        }else {
            System.out.printf("%d월은 %d까지 있습니다.\n",month,days);
        }
        calendar.print();
        scanner.close();
    }
}