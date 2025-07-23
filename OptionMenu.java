import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu {
    private Scanner scanner = new Scanner(System.in);
    private HashMap<Integer, Account> accounts = new HashMap<>();
    private Account currentAccount;

    public OptionMenu() {
        // Preload with a default account
        accounts.put(123456, new Account(123456, 1234));
    }

    public void mainMenu() {
        int choice;
        do {
            System.out.println("\nWelcome to the ATM Machine!");
            System.out.println("1 - Login");
            System.out.println("2 - Register New Account");
            System.out.println("3 - Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    registerAccount();
                    break;
                case 3:
                    System.out.println("Thank you! Goodbye.");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (choice != 3);
    }

    private void login() {
        System.out.print("Enter your account number: ");
        int accNum = scanner.nextInt();
        System.out.print("Enter your PIN: ");
        int pin = scanner.nextInt();

        if (authenticate(accNum, pin)) {
            displayAccountMenu();
        } else {
            System.out.println("Invalid account number or PIN. Try again.");
        }
    }

    private void registerAccount() {
        System.out.print("Choose a new account number: ");
        int newAccNum = scanner.nextInt();
        if (accounts.containsKey(newAccNum)) {
            System.out.println("Account number already exists!");
            return;
        }
        System.out.print("Set your 4-digit PIN: ");
        int newPin = scanner.nextInt();

        accounts.put(newAccNum, new Account(newAccNum, newPin));
        System.out.println("Account registered successfully. You can now log in.");
    }

    private boolean authenticate(int accNum, int pin) {
        Account acc = accounts.get(accNum);
        if (acc != null && acc.getPinNumber() == pin) {
            currentAccount = acc;
            return true;
        }
        return false;
    }

    private void displayAccountMenu() {
        int option = 0;
        do {
            System.out.println("\nATM Menu:");
            System.out.println("1 - View Balance");
            System.out.println("2 - Deposit Funds");
            System.out.println("3 - Withdraw Funds");
            System.out.println("4 - Logout");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Your current balance is: ₹" + currentAccount.getBalance());
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ₹");
                    double dep = scanner.nextDouble();
                    currentAccount.deposit(dep);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ₹");
                    double with = scanner.nextDouble();
                    currentAccount.withdraw(with);
                    break;
                case 4:
                    System.out.println("Logged out successfully.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (option != 4);
    }
}
