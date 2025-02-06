class EmailNotifierWrapper extends NotifierWrapper {
    @Override
    public void notify(SystemMain system) {
        System.out.println("Email Notification: " + system.getName() + " - Отправка email сообщения.");
    }
}