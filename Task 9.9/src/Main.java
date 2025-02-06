public class Main {
    public static void main(String[] args) {
        AirspaceMonitoringSystem monitoringSystem = new AirspaceMonitoringSystem("http://monitoring-system.com");
        AirspaceMonitoringProxy proxy = new AirspaceMonitoringProxy(monitoringSystem);
        MonitoringController controller = new MonitoringController(proxy);
        proxy.activateMonitoring("http://monitoring-system.com");
        System.out.println("System Active: " + proxy.checkSystemStatus());
        controller.addTrackingZone();
        int[] sectors = {1, 2, 3};
        String[] trackedObjects = proxy.trackObjects(sectors);
        System.out.println("Tracked Objects: ");
        for (String obj : trackedObjects) {
            System.out.println(obj);
        }
        proxy.deactivateMonitoring();
        System.out.println("System Active after deactivation: " + proxy.checkSystemStatus());
    }
}
