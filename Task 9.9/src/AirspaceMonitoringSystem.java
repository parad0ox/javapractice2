public class AirspaceMonitoringSystem implements IAirspaceMonitoringProxy {
    private String url;
    private boolean isActive;

    public AirspaceMonitoringSystem(String url) {
        this.url = url;
        this.isActive = false;
    }

    @Override
    public String[] trackObjects(int[] sectors) {
        return new String[]{"Tracked Object A", "Tracked Object B"}; // Example data
    }

    @Override
    public void trackWithoutResult(int[] sectors) {
    }

    @Override
    public boolean checkSystemStatus() {
        return isActive;
    }

    @Override
    public void activateMonitoring(String url) {
        this.url = url;
        this.isActive = true;
    }

    @Override
    public void deactivateMonitoring() {
        this.isActive = false;
    }

    @Override
    public void confirmUpdates() {
    }

    @Override
    public void revertUpdates() {
    }
}