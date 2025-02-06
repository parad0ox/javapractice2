public class AirspaceMonitoringProxy implements IAirspaceMonitoringProxy {
    private AirspaceMonitoringSystem monitoringSystem;

    public AirspaceMonitoringProxy(AirspaceMonitoringSystem monitoringSystem) {
        this.monitoringSystem = monitoringSystem;
    }

    @Override
    public String[] trackObjects(int[] sectors) {
        return monitoringSystem.trackObjects(sectors);
    }

    @Override
    public void trackWithoutResult(int[] sectors) {
        monitoringSystem.trackWithoutResult(sectors);
    }

    @Override
    public boolean checkSystemStatus() {
        return monitoringSystem.checkSystemStatus();
    }

    @Override
    public void activateMonitoring(String url) {
        monitoringSystem.activateMonitoring(url);
    }

    @Override
    public void deactivateMonitoring() {
        monitoringSystem.deactivateMonitoring();
    }

    @Override
    public void confirmUpdates() {
        monitoringSystem.confirmUpdates();
    }

    @Override
    public void revertUpdates() {
        monitoringSystem.revertUpdates();
    }
}
