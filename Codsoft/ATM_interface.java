import java.util.*;

class ATM {
    float balance;
    int PIN = 4590;

    public void checkPIN() {
        System.out.println("Enter your pin :");
        Scanner scan = new Scanner(System.in);

        int enteredPIN = scan.nextInt();

        if (enteredPIN == PIN) {
            Menu();
        } else {
            System.out.println("Kindly, Enter a valid pin!");
        }
    }

    public void Menu() {
        System.out.println("Enter your Choice : ");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");

        Scanner scan = new Scanner(System.in);

        int opt = scan.nextInt();

        if (opt == 1) {
            checkBalance();
        } else if (opt == 2) {
            withdrawMoney();
        } else if (opt == 3) {
            depositMoney();
        } else if (opt == 4) {
            return;
        } else {
            System.out.println("Enter a valid choice!");
        }
    }

    public void checkBalance() {
        System.out.println("Balance :" + balance);
        Menu();
    }

    public void withdrawMoney() {
        System.out.println("Enter amount :");

        Scanner scan = new Scanner(System.in);

        float amount = scan.nextFloat();
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance = balance - amount;
            System.out.println("Money Withdrawn Succesfully!");
        }
        Menu();
    }

    public void depositMoney() {
        System.out.println("Enter amount :");

        Scanner scan = new Scanner(System.in);

        float amount = scan.nextFloat();
        balance = balance + amount;
        System.out.println("Money deposited Succesfully!");
        Menu();
    }
}

class ATM_machine {
    public static void main(String[] arr) {

        ATM obj = new ATM();
        obj.checkPIN();
    }
}