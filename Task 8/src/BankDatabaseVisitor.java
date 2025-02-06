class BankDatabaseVisitor extends BankAbstractVisitor {
    @Override
    public String visitUser(User user) {
        return "DB User: " + user.toString();
    }

    @Override
    public String visitAdministrator(Administrator admin) {
        return "DB Administrator: " + admin.toString();
    }

    @Override
    public String visitBank(BankAccount bankAccount) {
        return "DB BankAccount: " + bankAccount.toString();
    }

    @Override
    public String visitInternal(InternalAccount internalAccount) {
        return "DB InternalAccount: " + internalAccount.toString();
    }
}