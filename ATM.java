import java.util.Scanner;

class ATM {
    Scanner sc = new Scanner(System.in);
    bankAcc b = new bankAcc();

    public void checkBal(){
            System.out.println("Your balance is:" + b.balance);

    }
    public void withdraw(){
            System.out.println("Enter amount to withdraw");
            int wAmt = sc.nextInt();
            if(wAmt > b.balance){
                System.out.println("Balance insufficent");
            }else {
                b.balance =  b.balance - wAmt;
                System.out.println("Amount withdrawn:" + wAmt);
                System.out.println("Balance:" + b.balance);
            }
    }
    public void deposit(){
        System.out.println("Enter amount to withdraw");
        int dAmt = sc.nextInt();
        b.balance = dAmt + b.balance;
        System.out.println("Amount deposited:" + dAmt);
        System.out.println("Balance:" + b.balance);
    }
}





