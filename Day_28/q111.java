import java.util.Scanner;

public class q111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int seats = 10;
        int choice;

        do {
            System.out.println("\n1.Book Ticket");
            System.out.println("2.Check Available Seats");
            System.out.println("3.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (seats > 0) {
                        seats--;
                        System.out.println("Ticket Booked");
                    } else {
                        System.out.println("No seats available");
                    }
                    break;

                case 2:
                    System.out.println("Available Seats: " + seats);
                    break;
            }
        } while (choice != 3);
    }
}