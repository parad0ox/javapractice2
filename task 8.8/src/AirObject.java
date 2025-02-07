import java.time.LocalDateTime;
class AirObject implements TrackingSystem {
    private String name;
    private double velocity;
    private double altitude;
    private long id;
    private LocalDateTime creationDate;

    public AirObject(String name, double velocity, double altitude) {
        this.name = name;
        this.velocity = velocity;
        this.altitude = altitude;
        this.creationDate = LocalDateTime.now();
    }

    public long getId() {
        return id;
    }

    public double getVelocity() {
        return velocity;
    }

    public double getAltitude() {
        return altitude;
    }

    @Override
    public String getTrackingID() {
        return String.valueOf(id);
    }

    @Override
    public String getStatus() {
        return "Tracking AirObject: " + name;
    }

    @Override
    public String acceptVisitor(MonitoringVisitor visitor) {
        return visitor.visit(this);
    }
}