import java.time.LocalDate;
import java.time.LocalDateTime;
class SystemAlert {
    private AlertSeverity severity;
    private String message;
    private int errorCode;
    private LocalDateTime timestamp;
    private String process;

    private SystemAlert(AlertSeverity severity, String message, int errorCode, LocalDateTime timestamp, String process) {
        this.severity = severity;
        this.message = message;
        this.errorCode = errorCode;
        this.timestamp = timestamp;
        this.process = process;
    }

    public static SystemAlert create(AlertSeverity severity, String message, int errorCode, LocalDateTime timestamp, String process) {
        return new SystemAlert(severity, message, errorCode, timestamp, process);
    }

    public AlertSeverity getSeverity() {
        return severity;
    }

    public String getMessage() {
        return message;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getProcessName() {
        return process;
    }
}