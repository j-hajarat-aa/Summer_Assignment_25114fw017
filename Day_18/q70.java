// package Day_18;

import java.util.Scanner;

public class q70 {
    static void inserstionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter element of array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        inserstionSort(a);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();

    }

}
