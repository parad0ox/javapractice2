class DBAccess implements IDatabaseAccessProxy {
    private String url;
    private boolean isOpen;

    @Override
    public String executeQuery(int[] lineNumbers) {
        return "Executing query for lines: " + lineNumbers.length;
    }

    @Override
    public void executeQueryNoResult(int[] lineNumbers) {
        System.out.println("Executing query with no result for lines: " + lineNumbers.length);
    }

    @Override
    public boolean checkDatabaseStatus() {
        return isOpen;
    }

    @Override
    public void open(String url) {
        this.url = url;
        this.isOpen = true;
        System.out.println("Database opened with URL: " + url);
    }

    @Override
    public void close() {
        this.isOpen = false;
        System.out.println("Database connection closed.");
    }

    @Override
    public void commit() {
        System.out.println("Transaction committed.");
    }

    @Override
    public void rollback() {
        System.out.println("Transaction rolled back.");
    }
}
