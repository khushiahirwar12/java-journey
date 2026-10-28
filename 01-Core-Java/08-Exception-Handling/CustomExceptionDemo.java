class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) {
        System.out.println("Attempting withdrawal of: Rs." + amount);
        if (amount > balance) {
            throw new InsufficientFundsException("Withdrawal rejected: Insufficient balance. Available: Rs." + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful! Remaining balance: Rs." + balance);
    }
}

public class CustomExceptionDemo {
    public static void validateVoterEligibility(int age) throws InvalidAgeException {
        System.out.println("Verifying voter age: " + age);
        if (age < 18) {
            throw new InvalidAgeException("Ineligible: Minimum voting age is 18 years.");
        }
        System.out.println("Verification successful: Eligible to cast vote.");
    }

    public static void main(String[] args) {
        String author = "Khushi Ahirwar";
        System.out.println("Custom Exceptions & throw/throws Keywords Demo");
        System.out.println("Maintained by : " + author);
        System.out.println("--------------------------------------------------");

        try {
            validateVoterEligibility(16);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Custom Checked Exception: " + e.getMessage());
        }

        BankAccount account = new BankAccount(5000.0);
        try {
            account.withdraw(2000.0);
            account.withdraw(4500.0);
        } catch (InsufficientFundsException e) {
            System.out.println("Caught Custom Unchecked Exception: " + e.getMessage());
        }

        System.out.println("Execution resumed successfully without application crash.");
    }
}
