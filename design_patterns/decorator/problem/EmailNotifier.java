package design_patterns.decorator.problem;

public class EmailNotifier extends Notifier {
    public void send(String message) {
        System.out.println("EmailNotifier: " + message);
    }
}
