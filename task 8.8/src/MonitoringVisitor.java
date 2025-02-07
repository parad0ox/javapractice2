interface MonitoringVisitor {
    String visit(Airspace airspace);
    String visit(Aircraft aircraft);
    String visit(ThreatLevel threatLevel);
    String visit(AirObject airObject);
}