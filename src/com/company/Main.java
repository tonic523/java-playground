package com.company;

import java.util.Scanner;
import java.lang.Object;
public class Main {
    public static int[] get_gugudan(int number) {
        int[] result = new int[9];
        if (number < 2 || number > 9){
            return result;
        }
        for (int i = 1; i < 10; i++){
            result[i-1] = number * i;
        }
        return result;
    }

    public static void print_gugudan(int[] gugudan){
        for (int i = 0; i < 9; i++){
            System.out.printf("%d ",gugudan[i]);
        }
    }

    public static void main(String[] args) {
        int[] numberGugudan = new int[9];
        for (int number = 2; number < 10; number++){
            numberGugudan = get_gugudan(number);
            System.out.println();
            System.out.printf("%d단:",number);
            print_gugudan(numberGugudan);
        }
    }
}
