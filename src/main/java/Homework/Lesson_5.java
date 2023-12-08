package Homework;

import java.util.Scanner;

public class Lesson_5 {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Hi";
        String res = str1.concat(" ".concat(str2));
        System.out.println(res + " Result ");
        plus();
        plus1();
        plus2();
        plus3();
    }

    public static void plus() {
        String str1 = "Java";
        String str2 = " The best ";
        System.out.println(str1 + str2 + " Result  ");


    }

    public static void plus1() {
        String[] words = {"Hello", "World", "Yes", "No","\n","Way"};
        String f = String.join(" ", words);
        System.out.println(f);

    }
    public static void plus2() {
    StringBuilder sb= new StringBuilder();
    sb.append("Yes");
    sb.append("No");
    sb.append("Fick");
    sb.append("Hi");
    String result= sb.toString();
    System.out.println(result);

    }

    public static void plus3() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input lines");
    StringBuilder input = new StringBuilder();

    String line;
    while(!(line=scanner.nextLine()).isEmpty()) {
        input.append(line).append("\n");
    }
        System.out.println("Ви ввели " + input);
    }
    }
