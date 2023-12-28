import java.util.Scanner;

class Bank{
    double amount,balance;
    Bank(double amt,double bal){
        amount = amt;
        balance = bal;
    }
    void withdraw(){
        if(balance < amount){
            throw new ArithmeticException("Insufficient balance");
        }else{
            System.out.println("Amount withdrawed is:"+amount);
        }
    }
}

public class Week4b {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter amount:");
            double amt = s.nextDouble();
            System.out.print("Enter balance:");
            double bal = s.nextDouble();
            Bank ob = new Bank(amt,bal);
            ob.withdraw();
        }
    }
}
