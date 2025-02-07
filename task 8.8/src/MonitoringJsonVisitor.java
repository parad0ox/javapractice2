class MonitoringJsonVisitor implements MonitoringVisitor {
    @Override
    public String visit(Airspace airspace) {
        return "Serializing Airspace Data to JSON";
    }

    @Override
    public String visit(Aircraft aircraft) {
        return "Serializing Aircraft Data to JSON";
    }

    @Override
    public String visit(ThreatLevel threatLevel) {
        return "Serializing Threat Level Data to JSON";
    }

    @Override
    public String visit(AirObject airObject) {
        return "Serializing AirObject Data to JSON";
    }
}