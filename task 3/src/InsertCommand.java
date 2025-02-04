class InsertCommand extends AbstractCommand {
    private String text;
    private Window windowToInsert;

    public InsertCommand(String text, Window windowToInsert) {
        this.text = text;
        this.windowToInsert = windowToInsert;
    }

    @Override
    public void execute() {
        System.out.println("Inserting text: " + text);
    }

    @Override
    public void undo() {
        System.out.println("Undoing Insert Command");
    }
}
