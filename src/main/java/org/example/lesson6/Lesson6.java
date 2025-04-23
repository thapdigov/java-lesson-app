package org.example.lesson6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the student1 age: ");
        int t1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the student1 name: ");
        String name1 = scanner.nextLine();

        System.out.print("Enter the student2 age: ");
        int t2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the student2 name: ");
        String name2 = scanner.nextLine();

        System.out.printf("Student 1 -> name %s , age %d | Student 2 -> name %s , age %d ", name1, t1, name2, t2);

        scanner.close();


    }
}
