public class Main {
    public static void main(String[] args) {

        SystemMain system = new SystemMain("Main System", "Опис головноi системи");


        SystemController controller = new SystemController();


        controller.addNotifier(new ConsoleNotifierWrapper());
        controller.addNotifier(new FileNotifierWrapper());
        controller.addNotifier(new LogNotifierWrapper());
        controller.addNotifier(new PhoneNotifierWrapper());
        controller.addNotifier(new EmailNotifierWrapper());
        controller.addNotifier(new SysLogNotifierWrapper());
        controller.addNotifier(new SystemAlert(AlertSeverity.INFO));
        controller.addNotifier(new SystemAlert(AlertSeverity.CRITICAL));


        controller.notifySystems(system);
    }
}