import java.util.Scanner;

public class q119 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] id = new int[20];
        String[] name = new String[20];
        double[] salary = new double[20];
        int count = 0, choice;

        do {
            System.out.println("\n1.Add Employee");
            System.out.println("2.Display Employees");
            System.out.println("3.Exit");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    id[count] = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    name[count] = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    salary[count] = sc.nextDouble();

                    count++;
                    break;

                case 2:
                    System.out.println("\nEmployee Details:");
                    for (int i = 0; i < count; i++) {
                        System.out.println(
                            id[i] + " " +
                            name[i] + " " +
                            salary[i]
                        );
                    }
                    break;
            }

        } while (choice != 3);
    }
}