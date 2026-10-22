enum OrderStatus {
    PENDING(101, "Order received and awaiting processing"),
    PROCESSING(102, "Order is being packed at warehouse"),
    SHIPPED(103, "Order handed over to courier"),
    DELIVERED(104, "Order delivered to customer"),
    CANCELLED(105, "Order cancelled by user");

    private final int statusCode;
    private final String description;

    OrderStatus(int statusCode, String description) {
        this.statusCode = statusCode;
        this.description = description;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getDescription() {
        return description;
    }
}

public class EnumDemo {
    public static void main(String[] args) {
        String customer = "Khushi Ahirwar";
        OrderStatus currentStatus = OrderStatus.SHIPPED;

        System.out.println("Customer Name : " + customer);
        System.out.println("Current State : " + currentStatus);
        System.out.println("Status Code   : " + currentStatus.getStatusCode());
        System.out.println("Description   : " + currentStatus.getDescription());

        System.out.println("\n--- Tracking Status Update ---");
        switch (currentStatus) {
            case PENDING:
                System.out.println("Status: Waiting for seller confirmation.");
                break;
            case PROCESSING:
                System.out.println("Status: Warehouse is preparing the package.");
                break;
            case SHIPPED:
                System.out.println("Status: Package is in transit with logistics.");
                break;
            case DELIVERED:
                System.out.println("Status: Package successfully delivered.");
                break;
            case CANCELLED:
                System.out.println("Status: Order was terminated.");
                break;
        }

        System.out.println("\n--- All Supported Order Statuses ---");
        for (OrderStatus status : OrderStatus.values()) {
            System.out.println(status.ordinal() + " -> " + status.name() + " (" + status.getStatusCode() + "): " + status.getDescription());
        }
    }
}
