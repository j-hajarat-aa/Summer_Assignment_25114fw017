// package Day_26;

import java.util.Scanner;

public class q102 {

    static void checkVotingEligibility(int age) {

        if (age >= 18) {
            System.out.println("You are eligible for voting.");
        } else {
            System.out.println("You are not eligible for voting.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        checkVotingEligibility(age);
    }
}