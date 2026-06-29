package Day_28;
import java.util.Scanner;

public class q109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] books = new String[10];
        int count = 0;
        int choice;

        do {
            System.out.println("\n1.Add Book");
            System.out.println("2.Show Books");
            System.out.println("3.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter book name: ");
                    books[count++] = sc.nextLine();
                    break;

                case 2:
                    System.out.println("Books in library:");
                    for (int i = 0; i < count; i++)
                        System.out.println(books[i]);
                    break;
            }
        } while (choice != 3);
    }
}