package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 2 || number > 9){
            System.out.println("2이상, 9이하의 값만 입력할 수 있습니다.");
        }else {
            for (int i = 1; i < 10; i++) {
                System.out.printf("%d * %d = %d\n", number, i, number * i);
            }
        }
    }
}
