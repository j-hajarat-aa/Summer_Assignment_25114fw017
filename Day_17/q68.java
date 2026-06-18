// package Day_17;

import java.util.HashSet;
import java.util.Scanner;

public class q68 {
    static HashSet<Integer> commonElement(int[] a, int[] b) {

        HashSet<Integer> set = new HashSet<>();

        HashSet<Integer> common = new HashSet<>();

        for (int num : a) {
            set.add(num);
        }

        for (int num : b) {

            if (set.contains(num)) {
                common.add(num);
            }
        }
        return common;

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
        HashSet<Integer> ans =  commonElement(a, b);
        

        System.out.println("Common element is " + ans);
        sc.close();

    }

}
