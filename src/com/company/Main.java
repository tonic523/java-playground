package com.company;

import java.util.Scanner;

import calendar.Sum;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("두 수를 입력하세요.");
        String inValue = scanner.nextLine();
        String[] arrValue = inValue.split(" ");
        Sum sum = new Sum(arrValue);
        sum.print();
        scanner.close();
    }
}