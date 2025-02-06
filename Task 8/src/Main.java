import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("USA", "California", "Los Angeles", "Main St", "42", "None");
        User user = new User("John", "Doe", LocalDateTime.of(1990, 1, 1, 0, 0), address);
        Administrator admin = new Administrator("Alice", "Smith", LocalDateTime.of(1985, 5, 15, 0, 0),
                address, "Finance", LocalDateTime.of(2010, 3, 1, 0, 0));
        BankAccount bankAccount = new BankAccount(1, LocalDateTime.now(), user, admin, 100000, true, BankAccountType.PREMIUM);
        InternalAccount internalAccount = new InternalAccount(2, LocalDateTime.now(), "Internal", "System");

        AccountStorage storage = new AccountStorage();
        storage.addAccount(bankAccount);
        storage.addAccount(internalAccount);

        storage.changeFormat("json");
        storage.save();

        storage.changeFormat("db");
        storage.save();
    }
}