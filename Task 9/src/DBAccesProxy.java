import java.time.LocalTime;


class DBAccessProxy implements IDatabaseAccessProxy {
    private DBAccess dbHandle;

    public DBAccessProxy(DBAccess dbHandle) {
        this.dbHandle = dbHandle;
    }

    @Override
    public String executeQuery(int[] lineNumbers) {
        LocalTime startTime = LocalTime.now();
        String result = dbHandle.executeQuery(lineNumbers);
        LocalTime endTime = LocalTime.now();
        System.out.println("Time elapsed: " + (endTime.toNanoOfDay() - startTime.toNanoOfDay()) / 1e6 + " ms");
        return result;
    }

    @Override
    public void executeQueryNoResult(int[] lineNumbers) {
        LocalTime startTime = LocalTime.now();
        dbHandle.executeQueryNoResult(lineNumbers);
        LocalTime endTime = LocalTime.now();
        System.out.println("Time elapsed: " + (endTime.toNanoOfDay() - startTime.toNanoOfDay()) / 1e6 + " ms");
    }

    @Override
    public boolean checkDatabaseStatus() {
        return dbHandle.checkDatabaseStatus();
    }

    @Override
    public void open(String url) {
        dbHandle.open(url);
    }

    @Override
    public void close() {
        dbHandle.close();
    }

    @Override
    public void commit() {
        dbHandle.commit();
    }

    @Override
    public void rollback() {
        dbHandle.rollback();
    }
}