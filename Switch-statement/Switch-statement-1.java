// Write a program that reads a string from the standard input and outputs the number. A number can be from 1 to 9 (inclusive).
//
// Sample Input 1:
// one
// Sample Output 1:
// 1

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String number = input.nextLine();
        switch (number) {
            case "one":
                System.out.println("1");
                break;
            case "two":
                System.out.println("2");
                break;
            case "three":
                System.out.println("3");
                break;
            case "four":
                System.out.println("4");
                break;
            case "five":
                System.out.println("5");
                break;
            case "six":
                System.out.println("6");
                break;
            case "seven":
                System.out.println("7");
                break;
            case "eight":
                System.out.println("8");
                break;
            default:
                System.out.println("9");
                break;
        }
    }
}
