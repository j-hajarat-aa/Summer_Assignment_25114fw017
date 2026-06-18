// package Day_16;

import java.util.HashMap;
import java.util.Scanner;

public class q62 {

    static int maxFrequency(int[] arr) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int maxFreq = -1;
        int maxFreqValue = -1;

        for (int key : freq.keySet()) {

            int frequencyOfCurrentKey = freq.get(key);

            if (frequencyOfCurrentKey > maxFreq) {
                maxFreq = frequencyOfCurrentKey;
                maxFreqValue = key;
            }
        }

        return maxFreqValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter element of array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Max frequency of element is " + maxFrequency(a));
        sc.close();

    }
}