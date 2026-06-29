import java.util.Scanner;

public class q115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str;
        int choice;

        System.out.print("Enter a string: ");
        str = sc.nextLine();

        do {
            System.out.println("\n1.Length");
            System.out.println("2.Uppercase");
            System.out.println("3.Lowercase");
            System.out.println("4.Reverse");
            System.out.println("5.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Length = " + str.length());
                    break;

                case 2:
                    System.out.println(str.toUpperCase());
                    break;

                case 3:
                    System.out.println(str.toLowerCase());
                    break;

                case 4:
                    for (int i = str.length() - 1; i >= 0; i--)
                        System.out.print(str.charAt(i));
                    System.out.println();
                    break;
            }

        } while (choice != 5);
    }
}