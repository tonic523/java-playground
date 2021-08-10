package com.company;

import java.util.Scanner;

import calendar.Calendar;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calendar calendar = new Calendar();
        boolean isRun = true;
        while(isRun){
            isRun = calendar.promptPrint();
        }
        scanner.close();
    }
}