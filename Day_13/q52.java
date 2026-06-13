// package Day_13;

import java.util.Scanner;

public class q52 {
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

        int odd = 0, even = 0;
        for (int i = 0; i < n; i++) {
            if ((arr[i] & 1) == 0) {
                even++;
            }
             else if((arr[i] & 1) != 0) {
                odd++;
            }
        }
        System.out.println("Odd elements in array are " + odd + " and the even elements are " + even);
        sc.close();
    }

}
