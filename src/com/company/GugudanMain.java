package com.company;

public class GugudanMain {

    public static void main(String[] args) {
        int[] numberGugudan = new int[9];
        for (int number = 2; number < 10; number++){
            numberGugudan = Gugudan.get_gugudan(number);
            System.out.println();
            System.out.printf("%d단:",number);
            Gugudan.print_gugudan(numberGugudan);
        }
    }

}
