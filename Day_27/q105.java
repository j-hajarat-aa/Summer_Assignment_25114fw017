// package Day_27;

import java.util.Scanner;

class Student {
    int roll;
    String name;
    double marks;
}

public class q105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] s = new Student[n];

        for (int i = 0; i < n; i++) {
            s[i] = new Student();

            System.out.print("Enter Roll: ");
            s[i].roll = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Name: ");
            s[i].name = sc.nextLine();

            System.out.print("Enter Marks: ");
            s[i].marks = sc.nextDouble();
        }

        System.out.println("\nStudent Records:");
        for (int i = 0; i < n; i++) {
            System.out.println(
                    s[i].roll + " " +
                    s[i].name + " " +
                    s[i].marks);
        }
    }
}
