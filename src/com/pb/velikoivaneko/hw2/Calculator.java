package com.pb.velikoivaneko.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //    char num = 'A';
        int X;
        int Y;
//        String symbol;
        System.out.print("Введите первое число");
        X = scan.nextInt();

        System.out.print("Введите второе число");
        Y = scan.nextInt();
//        {
//
//        }
//        symbol = scan.next();
//        {
        System.out.print("Выбрать действие (+ - * /)?");
        //}
        String sign = scan.next(); // + - * /

        switch (sign) {
            case "+": System.out.println(+(X + Y));
                break;
            case "-": System.out.println(+(X - Y));
                break;
            case "*": System.out.println(+(X * Y));
                break;
            case "/":
                if (Y == 0) { System.out.println("Не верно, на 0 нельзя /");}
             else System.out.println(+(X / Y));
                break;
            default: {
                System.out.println("Неверная операция");
            }
        }
    }
}
