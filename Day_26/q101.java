// package Day_26;

import java.util.Random;
import java.util.Scanner;

public class q101 {

    static void numberGuessing() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");
        int n = sc.nextInt();
        int count = 1;

        Random random = new Random();
        int m = random.nextInt(100) + 1;

        while (m!=n) {
            if (m > n) {
                System.out.println("Enter larger number:");
                count++;
                
            } 
            else if (m < n) {
                System.out.println("Enter smaller number:");
                count++;
            } 
            n=sc.nextInt();

        }

        if (count == 1) {
                    System.out.println("CONGRATES! You got the number in your first attempt ");

                } else {
                    System.out.println("CONGRATES! You got the number in  " + count + " attempt");
                }

    }

    public static void main(String[] args) {

        numberGuessing();

    }

}
