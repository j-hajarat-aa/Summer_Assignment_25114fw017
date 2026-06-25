// package Day_24;
import java.util.Scanner;

public class q93 {

    static boolean isRotation(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        String temp = str1 + str1;

        return temp.contains(str2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.println("Enter second string: ");
        String str2 = sc.nextLine();

        if (isRotation(str1, str2)) {
            System.out.println("Rotation");
        } else {
            System.out.println("Not Rotation");
        }
    }

}
