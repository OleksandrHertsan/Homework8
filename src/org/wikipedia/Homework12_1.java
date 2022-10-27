package org.wikipedia;

import java.util.Scanner;

public class Homework12_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        int percent = scanner.nextInt();
        int years = scanner.nextInt();
        for (int i = 0; i < years ; i++) {
            money = money + (money * percent / 100);
                System.out.println(money);
            }

        }




    }

