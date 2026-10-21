class Payment {
    void processPayment(double amount) {
        System.out.println("Processing generic payment of Rs. " + amount);
    }
}

class UpiPayment extends Payment {
    String upiId;

    UpiPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    void processPayment(double amount) {
        System.out.println("Paid Rs. " + amount + " instantly via UPI ID: " + upiId);
    }
}

class CreditCardPayment extends Payment {
    String cardNumber;

    CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    void processPayment(double amount) {
        System.out.println("Paid Rs. " + amount + " using Credit Card ending with: " + cardNumber.substring(cardNumber.length() - 4));
    }
}

class NetBankingPayment extends Payment {
    String bankName;

    NetBankingPayment(String bankName) {
        this.bankName = bankName;
    }

    @Override
    void processPayment(double amount) {
        System.out.println("Paid Rs. " + amount + " through Net Banking (" + bankName + ")");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Payment p;

        p = new UpiPayment("dev@okhdfcbank");
        p.processPayment(1499.00);

        p = new CreditCardPayment("4111222233334567");
        p.processPayment(4999.50);

        p = new NetBankingPayment("State Bank of India");
        p.processPayment(12000.00);

        Payment[] transactions = {
            new UpiPayment("user@paytm"),
            new CreditCardPayment("5500000012348899"),
            new NetBankingPayment("HDFC Bank")
        };

        System.out.println("\n--- Batch Processing (Dynamic Method Dispatch) ---");
        for (Payment pay : transactions) {
            pay.processPayment(500.00);
        }
    }
}
