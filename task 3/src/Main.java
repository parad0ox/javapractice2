public class Main {
    public static void main(String[] args) {
        WindowController windowController = new WindowController();

        CopyCommand copyCommand = new CopyCommand();
        CutCommand cutCommand = new CutCommand("Sample Text", 1);
        Window window = new Window();
        InsertCommand insertCommand = new InsertCommand("Hello, CZI!", window);

        windowController.addCommand(copyCommand);
        windowController.addCommand(cutCommand);
        windowController.addCommand(insertCommand);

        windowController.executeAllPendingCommands();

        windowController.undoChanges(2);
    }
}
