import java.util.Scanner;
import java.util.Random;
class numberGame {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int wincount = 0;



        System.out.println("Welcome to the Number Game!");


        String s = "yes";


        while (s.equalsIgnoreCase("yes")) {
            int target = r.nextInt(1, 100);
            System.out.println("Enter a number 1 -100 to guess (type 0 to quit) ");
            int n = sc.nextInt();

            while (n != 0) {
                if (n < target) {
                    System.out.println("Number is lesser than target number,guess again");
                } else if (n > target) {
                    System.out.println("Number is greater than target number,guess again");
                } else {
                    System.out.println("YAY! you've guessed the number! you win");
                    wincount++;
                    System.out.println("win count:" + wincount);
                    break;
                }
                n = sc.nextInt();


            }
            if (n == 0) {
                System.out.println("You quit the game. Better luck next time!");
                break;
            }


            System.out.println("Would you like to play another round? (type yes/no):");
            s = sc.next();
        }



            System.out.println("Thanks for playing!");


    }
}