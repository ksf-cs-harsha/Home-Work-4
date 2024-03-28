package Supplier.Supplier.project;

import java.time.LocalTime;
import java.util.Random;
import java.util.function.Supplier;

public class UniqueIdentifierAndConfigurableMessage {

    public static String generateUniqueIdentifier(Supplier<String> identifierSupplier) {
        return identifierSupplier.get();
    }

    // Method to display configurable messages based on a condition
    public static void displayMessage(Supplier<String> messageSupplier, boolean condition) {
        if (condition) {
            System.out.println(messageSupplier.get());
        }
    }
}

