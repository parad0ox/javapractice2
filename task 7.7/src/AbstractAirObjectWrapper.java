abstract class AbstractAirObjectWrapper implements IAirObjectWrapper {
    protected IAirObjectWrapper wrappee;

    public AbstractAirObjectWrapper(IAirObjectWrapper wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void process(AirObject airObject) {
        if (wrappee != null) {
            wrappee.process(airObject);
        }
    }
}