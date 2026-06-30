import java.util.Scanner;

public class q117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] roll = new int[10];
        String[] name = new String[10];
        double[] marks = new double[10];
        int count = 0, choice;

        do {
            System.out.println("\n1.Add Student");
            System.out.println("2.Display Students");
            System.out.println("3.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll No: ");
                    roll[count] = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    name[count] = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    marks[count] = sc.nextDouble();

                    count++;
                    break;

                case 2:
                    System.out.println("\nStudent Records:");
                    for (int i = 0; i < count; i++) {
                        System.out.println(
                            roll[i] + " " +
                            name[i] + " " +
                            marks[i]
                        );
                    }
                    break;
            }
        } while (choice != 3);
    }
}