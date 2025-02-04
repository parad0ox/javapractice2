public class MacStrategy implements OutputStrategy {
    public void print(CustomDocument document) {
        System.out.println("Mac: Printing " + document.getName());
    }

    public void sendViaMail(CustomDocument document) {
        System.out.println("Mac: Sending via Mail " + document.getName());
    }

    public void sendViaTelegram(CustomDocument document) {
        System.out.println("Mac: Sending via Telegram " + document.getName());
    }
}