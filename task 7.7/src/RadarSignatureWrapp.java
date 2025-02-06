class RadarSignatureWrapper extends AbstractAirObjectWrapper {
    private String signatureType;

    public RadarSignatureWrapper(IAirObjectWrapper wrappee, String signatureType) {
        super(wrappee);
        this.signatureType = signatureType;
    }

    @Override
    public void process(AirObject airObject) {
        super.process(airObject);
        System.out.println("Radar Signature Type: " + signatureType);
    }
}