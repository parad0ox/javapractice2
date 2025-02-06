import java.time.LocalDateTime;


abstract class Accountable {
    protected long id;
    protected LocalDateTime creationDate;

    public Accountable(long id, LocalDateTime creationDate) {
        this.id = id;
        this.creationDate = creationDate;
    }

    public abstract String toString();
    public abstract String accept(BankAbstractVisitor visitor);
}