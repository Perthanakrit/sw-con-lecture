//ธนกฤต ตระกาจัทร์ 661040206060

package composition.emailSystem;

import java.util.ArrayList;
import java.util.List;

public class EmailSystem {
    private List<User> users;
    private User currentUser;

    public EmailSystem() {
        users = new ArrayList<>() {
            {
                add(new User("sacc"));
                add(new User("usa"));
                add(new User("ruj"));
            }
        };
    }

    public void login(String usernme) {
       currentUser = findUser(usernme);

        if (currentUser == null) {
            currentUser = new User(usernme);
            users.add(currentUser);
        }
    }

    public void logout() {
        currentUser = null;
    }

    public void sendEmail(String to, String text) {
        User recipient = findUser(to);
        if (recipient != null) {
            Email email = new Email(currentUser.getUsername(), recipient.getUsername(), text);
            recipient.addRecipient(email);
            System.out.println(String.format("Email to %s is Sent", recipient.getUsername()));
        }
        else {
            users.add(new User(to));
        }
    }

    public void readEmails() {
        if (currentUser != null) {
            currentUser.readInbox();
        }
    }

    private User findUser(String username) {
      for (User user : users) {
          if (user.getUsername().equals(username)) {
              return user;
          }
      }
       return null;
    }
}
