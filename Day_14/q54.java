// package Day_14;

import java.util.Scanner;

public class q54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter element of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number which frequency you want :");
        int val = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (val == arr[i]) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("OOPS! " + val + " is not found!");

        } else {
            System.out.println("Frequency of " + val + " is " + count);
        }
        sc.close();
    }

}
