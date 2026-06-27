// package Day_27;

import java.util.Scanner;

public class q108 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        int[] marks = new int[5];
        int total = 0;

        System.out.println("Enter marks of 5 subjects:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        double percentage = total / 5.0;
        char grade;

        if (percentage >= 90)
            grade = 'A';
        else if (percentage >= 75)
            grade = 'B';
        else if (percentage >= 60)
            grade = 'C';
        else if (percentage >= 40)
            grade = 'D';
        else
            grade = 'F';

        System.out.println("\n===== MARKSHEET =====");
        System.out.println("Student Name : " + name);

        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i + 1) + " : " + marks[i]);
        }

        System.out.println("Total Marks : " + total + "/500");
        System.out.println("Percentage : " + percentage + "%");
        System.out.println("Grade : " + grade);

        if (grade == 'F')
            System.out.println("Result : Fail");
        else
            System.out.println("Result : Pass");

        sc.close();
    }
}
