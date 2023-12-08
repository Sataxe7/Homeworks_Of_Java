package Homework;

public class Lesson_3 {
    public static void main(String[] args) {
        // Task  1:
        double doubleNumber = 10.5;
        int intNumber = (int) doubleNumber;

        System.out.println("Double type " + doubleNumber);
        System.out.println("Convert to int: " + intNumber);

        // Task 2:
        int num1 = 5;
        int num2 = 10;
        double average = (num1 + num2) / 2.0;

        System.out.printf("Middle value  %.2f%n", average);
    }
}