class PhoneNotifierWrapper extends NotifierWrapper {
    @Override
    public void notify(SystemMain system) {
        System.out.println("Phone Notification: " + system.getName() + " - Вiдправка повiдомлення.");
    }
}