class ObjectClassificationWrapper extends AbstractAirObjectWrapper {
    private String classification;

    public ObjectClassificationWrapper(IAirObjectWrapper wrappee, String classification) {
        super(wrappee);
        this.classification = classification;
    }

    @Override
    public void process(AirObject airObject) {
        super.process(airObject);
        System.out.println("Object Classification: " + classification);
    }
}