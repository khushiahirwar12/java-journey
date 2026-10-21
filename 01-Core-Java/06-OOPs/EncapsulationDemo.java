class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        if (accountHolderName != null && !accountHolderName.trim().isEmpty()) {
            this.accountHolderName = accountHolderName;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs. " + amount + " | Current Balance: Rs. " + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: Rs. " + amount + " | Remaining Balance: Rs. " + balance);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount!");
        }
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("SBIN0001423", "Khushi", 15000.0);

        System.out.println("Account Number : " + acc.getAccountNumber());
        System.out.println("Account Holder : " + acc.getAccountHolderName());
        System.out.println("Initial Balance: Rs. " + acc.getBalance());

        System.out.println();
        acc.deposit(5000.0);
        acc.withdraw(8000.0);
        acc.withdraw(20000.0);

        System.out.println();
        acc.setAccountHolderName("Khushi Ahirwar");
        System.out.println("Updated Holder : " + acc.getAccountHolderName());
    }
}
