package loyalcustomer;

import java.io.File;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// Main application with Main method
public class Main {

    private static final Logger LOGGER = LogManager.getLogger();

    public static void main(String[] args) {
        // Check if the args sent in have anything.
        if (args.length != 1) {
            LOGGER.error("A folder path was not provided. Use java App <folder_path>");
            System.exit(1);
        }

        // Create a LoyalCustomer object to produce the loyal customer report.
        LoyalCustomer loyalCustomer = new LoyalCustomer();

        // Pass the address supplied from the args to the getLoyalCustomer function
        // to retrieve a list of loyal customer IDs.
        List<Integer> loyalCustomers = loyalCustomer.getLoyalCustomersList(args);

        // Iterate through the list of loyal customer IDs and print them to
        // the console.
        for (Integer nextLoyalCustomerId : loyalCustomers) {
            System.out.println(nextLoyalCustomerId);
        }

        // File name of the report to store the loyal customer ID list.
        String fileName = "LoyalCustomerIDs.txt";

        // Send the list of loyal customer IDs and the log file path
        // to the generateReport method to create a text file with the
        // list of loyal customer IDs in the same folder as the log files.
        loyalCustomer.generateReport(loyalCustomers, fileName, args[0] + File.separator + "LoyalCustomer");
    }
}

