class WindowManager {
    private Window window;

    public WindowManager() {
        this.window = new Window("mainWindow", "Main Application", 800, 600);
    }

    public void draw() {
        window.draw();
    }

    public Window getWindow() {
        return window;
    }
}
