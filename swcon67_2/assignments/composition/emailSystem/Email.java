//ธนกฤต ตระกาจัทร์ 661040206060

package composition.emailSystem;

public class Email {
    private String sender;
    private String recipient;
    private String text;

    public Email(String sender, String recipient, String text) {
        this.sender = sender;
        this.recipient = recipient;
        this.text = text;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getText() {
        return text;
    }
}
