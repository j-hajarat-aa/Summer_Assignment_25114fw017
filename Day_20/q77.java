// package Day_20;

import java.util.Scanner;

public class q77 {
    static int[][] multiply(int[][] a, int[][] b, int r1, int c1, int r2, int c2) {

        int[][] result = new int[r1][c2];

        if (c1 != r2) {
            System.out.println("Multiply is not possible");
            return null;
        }

        for (int i = 0; i < r1; i++) {

            for (int j = 0; j < c2; j++) {

                for (int k = 0; k < c1; k++) {

                    result[i][j] += a[i][k] * b[k][j];

                }
            }

        }
        return result;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row of first matrix :");
        int r1 = sc.nextInt();

        System.out.println("Enter row of second matrix :");
        int r2 = sc.nextInt();

        System.out.println("Enter collunm of first matrix: ");
        int c1 = sc.nextInt();

        System.out.println("Enter collunm of second matrix: ");
        int c2 = sc.nextInt();

        int a[][] = new int[r1][c1];
        int b[][] = new int[r2][c2];

        System.out.println("Enter element of first matrix :");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter element of second matrix :");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        int ans[][] = multiply(a, b, r1, c1, r2, c2);
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(ans[i][j] + " ");

            }
            System.out.println();
        }
        sc.close();

    }

}
