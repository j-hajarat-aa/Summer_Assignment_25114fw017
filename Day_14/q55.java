// package Day_14;

import java.util.Scanner;

public class q55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter element of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

        System.out.println("Element of array are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int largest = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        int second_largest = Integer.MIN_VALUE;
        for (int i = 0; i < n ; i++) {
            if (arr[i] == largest) {
                continue;

            } else if (arr[i] >second_largest) {
                second_largest = arr[i];
            }
        }
        System.out.println("Senond largest is " + second_largest);
        sc.close();
    }

}
