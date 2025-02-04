import java.time.LocalDateTime;
class CustomDocument {
    private String name;
    private LocalDateTime createdDate;
    private String content;
    private User signedBy;

    public CustomDocument(String name, String content, User signedBy) {
        this.name = name;
        this.createdDate = LocalDateTime.now();
        this.content = content;
        this.signedBy = signedBy;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public String getContent() {
        return content;
    }

    public User getSignedBy() {
        return signedBy;
    }
}
