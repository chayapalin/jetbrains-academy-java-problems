// Write a program that reads a value and checks if it is less than 10.
//
// It should print true if it is less than 10 or false otherwise.
//
// Sample Input 1:
// 5
// Sample Output 1:
// true

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        boolean check = input < 10;
        System.out.println(check);
    }
}
