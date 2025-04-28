package org.example.lesson7;

import java.util.Scanner;

public class Lesson7 {

    public static void main(String[] args) {


        // CONTROL FLOW


        //  if   |   switch  |  for  | while | do while

//        System.out.println("1");
//        System.out.println("2");
//        System.out.println("3");
//        System.out.println("4");
//        System.out.println("5");
//        System.out.println("6");
//        System.out.println("7");
//        System.out.println("8");
//        System.out.println("9");
//        System.out.println("10");


//        int a = 10;
//
//        do {
//            System.out.println("Hello World");
//        } while (a > 10);

//        int sum = 0;
//
//        int b = 100;
//
//        while (b > 0) {
//            sum = sum + b;
//            b--;
//        }
//        System.out.println("Sum:" + sum);


//        for (int i = 0; i <= 100; i++) {
//            sum = sum + i;
//
//        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the student grade: ");
        int grade = scanner.nextInt();

        if (grade > 100 || grade < 0) {
            System.out.println("Imtahan balini duzgun daxil edin!");
        } else if (grade > 90) {
            System.out.println("Sizin imtahan neticeniz: A");
        } else if (grade > 80 && grade <= 90) {
            System.out.println("Sizin imtahan neticeniz: B");
        } else if (grade > 70 && grade <= 80) {
            System.out.println("Sizin imtahan neticeniz: C");
        } else if (grade > 60 && grade <= 70) {
            System.out.println("Sizin imtahan neticeniz: D");
        } else if (grade > 50 && grade <= 60) {
            System.out.println("Sizin imtahan neticeniz: E");
        } else {
            System.out.println("Siz imtahandan kesilmisiniz!");
        }


//        if (day == 1) {
//            System.out.println("Bu gün 1-ci gündür");
//        } else if (day == 2) {
//            System.out.println("Bu gün 2-cü gündür");
//        } else if (day == 3) {
//            System.out.println("Bu gün 3-cü gündür");
//        } else if (day == 4) {
//            System.out.println("Bu gün 4-cü gündür");
//        } else {
//            System.out.println("Heftenin günü düz deyil");
//        }


//        String month = "mart";
//
//        switch (month) {
//            case "Yanvar":
//                System.out.println("Bu 1-ci aydir");
//                break;
//            case "Fevral":
//                System.out.println("Bu 2-ci aydir");
//                break;
//            case "Mart":
//                System.out.println("Bu 3-ci aydir");
//                break;
//            case "Aprel":
//                System.out.println("Bu 4-ci aydir");
//                break;
//            default:
//                System.out.println("Ay dogru deyil");
//        }


    }
}
