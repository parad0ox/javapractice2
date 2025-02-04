class Application {
    private OutputController controller;

    public Application() {
        CustomDocument doc = new CustomDocument("TestReport", "Sample Content", new User("Alice", "Smith"));
        controller = new OutputController(doc);

        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("win")) {
            controller.setStrategy(new WindowsStrategy());
        } else if (os.contains("linux")) {
            controller.setStrategy(new LinuxStrategy());
        } else if (os.contains("mac")) {
            controller.setStrategy(new MacStrategy());
        } else {
            controller.setStrategy(new AndroidStrategy());
        }
    }

    public void run() {
        controller.print();
        controller.sendViaMail();
    }
}
