class DatabaseController {
    private IDatabaseAccessProxy dbHandle;

    public DatabaseController(IDatabaseAccessProxy dbHandle) {
        this.dbHandle = dbHandle;
    }

    public void addClient() {
        dbHandle.executeQueryNoResult(new int[]{1, 2, 3});
        dbHandle.commit();
    }

    public void removeClient() {
        dbHandle.executeQueryNoResult(new int[]{4, 5});
        dbHandle.commit();
    }

    public void modifyOrder() {
        dbHandle.executeQueryNoResult(new int[]{6, 7});
        dbHandle.commit();
    }

    public void addOrder() {
        dbHandle.executeQueryNoResult(new int[]{8, 9});
        dbHandle.commit();
    }

    public void removeOrder() {
        dbHandle.executeQueryNoResult(new int[]{10});
        dbHandle.commit();
    }
}