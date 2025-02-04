class SystemController extends Observable {
    private List<SystemAlert> alertHistory = new ArrayList<>();

    public void informAlert(SystemAlert alert) {
        alertHistory.add(alert);
        notify(alert);
    }

    public void addAlert(SystemAlert alert) {
        alertHistory.add(alert);
    }
}
