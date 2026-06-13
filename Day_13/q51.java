// package Day_13;

import java.util.Scanner;

public class q51 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter element of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int largest = arr[0], smallest = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("The smallest element of array is " + smallest);
        System.out.println("The largest element of array is " + largest);

    }

}
