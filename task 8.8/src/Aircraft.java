import java.time.LocalDateTime;

class Aircraft extends AirObject {
    private String type;
    private String mission;
    private LocalDateTime entryTime;

    public Aircraft(String name, String type, String mission, LocalDateTime entryTime) {
        super(name, 0, 0);
        this.type = type;
        this.mission = mission;
        this.entryTime = entryTime;
    }

    public String getType() {
        return type;
    }

    public String getMission() {
        return mission;
    }
}