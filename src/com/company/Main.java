package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] numberGugudan = new int[9];
        for (int number = 2; number < 10; number++){
            for (int i = 1; i < numberGugudan.length; i++){
                numberGugudan[i] = number * i;
            }
            System.out.println();
            System.out.printf("%d단:",number);
            for (int i = 1; i < numberGugudan.length; i++){
                System.out.printf("%d ", numberGugudan[i]);
            }
        }
    }
}
