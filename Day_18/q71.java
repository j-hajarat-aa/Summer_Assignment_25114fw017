// package Day_18;

import java.util.Scanner;

public class q71 {
    static void binarySearch(int[] arr, int val) {

        int n = arr.length, l = 0, h = n - 1;
        while (l <= h) {
            int m = (l + h) / 2;
        
            if (arr[m] == val) {
                System.out.println(val + " is found at index " + m);
                return;

            } else if (val > arr[m]) {
                l = m + 1;

            } else {
                h = m - 1;
            }
        }
        System.out.println("Value is not found ");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter sorted array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter valur to be search: ");
        int val = sc.nextInt();
        binarySearch(a, val);
    }

}
