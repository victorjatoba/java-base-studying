package design_patterns.decorator.problem;

public class EmailWhatsAppNotifier extends Notifier {
    public void send(String message) {
        System.out.println("Email WhatsApp Notifier: " + message);
    }
}
