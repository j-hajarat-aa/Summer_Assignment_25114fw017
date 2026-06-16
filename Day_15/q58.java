import java.util.Scanner;

public class q58 {
    static void leftshift(int arr[]) {

        int temp = arr[0];
        int n = arr.length;
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];

        }
        arr[n - 1] = temp;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter element of array : ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }
        leftshift(a);
        System.out.println("Array after left shift:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }

}
