package Homework;

import java.util.Scanner;

public class Lesson_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int computerChoiceNumber;
        String computerChoice = "";
        String yourChoose;
        do {
            System.out.println("Choose papier,stone or scissors");
            yourChoose = sc.nextLine().toLowerCase();
            if (yourChoose.equals("stone") || yourChoose.equals("papier") || yourChoose.equals("scissors")) {
                break;
            } else {
                System.out.println("Incorrect value ");
            }
        } while (true);
        int computerRandom = (int) (Math.random() * 3);
        if (computerRandom == 0) {
            computerChoice = "stone";
            computerChoiceNumber = computerRandom;
            System.out.println("Computer have chosen  stone");
        } else if (computerRandom == 1) {
            computerChoice = "scissors";
            System.out.println("Computer has chosen scissors");
            computerChoiceNumber = computerRandom;
        } else if (computerRandom == 2) {
            computerChoice = "papier";
            System.out.println("Computer has chosen papier");
            computerChoiceNumber = computerRandom;
        } else {
            System.out.println("incorrect value try again");
            return;
        }
        if (yourChoose.equals("papier") && computerChoice.equals("papier") || yourChoose.equals("stone") && computerChoice.equals("stone") || yourChoose.equals("scissors") && computerChoice.equals("scissors")) {
            System.out.println("nichya");
        } else if (yourChoose.equals("stone") && computerChoice.equals("scissors") || yourChoose.equals("scissors") && computerChoice.equals("papier") || yourChoose.equals("papier") && computerChoice.equals("stone")) {
            System.out.println("you win");
        } else if (yourChoose.equals("papier") && computerChoice.equals("scissors") || yourChoose.equals("stone") && computerChoice.equals("papier") || yourChoose.equals("scissors") && computerChoice.equals("stone")) {
            System.out.println("you Loose");
        } else {
            System.out.println("incorrect value try again");
        }
        System.out.println(" computerChoiceNumber " + computerChoiceNumber);
    }
}
