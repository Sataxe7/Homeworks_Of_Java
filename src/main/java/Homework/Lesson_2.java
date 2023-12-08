package Homework;

public class Lesson_2 {
    public static void main(String[] args) {
        // Task 1: Calculate the sum of two numbers and print it
        int num1 = 5;
        int num2 = 7;
        int sum = num1 + num2;
        System.out.println("Sum of two numbers: " + sum);

        // Task 2: Find the average of three numbers and print it
        int num3 = 10;
        double average = (num1 + num2 + num3) / 3.0;
        System.out.println("Average of three numbers: " + average);

        // Task 3: Calculate the remainder of dividing one number by another and print it
        int dividend = 15;
        int divisor = 4;
        int remainder = dividend % divisor;
        System.out.println("Remainder of division: " + remainder);

        // Task 4: Increase the value of a variable by 1 using increment and print it
        int incrementValue = 8;
        incrementValue++;
        System.out.println("Increased value: " + incrementValue);

        // Task 5: Multiply an integer by 1.5 and print the result as a floating-point number
        int intValue = 6;
        double multipliedValue = intValue * 1.5;
        System.out.println("Result of multiplication by 1.5: " + multipliedValue);

        // Task 6: Calculate the value of an expression using parentheses
        int result = (2 + 3) * (4 - 1);
        System.out.println("Result of expression with parentheses: " + result);
    }
}