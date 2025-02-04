public class Main {
    public static void main(String[] args) {
        SystemController controller = new SystemController();

        EmailNotifier emailNotifier = new EmailNotifier("admin@example.com");
        SysLogNotifier sysLogNotifier = new SysLogNotifier("MainJournal");
        PhoneNotifier phoneNotifier = new PhoneNotifier("+123456789");
        TelegramNotifier telegramNotifier = new TelegramNotifier("user123", true);

        controller.subscribe(emailNotifier);
        controller.subscribe(sysLogNotifier);
        controller.subscribe(phoneNotifier);
        controller.subscribe(telegramNotifier);

        SystemAlert alert = SystemAlert.create(
                AlertSeverity.ERROR,
                "Process failed unexpectedly",
                500,
                LocalDateTime.now(),
                "MainService"
        );

        controller.informAlert(alert);
    }
}
