class LogNotifierWrapper extends NotifierWrapper {
    @Override
    public void notify(SystemMain system) {
        System.out.println("Log Notification: " + system.getName() + " - Логгування.");
    }
}