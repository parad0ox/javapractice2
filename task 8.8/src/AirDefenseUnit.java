class AirDefenseUnit implements TrackingSystem {
    private String unitName;
    private int capacity;

    public AirDefenseUnit(String unitName, int capacity) {
        this.unitName = unitName;
        this.capacity = capacity;
    }

    public String getUnitName() {
        return unitName;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String getTrackingID() {
        return unitName;
    }

    @Override
    public String getStatus() {
        return "Air Defense Unit: " + unitName;
    }

    @Override
    public String acceptVisitor(MonitoringVisitor visitor) {
        return visitor.visit(new AirObject(unitName, 0, 0));
    }
}
