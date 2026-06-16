// package Day_15;

import java.util.Scanner;

public class q59 {
    static void rightShift(int arr[]) {

        int n = arr.length;

        int temp = arr[n - 1];

        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = temp;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter element of array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        rightShift(a);

        System.out.println("Array after right shift:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }

}
