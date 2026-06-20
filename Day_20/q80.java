import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q80 {
    static List<Integer> colSum(int[][] arr) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j][i];
            }
            ans.add(sum);
        }
        return ans;

    }
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter row :");
        int row = sc.nextInt();

        System.out.println("Enter collonm: ");
        int col = sc.nextInt();

        int a[][] = new int[row][col];
        int b[][] = new int[row][col];

        System.out.println("Enter element of matrix :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        List<Integer> ans = new ArrayList<>();
        ans = colSum(a);
        System.out.println("Row wise sum is " + ans);
        sc.close();

    }

}
