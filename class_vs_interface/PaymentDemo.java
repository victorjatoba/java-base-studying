package class_vs_interface;

public class PaymentDemo {
    public static void main(String[] args) {
        CreditCardProcessor card = new CreditCardProcessor();
        
        card.processPayment(10);
        System.out.println(PaymentProcessor.isValidAmount(10));
        card.printReceipt(10);
    }
}
