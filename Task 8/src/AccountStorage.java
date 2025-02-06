import java.util.ArrayList;
import java.util.List;

class AccountStorage {
    private List<Accountable> accountList = new ArrayList<>();
    private BankAbstractVisitor serializer;

    public void addAccount(Accountable account) {
        accountList.add(account);
    }

    public void save() {
        for (Accountable account : accountList) {
            System.out.println(account.accept(serializer));
        }
    }

    public void changeFormat(String format) {
        if (format.equalsIgnoreCase("json")) {
            serializer = new BankJsonVisitor();
        } else if (format.equalsIgnoreCase("db")) {
            serializer = new BankDatabaseVisitor();
        }
    }
}
