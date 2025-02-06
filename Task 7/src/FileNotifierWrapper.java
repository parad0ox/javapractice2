class FileNotifierWrapper extends NotifierWrapper {
    @Override
    public void notify(SystemMain system) {
        System.out.println("File Notification: " + system.getName() + " - Запис до файлу.");
    }
}