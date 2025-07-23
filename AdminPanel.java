import java.util.HashMap;

public class AdminPanel {
    private HashMap<Integer, Account> accounts;

    public AdminPanel(HashMap<Integer, Account> accounts) {
        this.accounts = accounts;
    }

    public void viewAllAccounts() {
        System.out.println("\n--- Admin Panel: All Accounts ---");
        for (int accNum : accounts.keySet()) {
            Account acc = accounts.get(accNum);
            System.out.println("Account: " + accNum + ", Balance: ₹" + acc.getBalance());
        }
    }
}