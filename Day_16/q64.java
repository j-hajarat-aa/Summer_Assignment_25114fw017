import java.util.*;

public class q64 {
    static int[] removeDuplicates(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        int[] ans = new int[set.size()];
        int i = 0;

        for (int num : set) {
            ans[i++] = num;
        }

        return ans;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n=sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter element of array: ");
        for (int i = 0; i < n; i++) {
             arr[i]=sc.nextInt();
        }

        int[] ans = removeDuplicates(arr);

        System.out.println(Arrays.toString(ans));
    }
}