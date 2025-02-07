import java.util.ArrayList;
import java.util.List;

class Radar {
    private List<AirObject> objects = new ArrayList<>();
    private MonitoringVisitor serializer;

    public void addObject(AirObject airObject) {
        objects.add(airObject);
    }

    public void monitor(String format) {
        for (AirObject obj : objects) {
            System.out.println(serializer.visit(obj));
        }
    }
}