// package Day_16;

import java.util.Scanner;

public class q61 {

    static int missingNum(int arr[]) {
        int xorsum = 0;

        for (int num : arr) {
            xorsum = xorsum ^ num;
        }
        for (int i = 1; i < arr.length + 1; i++) {
            xorsum = xorsum ^ i;
        }
        return xorsum;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter element of array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Missing number is " + missingNum(a));
        sc.close();
    }

}
