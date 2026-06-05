import java.util.Scanner;

public class q20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int largestPrimeFactor = -1;

        for (int i = 2; i <= num; i++) {

            if (num % i == 0) { // i is a factor

                boolean isPrime = true;

                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    largestPrimeFactor = i;
                }
            }
        }

        System.out.println("Largest Prime Factor = " + largestPrimeFactor);

        sc.close();
    }
}