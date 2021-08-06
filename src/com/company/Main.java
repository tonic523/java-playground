package com.company;

import java.util.Scanner;

import calendar.Calendar;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calendar calendar = new Calendar();

        System.out.println("반복 횟수를 입력하세요.");
        int time = scanner.nextInt();
        System.out.println("월을 입력하세요.");
        int[] months = new int[time];

        for (int i = 0; i < time; i++){
            int month = scanner.nextInt();
            months[i] = month;
        }
        for (int month : months){
            System.out.printf("%d월은 %d일까지 있습니다.\n",month,calendar.getDays(month));
        }
        scanner.close();
    }
}