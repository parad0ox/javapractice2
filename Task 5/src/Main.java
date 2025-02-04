public class Main {
    public static void main(String[] args) {
        WindowManager manager = new WindowManager();
        Window mainWindow = manager.getWindow();

        VerticalLayout layout = new VerticalLayout("mainLayout", 800, 600);
        Button button1 = new Button("btnSubmit", "Submit", "submit.png");
        Button button2 = new Button("btnCancel", "Cancel", "cancel.png");

        layout.addComponent(button1);
        layout.addComponent(button2);
        mainWindow.addComponent(layout);

        manager.draw();
    }
}
