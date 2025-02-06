class BankJsonVisitor extends BankAbstractVisitor {
    @Override
    public String visitUser(User user) {
        return "JSON User: " + user.toString();
    }

    @Override
    public String visitAdministrator(Administrator admin) {
        return "JSON Administrator: " + admin.toString();
    }

    @Override
    public String visitBank(BankAccount bankAccount) {
        return "JSON BankAccount: " + bankAccount.toString();
    }

    @Override
    public String visitInternal(InternalAccount internalAccount) {
        return "JSON InternalAccount: " + internalAccount.toString();
    }
}