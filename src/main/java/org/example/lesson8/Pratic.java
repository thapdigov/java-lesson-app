package org.example.lesson8;

import java.util.Scanner;

public class Pratic {

    //  1. Calculator APP
    //  2. Consol oyunu

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("1 ve 10 arasinda texmininizi yazin: ");
        int texmin = scanner.nextInt();
        int random = (int) (Math.random() * 10);

        int say = 1;

        while (texmin != random) {
            if (texmin > random) {
                System.out.println("Daha kicik eded daxil edin");
            } else {
                System.out.println("Daha boyuk eded daxil edin");
            }
            texmin = scanner.nextInt();
            say++;
        }

        System.out.println("Siz oyunu " + say + "-da qazandiniz ");


    }
}
