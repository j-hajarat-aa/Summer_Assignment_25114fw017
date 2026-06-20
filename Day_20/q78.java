import java.util.Scanner;

public class q78 {

    static boolean isSymetry(int[][] a, int row, int col) {
        if (row != col) {
            return false;
        }
        for (int i = 0; i < row; i++) {
            for (int j = i + 1; j < col; j++) {
                if (a[i][j] != a[j][i]) {
                    return false;

                }
            }
        }
        return true;
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
        System.out.println("Matrix is Symentric :" + isSymetry(a, row, col));
        sc.close(); 

    }

}
