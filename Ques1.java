import java.util.Scanner;

class Bank {
    int accountNumber;
    float balance;
    String customerName, DOB, typeOfAccount, address;

    Bank(int accNum, float bal, String cusName, String DB, String AT, String addr) {
        accountNumber = accNum;
        balance = bal;
        customerName = cusName;
        DOB = DB;
        typeOfAccount = AT;
        address = addr;
    }

    void withDraw(float amount) {
        if (balance > amount) {
            balance = balance - amount;
            System.out.println("Remaining balance:" + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    void deposit(float amount) {
        balance = balance + amount;
        System.out.println("Remaining balance:" + balance);
    }
}

public class Ques1 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int accNum = s.nextInt();
        System.out.print("Enter Initial Balance: ");
        float bal = s.nextFloat();
        s.nextLine();
        System.out.print("Enter Customer Name: ");
        String cusName = s.nextLine();
        System.out.print("Enter Date of Birth: ");
        String DB = s.nextLine();
        System.out.print("Enter Account Type: ");
        String AT = s.nextLine();
        System.out.print("Enter Address: ");
        String addr = s.nextLine();

        Bank account = new Bank(accNum, bal, cusName, DB, AT, addr);

        System.out.print("Enter withdrawal amount: ");
        float withdrawAmount = s.nextFloat();
        account.withDraw(withdrawAmount);

        System.out.print("Enter deposit amount: ");
        float depositAmount = s.nextFloat();
        account.deposit(depositAmount);
    }
}
