import java.util.Scanner;

public class q116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String product[] = new String[20];
        int quantity[] = new int[20];
        int count = 0, choice;

        do {
            System.out.println("\n1.Add Product");
            System.out.println("2.Show Inventory");
            System.out.println("3.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    product[count] = sc.nextLine();

                    System.out.print("Enter quantity: ");
                    quantity[count] = sc.nextInt();

                    count++;
                    break;

                case 2:
                    System.out.println("\nInventory:");
                    for (int i = 0; i < count; i++) {
                        System.out.println(product[i] + " : " + quantity[i]);
                    }
                    break;
            }

        } while (choice != 3);
    }
}