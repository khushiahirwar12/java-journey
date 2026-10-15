import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ElectricityBillApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final String RESET = "\u001B[0m";
        final String BOLD = "\u001B[1m";
        final String GREEN = "\u001B[32m";
        final String CYAN = "\u001B[36m";
        final String YELLOW = "\u001B[33m";
        final String RED = "\u001B[31m";

        System.out.println(CYAN + "==========================================================" + RESET);
        System.out.println(BOLD + "       STATE POWER CORPORATION - BILLING PORTAL           " + RESET);
        System.out.println(CYAN + "==========================================================" + RESET);

        System.out.print("Enter Consumer Name        : ");
        String consumerName = sc.nextLine();

        System.out.print("Enter Consumer Meter ID    : ");
        String meterId = sc.nextLine();

        System.out.println("\nSelect Connection Type:");
        System.out.println("  1. Domestic (Residential)");
        System.out.println("  2. Commercial (Business)");
        System.out.print("Enter your choice (1 or 2) : ");
        int connectionType = sc.nextInt();

        System.out.print("Enter Units Consumed (kWh) : ");
        double units = sc.nextDouble();

        if (units < 0) {
            System.out.println(RED + "\n[!] Error: Consumed units cannot be negative. Exiting system." + RESET);
            sc.close();
            return;
        }
        double baseBill = 0.0;
        double fixedCharge = 0.0;
        String connectionName = "";

        if (connectionType == 1) {
            connectionName = "Domestic (Home)";
            fixedCharge = 50.0;

            if (units <= 100) {
                baseBill = units * 1.50;
            } else if (units <= 200) {
                baseBill = (100 * 1.50) + ((units - 100) * 2.50);
            } else {
                baseBill = (100 * 1.50) + (100 * 2.50) + ((units - 200) * 4.50);
            }
        } else if (connectionType == 2) {
            connectionName = "Commercial (Store/Office)";
            fixedCharge = 150.0;

            if (units <= 100) {
                baseBill = units * 3.00;
            } else if (units <= 200) {
                baseBill = (100 * 3.00) + ((units - 100) * 5.00);
            } else {
                baseBill = (100 * 3.00) + (100 * 5.00) + ((units - 200) * 7.50);
            }
        } else {
            System.out.println(RED + "\n[!] Invalid connection type chosen. Aborting." + RESET);
            sc.close();
            return;
        }
        double greenEnergyTax = baseBill * 0.05;
        double highConsumptionSurcharge = 0.0;

        if (units > 300) {
            highConsumptionSurcharge = baseBill * 0.10;
        }

        double totalPayable = baseBill + fixedCharge + greenEnergyTax + highConsumptionSurcharge;

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy | hh:mm a");
        String billDate = dtf.format(LocalDateTime.now());

        System.out.println("\n" + GREEN + "Generating invoice..." + RESET);
        System.out.println("+--------------------------------------------------------+");
        System.out.println("|                ELECTRICITY TAX INVOICE                 |");
        System.out.println("+--------------------------------------------------------+");
        System.out.printf("| Date & Time      : %-35s |\n", billDate);
        System.out.printf("| Consumer Name    : %-35s |\n", consumerName);
        System.out.printf("| Meter Serial No  : %-35s |\n", meterId);
        System.out.printf("| Connection Type  : %-35s |\n", connectionName);
        System.out.printf("| Total Units      : %-35.2f |\n", units);
        System.out.println("+--------------------------------------------------------+");
        System.out.println("| CHARGES BREAKDOWN                                      |");
        System.out.println("+--------------------------------------------------------+");
        System.out.printf("| Energy Charges (Slab)       : Rs. %-20.2f |\n", baseBill);
        System.out.printf("| Fixed Maintenance Charge    : Rs. %-20.2f |\n", fixedCharge);
        System.out.printf("| Green Energy Cess (5%%)      : Rs. %-20.2f |\n", greenEnergyTax);
        if (highConsumptionSurcharge > 0) {
            System.out.printf("| High Usage Penalty (10%%)    : Rs. %-20.2f |\n", highConsumptionSurcharge);
        }
        System.out.println("+--------------------------------------------------------+");
        System.out.printf(BOLD + "| NET PAYABLE AMOUNT          : Rs. %-20.2f |" + RESET + "\n", totalPayable);
        System.out.println("+--------------------------------------------------------+");

        if (units > 250) {
            System.out.println(YELLOW + " Tip: Consider energy-saving appliances to reduce your slab tier." + RESET);
        } else {
            System.out.println(GREEN + " Excellent! Your energy consumption is within eco-friendly limits." + RESET);
        }
        System.out.println();

        sc.close();
    }
}
