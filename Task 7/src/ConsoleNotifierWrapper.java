class ConsoleNotifierWrapper extends NotifierWrapper {
    @Override
    public void notify(SystemMain system) {
        System.out.println("Console Notification: " + system.getName() + " - " + system.getDescription());
    }
}