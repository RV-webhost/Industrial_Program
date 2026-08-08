import java.util.Scanner;

class Account {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double a) {
        if(a <= balance && a > 0) {
            setBalance(balance - a);
            System.out.println("Amount " + a + "withdrawn successfully");
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void deposite(double a) {
        if(a > 0) {
            setBalance(balance + a);
            System.out.println("Amount " + a + "Deposited Sucessfully");
            System.out.println("Total Balance: " + getBalance());
        }else {
            System.out.println("Enter Valid Amount");
        }
    }

}

public class BankManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account acc = new Account();
        acc.setBalance(0);

        int n;
        do {
            System.out.println("1. Check Balance");
            System.out.println("2. Withdrawl");
            System.out.println("3. Deposite");
            System.out.println("4. exit");
            n = sc.nextInt();
            switch (n) {

                case 1: {
                    System.out.println("Availabe Balance: " + acc.getBalance());

                    break;
                }

            case 2: {
                System.out.println("Enter the amount to be withdrawn: ");
                double amount = sc.nextDouble();

                acc.withdraw(amount);

                break;
            }
            case 3: {
                System.out.println("Enter the amount to be deposite: ");
                double amount = sc.nextDouble();

                acc.deposite(amount);

                break;
            }
            default: {
                System.out.println("Exiting...");
                break;
            }
        }
        } while (n!= 4);


    }
}
