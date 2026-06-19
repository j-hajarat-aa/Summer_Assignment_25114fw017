import java.util.Scanner;

public class q76 {
    static int trace(int[][] arr) {

        int m = arr.length;
        int n = arr[0].length;
        int trace = 0;
        for (int i = 0; i < m; i++) {
            trace += arr[i][i];
        }

        return trace;
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

        int ans = trace(a);
        System.out.println("Trace of mattrix is :" + ans);
        sc.close();
    }

}
