    package Homework.HW_12;


    import java.util.Scanner;

    public class Calculator {

        public static void Method(String[] args) {
            Calculator calculator = new Calculator();
            calculator.start();
        }

        public void start() {
            Scanner sc = new Scanner(System.in);
            System.out.println("WElcome to calculator ");
            System.out.println("Please select operation to proceed ");
            System.out.println("1.Addition");
            System.out.println("2. Substraction");
            System.out.println("3. Multipliying ");
            System.out.println("4. Division ");
            System.out.println("5. Square Root");
            System.out.println("6.Power of number");
            System.out.println("7. Find procent of number");
            int choice = sc.nextInt();
            double res = switchOfMethod(choice, sc);
            System.out.println("result" +" "+ res);
            sc.close();
        }

        public double switchOfMethod(int choice, Scanner sc) {
            double res = 0.0;
            switch (choice) {
                case 1:
                    res = perfomAdditon(sc);
                    break;
                case 2:
                    res = perfomSubstraction(sc);
                    break;
                case 3:
                    res = multipliying(sc);
                    break;
                case 4:
                    res = division(sc);
                    break;
                case 5:
                    res = squareRoot(sc);
                    break;
                case 6:
                    res = powerOfNumber(sc);
                    break;
                case 7:
                    res = procentOfNumber(sc);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            return  res;



        }
        public double perfomAdditon(Scanner sc) {

            System.out.println("Enter first number");
            double num1 = sc.nextDouble();
            System.out.println("Enter second number");
            double num2 = sc.nextDouble();
            return num1 + num2;
        }

        public double perfomSubstraction(Scanner sc) {
            System.out.println("enter first number");
            double num1 = sc.nextDouble();
            System.out.println("Enter second number");
            double num2 = sc.nextDouble();
            return num1 - num2;
        }

        public double multipliying(Scanner sc) {
            System.out.println("Enter first number");
            double num1 = sc.nextDouble();
            System.out.println("Enter second number");
            double num2 = sc.nextDouble();
            return num1 * num2;

        }

        public double division(Scanner sc) {
            System.out.println("Enter first number");
            double num1 = sc.nextDouble();
            System.out.println("Enter second number");
            double num2 = sc.nextDouble();
            return num1 / num2;

        }

        public double squareRoot(Scanner sc) {
            System.out.println("Enter number that need to find square root ");
            double num1 = sc.nextDouble();
            return Math.sqrt(num1);

        }

        public double powerOfNumber(Scanner sc) {
            System.out.println("Enter number that need find power of ");
            double num = sc.nextDouble();
            System.out.println("Enter that power need to be of number first");
            double num1 = sc.nextDouble();
            return Math.pow(num, num1);
        }

        public double procentOfNumber(Scanner sc) {
            System.out.println("Enter number ");
            double num = sc.nextDouble();
            System.out.println("Enter procent that need to find of number");
            double percentage = sc.nextDouble();
            if (num <= 0 || percentage < 0) {
                throw new IllegalArgumentException("Base should be more than 0 and percantage not be negative ");
            }
            return (num * percentage) / 100;

        }
    }
