class SimpleAirObjectWrapper implements IAirObjectWrapper {
    @Override
    public void process(AirObject airObject) {
        System.out.println("Processing AirObject: " + airObject.getName());
    }
}