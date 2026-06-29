import java.util.Scanner;

public class q114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[100];
        int n = 0, choice;

        do {
            System.out.println("\n1.Insert");
            System.out.println("2.Display");
            System.out.println("3.Search");
            System.out.println("4.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element: ");
                    arr[n++] = sc.nextInt();
                    break;

                case 2:
                    System.out.println("Array elements:");
                    for (int i = 0; i < n; i++)
                        System.out.print(arr[i] + " ");
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Enter element to search: ");
                    int key = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < n; i++) {
                        if (arr[i] == key) {
                            found = true;
                            break;
                        }
                    }

                    if (found)
                        System.out.println("Found");
                    else
                        System.out.println("Not Found");
                    break;
            }

        } while (choice != 4);
    }
}