package Homework;

import java.util.Scanner;

public class Lesson_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1: Finding the Maximum Number
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        int maxNumber = (num1 > num2) ? num1 : num2;
        System.out.println("Task 1: The maximum number is: " + maxNumber);

        // Task 2: Calculator for Exponentiation
        System.out.print("Enter the base number: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        double result = Math.pow(base, exponent);
        System.out.println("Task 2: Result of " + base + " raised to the power of " + exponent + " is: " + result);

        // Task 3: Calculating Age
        System.out.print("Enter the birth year: ");
        int birthYear = scanner.nextInt();

        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();

        int age = currentYear - birthYear;
        System.out.println("Task 3: The age is: " + age);
    }
}
