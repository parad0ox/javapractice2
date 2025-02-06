import java.util.ArrayList;
import java.util.List;


class AirObjectController {
    private List<AirObject> history = new ArrayList<>();
    private IAirObjectWrapper wrapper;

    public AirObjectController(IAirObjectWrapper wrapper) {
        this.wrapper = wrapper;
    }

    public void monitorAirObject(AirObject airObject) {
        history.add(airObject);
        wrapper.process(airObject);
    }
}