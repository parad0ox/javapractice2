abstract class BankAbstractVisitor {
    public abstract String visitUser(User user);
    public abstract String visitAdministrator(Administrator admin);
    public abstract String visitBank(BankAccount bankAccount);
    public abstract String visitInternal(InternalAccount internalAccount);
}