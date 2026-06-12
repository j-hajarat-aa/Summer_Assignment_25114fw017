// package Day_11;

import java.util.Scanner;

public class q41 {

    static int sumOfTwoNum(int a, int b) {

        return a + b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Sum of " + num1 + " and " + num2 + " is " + sumOfTwoNum(num1, num2));
        sc.close();

    }

}
