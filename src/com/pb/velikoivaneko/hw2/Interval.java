package com.pb.velikoivaneko.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        System.out.print("Введите число от 1 до 100:  ");
        x = scan.nextInt();
        if (x == 1 || x < 101 || x < 1 || x >= 101) {
            if (x >= 1 && x <= 14) {
                System.out.print("Диапазон 1-14");
            } else if (x >= 15 && x <= 35) {
                System.out.print("Диапазон 15-35");
            } else if (x >= 36 && x <= 50) {
                System.out.print("Диапазон 36-50");
            } else if (x >= 51 && x <= 100) {
                System.out.print("Диапазон 51-100");
            }
              else if (x < 1 || x >= 101) {
                  System.out.println("вне диапазона 1-100");
            }

        }
    }
}