class CutCommand extends AbstractCommand {
    private String text;
    private int startLine;

    public CutCommand(String text, int startLine) {
        this.text = text;
        this.startLine = startLine;
    }

    @Override
    public void execute() {
        System.out.println("Cutting text: " + text + " from line: " + startLine);
    }

    @Override
    public void undo() {
        System.out.println("Undoing Cut Command");
    }
}
