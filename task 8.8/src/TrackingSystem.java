interface TrackingSystem {
    String getTrackingID();
    String getStatus();
    String acceptVisitor(MonitoringVisitor visitor);
}