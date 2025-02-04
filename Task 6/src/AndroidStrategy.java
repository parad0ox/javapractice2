public class AndroidStrategy implements OutputStrategy {
    public void print(CustomDocument  document) {
        System.out.println("Android: Printing " + document.getName());
    }

    public void sendViaMail(CustomDocument document) {
        System.out.println("Android: Sending via Mail " + document.getName());
    }

    public void sendViaTelegram(CustomDocument document) {
        System.out.println("Android: Sending via Telegram " + document.getName());
    }
}