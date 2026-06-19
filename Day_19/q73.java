import java.util.Arrays;
import java.util.Scanner;

public class q73 {
    static int[][] add(int[][] a, int[][] b, int row, int col) {

        int[][] sum = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row :");
        int row = sc.nextInt();

        System.out.println("Enter collonm: ");
        int col = sc.nextInt();

        int a[][] = new int[row][col];
        int b[][] = new int[row][col];

        System.out.println("Enter element of first matrix :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter element of second matrix :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("first matrix is :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("second matrix is :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        int ans[][] = add(a, b, row, col);

        System.out.println("Additionn of both mattrix is :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(ans[i][j] + " ");

            }
            System.out.println();
        }
        sc.close();

    }

}
