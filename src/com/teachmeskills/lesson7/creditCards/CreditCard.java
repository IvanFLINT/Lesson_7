package com.teachmeskills.lesson7.creditCards;

import java.util.Scanner;


public class CreditCard {
    String accountNumber;
    int amountOnAccount;

    CreditCard(String accountNumber, int amountOnAccount) {
        this.accountNumber = accountNumber;
        this.amountOnAccount = amountOnAccount;
    }

    public static void info(CreditCard v){
        System.out.println("Номер счета: " + v.accountNumber + " Сумма на счете: " + v.amountOnAccount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CreditCard cc1 = new CreditCard("BS4576846D", 100);
        CreditCard cc2 = new CreditCard ("DC4574722G", 345);
        CreditCard cc3 = new CreditCard ("BG4746322V", 167);
        SumDecrease sd1 = new SumDecrease();
        System.out.println("Номер счета №1: " + cc1.accountNumber + " Текущий счет: " + cc1.amountOnAccount);
        System.out.println("Номер счета №2: " + cc2.accountNumber + " Текущий счет: " + cc2.amountOnAccount);
        System.out.println("Номер счета №3: " + cc3.accountNumber + " Текущий счет: " + cc3.amountOnAccount);

        int number = 0;
        int check = 0;
        do {
            System.out.println("Выбирите номер счета с которым хотите работать №1 - 1 , №2 - 2 , №3 - 3");
            number = sc.nextInt();
            System.out.println("Увеличить счет '1' , Уменьшить счет '2' " +
                    ", Информация о карте '3' , Закончить операции '4' .");
            check = sc.nextInt();
        switch (number){
            case 1: switch (check) {
                    case 1: sd1.sum(cc1); break;
                    case 2: sd1.decrease(cc1); break;
                    case 3: info(cc1); break;
                    default: break;
                    } break;
            case 2: switch (check) {
                    case 1: sd1.sum(cc2); break;
                    case 2: sd1.decrease(cc2); break;
                    case 3: info(cc2); break;
                    default: break;
                    } break;
            case 3: switch (check) {
                    case 1: sd1.sum(cc3); break;
                    case 2: sd1.decrease(cc3); break;
                    case 3: info(cc3); break;
                    default: break;
                    } break;
            default: System.out.println("Такой лицевой счет отсутствует"); break;
            }
        } while (check <= 3);
        sc.close();
    }
}
