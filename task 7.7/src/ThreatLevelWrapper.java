class ThreatLevelWrapper extends AbstractAirObjectWrapper {
    private ThreatLevel threatLevel;

    public ThreatLevelWrapper(IAirObjectWrapper wrappee, ThreatLevel threatLevel) {
        super(wrappee);
        this.threatLevel = threatLevel;
    }

    @Override
    public void process(AirObject airObject) {
        super.process(airObject);
        System.out.println("Threat Level: " + threatLevel);
    }
}