package com.company;

public class Gugudan {
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
}
