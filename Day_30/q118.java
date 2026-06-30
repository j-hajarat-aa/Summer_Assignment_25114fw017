import java.util.Scanner;

public class q118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] books = new String[20];
        boolean[] issued = new boolean[20];
        int count = 0, choice;

        do {
            System.out.println("\n1.Add Book");
            System.out.println("2.Issue Book");
            System.out.println("3.Display Books");
            System.out.println("4.Exit");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter book name: ");
                    books[count] = sc.nextLine();
                    issued[count] = false;
                    count++;
                    break;

                case 2:
                    System.out.print("Enter book name: ");
                    String b = sc.nextLine();

                    for (int i = 0; i < count; i++) {
                        if (books[i].equalsIgnoreCase(b)) {
                            issued[i] = true;
                        }
                    }
                    break;

                case 3:
                    for (int i = 0; i < count; i++) {
                        System.out.println(
                            books[i] + " : " +
                            (issued[i] ? "Issued" : "Available")
                        );
                    }
                    break;
            }

        } while (choice != 4);
    }
}