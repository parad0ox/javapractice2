class SystemAlert extends NotifierWrapper {
    private AlertSeverity severity;


    public SystemAlert(AlertSeverity severity) {
        this.severity = severity;
    }

    @Override
    public void notify(SystemMain system) {
        System.out.println("System Alert Notification [" + severity + "]: " + system.getName() + " - Вiдправка системного оповiщення.");
    }
}