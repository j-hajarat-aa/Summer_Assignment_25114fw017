
import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter number");
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println("Number is not prime");
            return;
        }
        int flag = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = 1;
                break;
            }

        }
        if (flag == 0) {
            System.out.println("Number is prime");
        } else
            System.out.println("Number is not prime");

    }

}
