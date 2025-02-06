public class Main {
    public static void main(String[] args) {
        DBAccess dbAccess = new DBAccess();
        DBAccessProxy proxy = new DBAccessProxy(dbAccess);
        DatabaseController controller = new DatabaseController(proxy);

        proxy.open("jdbc:mysql://localhost:3306/mydatabase");

        controller.addClient();
        controller.addOrder();
        controller.removeOrder();

        proxy.close();
    }
}\