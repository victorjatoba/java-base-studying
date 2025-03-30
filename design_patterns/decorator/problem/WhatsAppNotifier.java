package design_patterns.decorator.problem;

public class WhatsAppNotifier extends Notifier {
    public void send(String message) {
        System.out.println("WhatsAppNotifier: " + message);
    }
}
