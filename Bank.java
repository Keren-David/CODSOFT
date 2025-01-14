
import java.util.Scanner;
public class Bank {
    public static void main(String args[]){
        ATM a = new ATM();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to your bank account");
        System.out.println("Press '1' to check your balance");
        System.out.println("Press '2' to withdraw money from your account");
        System.out.println("Press '3' to deposit money to your account");
        System.out.println("Press '4' to exit");
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                a.checkBal();
                break;
            case 2:
                a.withdraw();
                break;
            case 3:
                a.deposit();
                break;
            case 4:
                System.out.println("Thank you! have a nice day!");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }


    }
}
