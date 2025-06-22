package DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        // Base notifier: Email
        Notifier emailNotifier = new EmailNotifier();

        // Add SMS notification
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);

        // Add Slack notification on top
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);

        // Final combined notifier sends via Email + SMS + Slack
        slackNotifier.send("System Alert: CPU Usage High!");
    }
}
