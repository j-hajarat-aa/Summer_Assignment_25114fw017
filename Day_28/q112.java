import java.util.Scanner;

public class q112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] name = new String[10];
        String[] phone = new String[10];
        int count = 0;
        int choice;

        do {
            System.out.println("\n1.Add Contact");
            System.out.println("2.Show Contacts");
            System.out.println("3.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    name[count] = sc.nextLine();

                    System.out.print("Enter Phone: ");
                    phone[count] = sc.nextLine();

                    count++;
                    break;

                case 2:
                    System.out.println("Contacts:");
                    for (int i = 0; i < count; i++) {
                        System.out.println(name[i] + " - " + phone[i]);
                    }
                    break;
            }
        } while (choice != 3);
    }
}