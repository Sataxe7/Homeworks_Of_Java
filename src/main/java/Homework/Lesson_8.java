    package Homework;

    import java.util.Scanner;


    public class Lesson_8 {
        public static void main(String[] args) {
            Scanner scannew = new Scanner(System.in);
            String nextLinefirst = "";
            while (nextLinefirst !="Exit") {
                System.out.println("You're welcome");
                System.out.println("Choose door to enter from 1 to 3 or write exit to exit from the game ");
                System.out.println("first door is blue");
                System.out.println("second door is orange");
                System.out.println("third door is red");
                String nextLine = scannew.nextLine();
                switch (nextLine) {
                    case "1","First":
                        System.out.println("You chose the door with diamonds. You're lucky!");
                        break;
                    case "2","Second":
                        System.out.println("You chose the door with a dragon. You have been killed. Bad day.");
                        break;
                    case "3","Third":
                        System.out.println("You chose the door with a princess and got married. Good luck!");
                        break;
                    case "Exit", "exit":
                        nextLinefirst="Exit";
                        System.out.println("Goodbye my friend");
                        break;
                        default:
                            System.out.println("Incorrect choice");
                    }
                    }
                    scannew.close();
                }
            }

