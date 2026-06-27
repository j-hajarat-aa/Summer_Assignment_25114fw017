// package Day_27;
    import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;
}

public class q106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        Employee[] e = new Employee[n];

        for (int i = 0; i < n; i++) {
            e[i] = new Employee();

            System.out.print("Enter Employee ID: ");
            e[i].id = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            e[i].name = sc.nextLine();

            System.out.print("Enter Salary: ");
            e[i].salary = sc.nextDouble();
        }

        System.out.println("\nEmployee Records:");
        for (int i = 0; i < n; i++) {
            System.out.println(
                    e[i].id + " " +
                    e[i].name + " " +
                    e[i].salary);
        }
    }
}
