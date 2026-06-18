// package Day_17;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class q67 {
    static HashSet<Integer> intersectionOfTowArray(int[] a, int[] b) {

        HashSet<Integer> set = new HashSet<>();

        HashSet<Integer> intersection = new HashSet<>();
        for (int num : a) {
            set.add(num);
        }

        for (int num : b) {

            if (set.contains(num)) {
                intersection.add(num);
            }
        }
        return intersection;

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
        HashSet<Integer> ans = new HashSet<>();
        ans = intersectionOfTowArray(a, b);

        System.out.println("Intersection of " + Arrays.toString(a) + " and " + Arrays.toString(b) + " is " + ans);
        sc.close();

    }

}
