// package Day_25;

import java.util.Scanner;

public class q97 {

    static int[] merge(int[] a, int[] b) {

        int n1 = a.length;
        int n2 = b.length;
        int[] ans = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {

            if (a[i] <= b[j]) {
                ans[k++] = a[i++];
            } else {
                ans[k++] = b[j++];
            }
        }

        while (i < n1) {
            ans[k++] = a[i++];
        }

        while (j < n2) {
            ans[k++] = b[j++];
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] a = {1, 3, 5, 7};
        int[] b = {2, 4, 6, 8};

        int[] ans = merge(a, b);

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}