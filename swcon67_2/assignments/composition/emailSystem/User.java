//ธนกฤต ตระกาจัทร์ 661040206060

package composition.emailSystem;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<Email> inbox;

    public User(String username) {
        this.username = username;
        this.inbox = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<Email> getInbox() {
        return inbox;
    }

    public void addRecipient(Email email) {
        inbox.add(email);
    }

    public void readInbox() {
        if (inbox.isEmpty()) {
            System.out.println("No emails for " + getUsername());
        } else {
            for (Email email : inbox) {
                System.out.println("************");
                System.out.println("From: " + email.getSender());
                System.out.println("To: " + email.getRecipient());
                System.out.println(email.getText());
                System.out.println("************");
            }
        }
    }
}
