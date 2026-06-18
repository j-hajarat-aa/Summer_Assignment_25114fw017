// package Day_16;

import java.util.Scanner;

public class q63 {
    static int[] pairOfGivenSum(int[] arr, int target) {
        int n = arr.length;
        // int[] ans=new int[2];

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] { arr[i], arr[j] };

                }
            }

        }
        return new int[] { -1, -1 };
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
        System.out.println("Enter target sum: ");
        int target = sc.nextInt();
        int[] ans = pairOfGivenSum(a, target);

        System.out.println("Pairs which sum is " + target + " are " + ans[0] + " and " + ans[1]);
        sc.close();

    }

}
