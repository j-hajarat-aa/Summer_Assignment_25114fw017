// package Day_17;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class q66 {
    static HashSet<Integer> union(int[] a, int[] b) {

        HashSet<Integer> set = new HashSet<>();

        // int i = 0;
        for (int num : a) {

            set.add(num);
            // i++;

        }
        // int j = a.length;

        for (int k : b) {
            set.add(k);
            // j++;
        }

        return set;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of first array");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter element of first array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter size of second array");
        int m = sc.nextInt();

        int[] b = new int[m];

        System.out.println("Enter element of second array:");
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        HashSet<Integer> set = union(a, b);

        System.out.println("Union of " + Arrays.toString(a) + " and " + Arrays.toString(b) + " is " + set);
        sc.close();

    }

}
