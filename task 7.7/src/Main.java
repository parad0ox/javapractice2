public class Main {
    public static void main(String[] args) {
        AirObject airObject = new AirObject("Jet", "Military aircraft");
        IAirObjectWrapper wrapper = new SimpleAirObjectWrapper();
        wrapper = new RadarSignatureWrapper(wrapper, "Stealth");
        wrapper = new ThreatLevelWrapper(wrapper, ThreatLevel.HIGH);
        wrapper = new ObjectClassificationWrapper(wrapper, "Fighter Jet");

        AirObjectController controller = new AirObjectController(wrapper);
        controller.monitorAirObject(airObject);
    }
}
