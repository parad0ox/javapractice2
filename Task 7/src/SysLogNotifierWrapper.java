class SysLogNotifierWrapper extends NotifierWrapper {
    @Override
    public void notify(SystemMain system) {
        System.out.println("SysLog Notification: " + system.getName() + " - Запис до системного логу.");
    }
}