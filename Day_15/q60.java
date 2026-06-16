import java.util.Scanner;

public class q60 {

    static void shiftZeroesToEnd(int arr[]) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }

        while (count < arr.length) {
            arr[count] = 0;
            count++;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        shiftZeroesToEnd(a);

        System.out.println("After shifting zeroes to end:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}