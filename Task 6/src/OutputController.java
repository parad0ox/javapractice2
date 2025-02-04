class OutputController {
    private CustomDocument document;
    private OutputStrategy strategy;

    public OutputController(CustomDocument document) {
        this.document = document;
    }

    public void setStrategy(OutputStrategy strategy) {
        this.strategy = strategy;
    }

    public void print() {
        if (strategy != null) {
            strategy.print(document);
        }
    }

    public void sendViaMail() {
        if (strategy != null) {
            strategy.sendViaMail(document);
        }
    }

    public void sendViaTelegram() {
        if (strategy != null) {
            strategy.sendViaTelegram(document);
        }
    }
}
