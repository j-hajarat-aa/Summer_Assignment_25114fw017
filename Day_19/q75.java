import java.util.Scanner;

public class q75 {
    static int[][] transpose(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        int[][] trans = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                trans[j][i] = arr[i][j];
            }
        }
        return trans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row :");
        int row = sc.nextInt();

        System.out.println("Enter collonm: ");
        int col = sc.nextInt();

        int a[][] = new int[row][col];
        int b[][] = new int[row][col];

        System.out.println("Enter element of  matrix :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix is :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        int[][] ans = transpose(a);
        System.out.println("transpose of mattrix is :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(ans[i][j] + " ");

            }
            System.out.println();
        }
        sc.close();

    }

}
