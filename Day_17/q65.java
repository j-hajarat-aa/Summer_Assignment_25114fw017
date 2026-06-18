// package Day_17;

import java.util.Scanner;
import java.util.Arrays;
public class q65 {
    static int[] mergeOfTwoArray(int[] a, int[] b) {

        int[] merged = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {

            merged[i] = a[i];
        }
        int j=a.length;
        for(int k:b){

            merged[j]=k;
            j++;
        }
        return merged;  
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
        int ans[]=mergeOfTwoArray(a, b);
    
        System.out.println("Array after merging" + Arrays.toString(ans));
        sc.close();

    }

}
