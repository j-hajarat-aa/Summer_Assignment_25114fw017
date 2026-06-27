import java.util.Random;
import java.util.Scanner;

public class q103 {

    static void ATM_simulation(long accountNumber, long pin) {
        Scanner sc = new Scanner(System.in);

        System.out.println("<<--WELCOME TO SBI ATM-->>");
        System.out.println("Enter your choice-->>");

        System.out.println("1. Balance Enquiry-->>");
        System.out.println("2. Cash Withdraw-->>");
        System.out.println("3. Generate Pin-->>");
        System.out.println("4. Change Pin-->>");
        System.out.println("5. Exit-->>");
        int coice = sc.nextInt();
        Random random = new Random();
        if (coice == 1) {
            System.out.println("1. Saving Account-->>");
            System.out.println("2. Current Account-->>");
            int a = sc.nextInt();
            float bal = random.nextFloat(100000) + 1;
            System.out.println("Balance is= " + bal);
            System.out.println();
            System.out.println("<<--THANKS FOR USING SBI-->> ");
        }

        else if (coice == 2) {
            System.out.println("1. Saving Account-->>");
            System.out.println("2. Current Account-->>");
            int b = sc.nextInt();
            System.out.println("Enter Amount-->> ");
            long amt = sc.nextLong();
            if (amt > 20000) {
                System.out.println("You withdraw maximum 20000 at once");

            } else {
                System.out.println("PLEASE WAIT WHILE YOUR TRANSECTION IS SUCCESSEFULLY PROCEDE");
                System.out.println();
                System.out.println("Your transection is successefully");
                System.out.println("<<--THANKS FOR USING SBI-->> ");
            }

        } else if (coice == 3) {
            System.out.println("1. Saving Account-->>");
            System.out.println("2. Current Account-->>");
            int c = sc.nextInt();
            System.out.println("SORRY!! THIS SERVICE IS CURRENTLY UNAVAILABLE");

            System.out.println("<<--THANKS FOR USING SBI-->> ");
        }
        else if (coice == 4) {
            System.out.println("1. Saving Account-->>");
            System.out.println("2. Current Account-->>");
            int d = sc.nextInt();
            System.out.println("SORRY!! THIS SERVICE IS CURRENTLY UNAVAILABLE");
            System.out.println("<<--THANKS FOR USING SBI-->> ");

        }
        else if (coice == 5) {
            
            System.out.println("<<--THANKS FOR USING SBI-->> ");

        }
        else{
            System.out.println("Choose correct option-->>");
        }

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your account number -->>");
        long accountNum=s.nextLong();
        System.out.println("Enter Pin-->>");
        long pin=s.nextLong();
        ATM_simulation(accountNum, pin);
    }

}
