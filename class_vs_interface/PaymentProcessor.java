/**
 * processPayment(double amount)
 * default printReceipt(double amount)
 * bool isValidAmount(double amount)
 */
public interface PaymentProcessor {

    void processPayment(double amount);
    default void printReceipt(double amount) {
        System.out.println("receipt: " + amount);
    }

    static boolean isValidAmount(double amount) {
        return amount > 0;
    }

    static String formatMessage(String prefix, double amount) {
        return prefix + " receipt the amount: " + amount;
    }
}
