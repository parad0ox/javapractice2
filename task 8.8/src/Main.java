import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        AirObject airObject = new AirObject("UAV", 750, 12000);
        Aircraft aircraft = new Aircraft("F-22", "Fighter", "Patrol", LocalDateTime.now());
        MonitoringVisitor dbVisitor = new MonitoringDatabaseVisitor();
        MonitoringVisitor jsonVisitor = new MonitoringJsonVisitor();

        System.out.println(airObject.acceptVisitor(dbVisitor));
        System.out.println(aircraft.acceptVisitor(jsonVisitor));
    }
}
