class MonitoringDatabaseVisitor implements MonitoringVisitor {
    @Override
    public String visit(Airspace airspace) {
        return "Logging Airspace Data to Database";
    }

    @Override
    public String visit(Aircraft aircraft) {
        return "Logging Aircraft Data to Database";
    }

    @Override
    public String visit(ThreatLevel threatLevel) {
        return "Logging Threat Level Data to Database";
    }

    @Override
    public String visit(AirObject airObject) {
        return "Logging AirObject Data to Database";
    }
}