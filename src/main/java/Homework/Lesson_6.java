package Homework;

import java.util.Scanner;

   public class Lesson_6 {
       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);

       /*    System.out.println("Enter first number" + " ");
           int number1 = scanner.nextInt();
           System.out.println("Enter second number" + " ");
           int number2 = scanner.nextInt();
           System.out.println("Your first number" + " " + number1);
           System.out.println("Your second number" + " " + number2);
       }
   }*/
          /* System.out.println("Введіть дійсне число: ");
           double number = scanner.nextDouble();

           double square = number * number;

           System.out.println("Квадрат введеного числа: " + square);
       }
   }
*/
           System.out.println("Enter first number: ");
           int number = scanner.nextInt();

           System.out.println("Enter second number: ");
           int number2 = scanner.nextInt();

           while (number <=0) {
               System.out.println("Please enter a number greater than 0: ");
               number = scanner.nextInt();
           }

           while (number2 <= 0) {
               System.out.println("Please enter a number greater than 0: ");
               number2 = scanner.nextInt();
           }

           System.out.println( (double) (number + number2) / 2);
       }
   }
