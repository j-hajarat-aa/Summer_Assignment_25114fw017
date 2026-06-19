// package Day_18;

import java.util.Scanner;

public class q69 {
    static void bubblesort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1 ; j++) {

                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
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
        bubblesort(a);
        System.out.println("Array after sorting: ");
        for (int i = 0; i < n; i++) {

            System.out.print(a[i] + " ");
        }
        sc.close();

    }

}
