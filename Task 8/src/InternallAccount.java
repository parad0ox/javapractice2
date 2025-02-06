import java.time.LocalDateTime;

class InternalAccount extends Accountable {
    private String name;
    private String owner;

    public InternalAccount(long id, LocalDateTime creationDate, String name, String owner) {
        super(id, creationDate);
        this.name = name;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "InternalAccount{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", id=" + id +
                ", creationDate=" + creationDate +
                '}';
    }

    @Override
    public String accept(BankAbstractVisitor visitor) {
        return visitor.visitInternal(this);
    }
}