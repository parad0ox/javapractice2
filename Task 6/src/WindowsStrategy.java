class WindowsStrategy implements OutputStrategy {
    public void print(CustomDocument document) {
        System.out.println("Windows: Printing " + document.getName());
    }

    public void sendViaMail(CustomDocument document) {
        System.out.println("Windows: Sending via Mail " + document.getName());
    }

    public void sendViaTelegram(CustomDocument document) {
        System.out.println("Windows: Sending via Telegram " + document.getName());
    }
}