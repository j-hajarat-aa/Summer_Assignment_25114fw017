// package Day_14;

import java.util.Scanner;

public class q53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter element of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Enter value to be search: ");
        int val = sc.nextInt();
        int pos = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == val) {
                pos = i;
                break;
            }
        }
        if (pos == -1) {
            System.out.println("Searching failed!!");
        } else {
            System.out.println(val + " is found at index " + pos);
        }
        sc.close();

    }

}
