package com.company;

public class Gugudan {

    public static void print(int number, int number2){
        for (int i = 1; i <= number; i++){
            for (int j = 1; j <= number2; j++){
                System.out.printf("%d * %d = %d\n",i,j,i*j);
            }
        }
    }
}
