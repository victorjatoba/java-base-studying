package design_patterns.decorator.problem;

public class AppDemo {
    public static void main(String[] args) {
        Notifier notifier = new Notifier();
        notifier.send("Hello World");
        EmailNotifier emailNotifier = new EmailNotifier();
        emailNotifier.send("Hello World");
        WhatsAppNotifier whatsAppNotifier = new WhatsAppNotifier();
        whatsAppNotifier.send("Hello World");
        EmailWhatsAppNotifier emailWhatsAppNotifier = new EmailWhatsAppNotifier();
        emailWhatsAppNotifier.send("Hello World");
    }
}
