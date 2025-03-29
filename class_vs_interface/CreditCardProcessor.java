package class_vs_interface;

/**
 */
public class CreditCardProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println(amount + 1);
    }
}
