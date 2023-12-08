package Homework;

import java.util.Random;
import java.util.Scanner;

public class HW_9 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int[] numbers = {1, 2, 3, 4, 5};
        int secret = numbers[random.nextInt(numbers.length)];


        System.out.println("guess the number beetween 1 to 5");
        int guess;
        int attempts = 0;
        while (true) {
            try {
                guess = sc.nextInt();
                attempts++;

                if (guess == secret) {
                    System.out.println("congratulations you win");
                    System.out.println("your attempts was " + attempts);
                    System.out.println("do you wanna play again? (y/n)");
                    String answer = sc.next().toLowerCase();

                    while (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n")) {
                        System.out.println("Incorrect answer. Please enter 'y' or 'n':");
                        answer = sc.next();
                    }
                    if (answer.equalsIgnoreCase("y")) {
                        secret = numbers[random.nextInt(numbers.length)];
                        System.out.println("Guess the number between 1 to 5 ");
                        attempts = 0;
                    } else if (answer.equalsIgnoreCase("n")) {
                        break;
                    } else {
                        System.out.println("incorrect value enter 'y' or 'n':");
                        sc.nextLine();
                    }
                } else if (guess < secret) {
                    System.out.println("number is bigger");
                } else if (guess > secret) {
                    System.out.println("number is less");
                } else {
                    System.out.println("wrong,try again");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input.Please enter a number between 1 to 5");
                sc.next();
            }

        }
        sc.close();
    }
}

