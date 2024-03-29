// Ann puts MM money in the bank. The bank increases Ann's deposit by PP percent every year. Ann wants to know how many years should pass until her deposit in the bank reaches KK money. Can you help her to answer this question?
//
// The input contains three integers M, P, KM,P,K. It is guaranteed that all numbers are positive and K \geq MK≥M.
// Output the answer to Ann's question.
//
// Sample Input 1:
// 1 100 8
// Sample Output 1:
// 3
// Sample Input 2:
// 100 15 120
// Sample Output 2:
// 2

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double mDepositMoney = input.nextDouble();
        double pInterestPerYear = input.nextDouble();
        double kTargetMoney = input.nextDouble();
        double numberOfYears = 1;

        while (kTargetMoney >= mDepositMoney) {
            mDepositMoney = (mDepositMoney * (pInterestPerYear / 100)) + mDepositMoney;
            mDepositMoney++;
            if (mDepositMoney < kTargetMoney) {
                numberOfYears++;
            } else {
                System.out.println(numberOfYears);
            }
        }
    }
}
