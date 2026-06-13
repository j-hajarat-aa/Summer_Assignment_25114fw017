// package Day_13;

import java.util.Scanner;

public class q50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter element of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];

        }
        float avg = (float) sum / n;

        System.out.println("Sum of element of array is :" + sum);

        System.out.println("Avearge of element of array is :" + avg);
        sc.close();
    }

}
