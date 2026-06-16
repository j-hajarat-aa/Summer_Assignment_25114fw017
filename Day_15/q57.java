// package Day_15;

public class q57 {
    static void reverseArray(int arr[]) {

        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4 };
        reverseArray(a);

    }
}
