
import java.util.Scanner;

class ATM {

    float balance;
    int pin = 3533; // hard coded pin because we don't have data base to connect to.

    public void checkpin() {
        System.out.println("Enter Your ATM pin:");
        Scanner scn = new Scanner(System.in);
        int epin = scn.nextInt(); // epin is entered pin
        if (epin == pin) {
            menu();
        } else {
            System.out.println("Enter a valid Pin.");
            checkpin();
        }
    }

    public void menu() {
        System.out.println("Choose 1 to check balance.");
        System.out.println("Choose 2 to withdraw. ");
        System.out.println("Choose 3 to deposit money.");
        System.out.println("Choose 4 to exit.");
        Scanner scn = new Scanner(System.in);
        int option = scn.nextInt();

        if (option == 1) {
            checkbalance();
        } else if (option == 2) {
            withdraw();
        } else if (option == 3) {
            depositmoney();
        } else if (option == 4) {
            return;
        } else {
            System.out.println("please enter a valid choice.");
        }
    }

    public void checkbalance() {
        System.out.println("Available Balance: " + balance);
        menu();
    }

    public void withdraw() {
        System.out.println("Enter amount: ");
        Scanner scn = new Scanner(System.in);
        int amount = scn.nextInt();
        if (amount > balance) {
            System.out.println("Transaction failed. Insufficient balance!");

        } else {
            if (amount <= 500) {
                System.out.println("Entered amount is too low. Must be at least 500!");
            } else {
                balance = balance - amount;
                System.out.println("amount " + amount + " withdrawn successfully.");
            }

        }
        menu();

    }

    public void depositmoney() {
        System.out.println("Enter amount:");
        Scanner scn = new Scanner(System.in);
        int damount = scn.nextInt();
        balance = balance + damount;
        System.out.println("Amount " + damount + " deposited succesfully.");
        menu();
    }

}

public class ATMmachine {

    public static void main(String[] args) {

        ATM obj = new ATM();
        obj.checkpin();
    }
}
