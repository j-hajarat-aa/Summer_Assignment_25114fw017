// package Day_22;

import java.util.Scanner;

public class q86 {
    static int wordcount(String str){

        int n=str.length();
        int count=0;
        for (int i = 0; i < n; i++) {

            if (str.charAt(i)==' ') {
                count++;
                
            }
        }
        return count+1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string: ");
        String str=sc.nextLine();
        System.out.println(wordcount(str)+" Words present in the sentence");
        sc.close();
    }
    
}
