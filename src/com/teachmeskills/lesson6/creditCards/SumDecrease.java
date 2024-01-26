package com.teachmeskills.lesson6.creditCards;

import java.util.Scanner;

public class SumDecrease {
    public int sum(CreditCard input){
        Scanner sc = new Scanner(System.in);
        System.out.print("На сколько Вы хотите увеличить сумму счета?: ");
        int b = sc.nextInt();
        input.amountOnAccount+=b;
        System.out.print("Сумма текущего счета составляет: ");
        System.out.println(input.amountOnAccount);
        return input.amountOnAccount;
    }
    public int decrease(CreditCard input){
        Scanner sc = new Scanner(System.in);
        System.out.print("На сколько Вы хотите уменьшить сумму счета?: ");
        int b = sc.nextInt();
        input.amountOnAccount-=b;
        System.out.print("Сумма текущего счета составляет: ");
        System.out.println(input.amountOnAccount);
        return input.amountOnAccount;
    }
}
