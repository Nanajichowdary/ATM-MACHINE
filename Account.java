public class Account {
    private int customerNumber;
    private int pinNumber;
    private double balance = 0.0;

    public Account(int customerNumber, int pinNumber) {
        this.customerNumber = customerNumber;
        this.pinNumber = pinNumber;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: ₹" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: ₹" + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
}
