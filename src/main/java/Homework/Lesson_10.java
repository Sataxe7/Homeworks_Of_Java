package Homework;

import java.util.Random;
import java.util.Scanner;

public class Lesson_10 {
    public static void main(String[] args) {

        String[] locations = {"forest", "beach", "cave", "desert",};
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int randomIndexOfLocation = rand.nextInt(locations.length);
        String randomLocation = locations[randomIndexOfLocation];
        System.out.println("Location: " + randomLocation);
        System.out.println("Choose actions to do: 'return' or 'go next'");
        String yourChooseIs = sc.nextLine().toLowerCase();
        switch (yourChooseIs) {
            case "return":
                System.out.println("Returning to choose a new location.");
                System.out.println("Location: " + randomLocation);
                System.out.println("Choose actions to do: return or go next");
                break;
            case "go next":
                String randomActionsOfForest;
                if (randomLocation.equals("cave")) {
                    String[] actionsOfCave = {"Appear of dragon", "You find a lot of gold", "The cave was buried you died"};
                    int randomIndexOfCave = rand.nextInt(actionsOfCave.length);
                    String randomActionsOfCave = actionsOfCave[randomIndexOfCave];
                    System.out.println("Action in the cave: " + randomActionsOfCave);

                    switch (randomActionsOfCave) {
                        case "Appear of dragon":
                            System.out.println("Choose what to do: run away,attack dragon");
                            String сaveAction = sc.nextLine().toLowerCase();
                            switch (сaveAction) {
                                case "run away":
                                    System.out.println("You successfully ran away. End of the game");
                                    break;
                                case "attack dragon":
                                    System.out.println("You decided to attack the dragon. You died");
                                    break;
                                default:
                                    System.out.println("Invalid action0");
                                    break;
                            }
                            break;
                    }
                } else if (randomLocation.equals("forest")) {
                    String[] actionsOfForest = {"You has been attacked by bandits, they ask you for money", "You noticed chest, Do you wanna open it?"};
                    int randomIndexOfForest = rand.nextInt(actionsOfForest.length);
                    randomActionsOfForest = actionsOfForest[randomIndexOfForest];
                    System.out.println("Action in the forest: " + randomActionsOfForest);

                    switch (randomActionsOfForest) {
                        case "You has been attacked by bandits, they ask you for money":
                            System.out.println("Choose what to do: attack them, 'pay money'");
                            String yourChoose = sc.nextLine().toLowerCase();

                            switch (yourChoose) {
                                case "attack them":
                                    System.out.println("You decided to attack them. You killed them");
                                    break;
                                case "pay money":
                                    System.out.println("You have been killed");
                                    break;

                                default:
                                    System.out.println("Invalid action2");
                                    break;
                            }
                            break;
                        case "You noticed chest, Do you wanna open it?":
                            String chose = sc.nextLine().toLowerCase();
                            switch (chose) {
                                case "yes":
                                    System.out.println("It was a trap wth poison you died");
                                    break;
                                case "no":
                                    System.out.println("You saved your life cause it was trap with poison");
                                    break;
                                default:
                                    System.out.println("Invalid action1");
                                    break;
                            }
                            break;
                    }
                } else if (randomLocation.equals("beach")) {
                    String[] actionOfBeach = {"Meeting with a local Fisherman", "Rescuing Marine Life", "Sunrise Meditation"};
                    int randomIndexOfBeach = rand.nextInt(actionOfBeach.length);
                    String randomActionOfBeach = actionOfBeach[randomIndexOfBeach];

                    switch (randomActionOfBeach) {
                        case "Meeting with a local Fisherman":
                            System.out.println("On the shore, you come across an old local fisherman who shares an exciting story about his sea adventures. He suggests exchanging fishing experiences.");
                            int salmonProbability = 10;
                            int flounderProbability = 60;
                            int tunaProbability = 30;
                            int anchovy = 80;
                            int randomValue = rand.nextInt(100) + 1;

                            if (randomValue <= salmonProbability) {
                                System.out.println(randomValue + "roll" + " Congratulations,you caught a salmon ");
                                break;
                            } else if (randomValue <= flounderProbability) {
                                System.out.println(randomValue + "random value" + " Congratulations you caught a flounder ");
                                break;
                            } else if (randomValue <= anchovy) {
                                System.out.println(randomValue + " Random value " + " Congratulations you caught an anchovy ");
                                break;
                            } else if (randomValue <= tunaProbability) {
                                System.out.println(randomValue + " Random value " + " Congratulations you caught an tuna ");
                            } else {
                                System.out.println(randomValue + "roll" + "unfortunately you didn't caught anything :( ");
                                break;
                            }

                        case "Sunrise Meditation":
                            System.out.println("Early in the morning, a meditation session led by a local guru takes place on the beach. Players can join the session and gain bonuses for their spiritual well-being.");
                            System.out.println("You participated in Sunrise meditation.You increased your agility to 10 points ");
                            break;


                        case "Rescuing Marine Life":
                            System.out.println("Players notice that small marine creatures are washed ashore. They must decide how to help them—either return them to the sea or hand them over to local wildlife experts.");
                            System.out.println("Return to sea or hand them over?");
                            String choseOfMarine = sc.nextLine().toLowerCase();
                            switch (choseOfMarine) {
                                case "return to sea":
                                    System.out.println("You rescued them.Good job.Now they save");
                                    break;
                                case "hand them over":
                                    System.out.println("You handed them over to local wildfire.They say it's very rare things and they give you 1000$ dollars. You rescued them and earn money.Congrats :)");
                                    break;
                                default:
                                    System.out.println("Invalid action");
                                    break;
                            }
                            break;
                    }
                } else if (randomLocation.equals("desert")) {
                    String actionOfDesert[] = {"Sandstorm", "Lost Caravan", "Mirage"};
                    int randomIndexOfDesert = rand.nextInt(actionOfDesert.length);
                    String randomOfDesert = actionOfDesert[randomIndexOfDesert];

                    switch (randomOfDesert) {
                        case "Sandstorm":
                            System.out.println("You encounter a sudden sandstorm.Decide whether to stop and take cover or continue moving,risking the loss of orientation");
                            System.out.println("'Attempt to orient by the stars','Attempt to find shelter in the sands' or 'Use navigation tools'");
                            String choseOfAction = sc.nextLine().toLowerCase();
                            switch (choseOfAction) {
                                case "attempt to orient by the stars":
                                    String[] possibleOutcomes = {"The player successfully orients themselves and avoids getting lost", "Sand clouds obstruct visibility, and the player loses orientation"};
                                    int randomIndexOfOutcomes = rand.nextInt(possibleOutcomes.length);
                                    String outComes = possibleOutcomes[randomIndexOfOutcomes];
                                    System.out.println(outComes);
                                    break;

                                case "attempt to find shelter in the sands":
                                    String[] possible = {"The player finds shelter and avoids significant losses", "No shelter is found, and the player loses time, energy, or resources."};
                                    int randomIndexOfPossible = rand.nextInt(possible.length);
                                    String outComesTwo = possible[randomIndexOfPossible];
                                    System.out.println(outComesTwo);
                                    break;

                                case "use navigation tools":
                                    String[] possibleTwo = {"The player successfully uses the tools, avoiding the loss of orientation", "The tools fail, and the player partially loses orientation"};
                                    int randomIndex = rand.nextInt(possibleTwo.length);
                                    String result = possibleTwo[randomIndex];
                                    System.out.println(result);
                                    break;

                            }
                            break;
                        case "Lost Caravan":
                            System.out.println("You come across a lost caravan");
                            System.out.println("Choose to go with them, or bypass them.");
                            String answer = sc.nextLine().toLowerCase();
                            String resultOfPossibleOutComesThird = "";

                            switch (answer) {
                                case "choose to go with them":
                                    String[] possibleOutComesThird = {"The caravan welcomes the player, offering safety and shared resources", "The caravan turns out to be untrustworthy, leading to conflicts and kill you"};
                                    int indexThird = rand.nextInt(possibleOutComesThird.length);
                                    resultOfPossibleOutComesThird = possibleOutComesThird[indexThird];
                                    System.out.println(resultOfPossibleOutComesThird);
                                    String x = "";
                                    break;

                                default:
                                    System.out.println("invalid input1");
                                    break;
                                case "bypass them":
                                    String[] possibleOutComesByPass = {"The player successfully bypasses the caravan without any issues", "The caravan turns out to be untrustworthy, leading to conflicts and kill you"};
                                    int indexOfPossibleOutComesByPass = rand.nextInt(possibleOutComesByPass.length);
                                    String resultOfPossibleOutComesByPass = possibleOutComesByPass[indexOfPossibleOutComesByPass];
                                    System.out.println(resultOfPossibleOutComesByPass);

                            }
                            break;

                        case "Mirage":
                            System.out.println("You see a vision of water in the distance. Decide whether to follow the mirage or be cautious and continue the journey");
                            System.out.println("Follow the mirage or  continue the journey?");
                            String answerOfMirage = sc.nextLine().toLowerCase();

                            switch (answerOfMirage) {
                                case "follow the mirage":
                                    String[] possibleOutComesMirage = {"The mirage leads to a hidden oasis, providing water and resources", "The mirage was deceptive, leading the player further into the desert, causing exhaustion and dehydration"};
                                    int indexOfPossibleOutComesMirage = rand.nextInt(possibleOutComesMirage.length);
                                    String resultOfMirage = possibleOutComesMirage[indexOfPossibleOutComesMirage];
                                    System.out.println(resultOfMirage);
                                    break;

                                default:
                                    System.out.println("invalid input1");
                                    break;

                                case "continue the journey":
                                    String[] possibleOutComesContinueTheJourney = {"The player avoids potential dangers associated with the mirage and continues the journey safely", "The mirage was real, and by being cautious, the player misses the opportunity to discover the oasis"};
                                    int indexOfPossibleOutComescontinueTheJourney = rand.nextInt(possibleOutComesContinueTheJourney.length);
                                    String outComesContinueTheJourney = possibleOutComesContinueTheJourney[indexOfPossibleOutComescontinueTheJourney];
                                    System.out.println(outComesContinueTheJourney);
                                    break;
                            }
                    }
                }


        }
    }

}