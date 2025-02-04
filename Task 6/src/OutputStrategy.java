interface OutputStrategy {
    void print(CustomDocument document);
    void sendViaMail(CustomDocument document);
    void sendViaTelegram(CustomDocument document);
}