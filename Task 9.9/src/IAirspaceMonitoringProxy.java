public interface IAirspaceMonitoringProxy {
    String[] trackObjects(int[] sectors);
    void trackWithoutResult(int[] sectors);
    boolean checkSystemStatus();
    void activateMonitoring(String url);
    void deactivateMonitoring();
    void confirmUpdates();
    void revertUpdates();
}