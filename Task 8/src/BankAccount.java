import java.time.LocalDateTime;

class BankAccount extends Accountable {
    private User client;
    private Administrator admin;
    private long currentBalance;
    private boolean isCredit;
    private BankAccountType accountType;

    public BankAccount(long id, LocalDateTime creationDate, User client, Administrator admin,
                       long currentBalance, boolean isCredit, BankAccountType accountType) {
        super(id, creationDate);
        this.client = client;
        this.admin = admin;
        this.currentBalance = currentBalance;
        this.isCredit = isCredit;
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "client=" + client +
                ", admin=" + admin +
                ", currentBalance=" + currentBalance +
                ", isCredit=" + isCredit +
                ", accountType=" + accountType +
                ", id=" + id +
                ", creationDate=" + creationDate +
                '}';
    }

    @Override
    public String accept(BankAbstractVisitor visitor) {
        return visitor.visitBank(this);
    }
}
