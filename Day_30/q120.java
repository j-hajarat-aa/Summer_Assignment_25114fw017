import java.util.Scanner;

public class q120 {

    static int[] roll = new int[20];
    static String[] name = new String[20];
    static double[] marks = new double[20];
    static int count = 0;

    static void addStudent(Scanner sc) {
        System.out.print("Enter Roll: ");
        roll[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name[count] = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks[count] = sc.nextDouble();

        count++;
    }

    static void display() {
        System.out.println("\nStudent Records:");
        for (int i = 0; i < count; i++) {
            System.out.println(
                roll[i] + " " +
                name[i] + " " +
                marks[i]
            );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1.Add Student");
            System.out.println("2.Display");
            System.out.println("3.Exit");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent(sc);
                    break;

                case 2:
                    display();
                    break;
            }

        } while (choice != 3);
    }
}