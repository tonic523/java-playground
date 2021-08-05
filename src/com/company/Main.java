package com.company;

import java.util.Scanner;

import calendar.Calendar;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("달을 입력하세요.");
        String inValue = scanner.nextLine();
        Calendar calendar = new Calendar();
        int month = Integer.parseInt(inValue);
        int days = calendar.getDays(month);
        System.out.printf("%d월은 %d까지 있습니다.",month,days);
        scanner.close();
    }
}