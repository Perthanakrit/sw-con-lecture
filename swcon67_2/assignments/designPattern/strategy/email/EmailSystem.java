//ธนกฤต ตระกาจัทร์ 661040206060

package designPattern.strategy.email;

import java.util.HashMap;
import java.util.List;

public class EmailSystem {
    private HashMap<String, List<Email>> mailboxes;

    public EmailSystem() {
        this.mailboxes = new HashMap<>();
    }

    public void sendCaesar(Email m, int key) {
// encrypt
        char[] data = m.getText().toCharArray();
        for (int i = 0; i < data.length; i++) {
            data[i] = (char)(data[i] + key);
        }
        m.setText(new String(data));
// deliver to corresponding mailbox
        List<Email> box = mailboxes.get(m.getRecipient());
        box.add(m);
    }
    public void sendSwitchCipher(Email m) {
// encrypt
        char[] data = m.getText().toCharArray();
        for (int i = 0; i < data.length - 1; i += 2) {
            char tmp = data[i];
            data[i] = data[i + 1];
            data[i + 1] = tmp;
        }
        m.setText(new String(data));
// deliver to corresponding mailbox
        List<Email> box = mailboxes.get(m.getRecipient());
        box.add(m);
    }

    public HashMap<String, List<Email>> getMailboxes() {
        return mailboxes;
    }

    public void setMailboxes(Email email) {
//       mailboxes.put
    }

    public void send(Messager messager, Email m) {
        String data = messager.encrypt(m);
        m.setText(data);

        List<Email> box = mailboxes.get(m.getRecipient());

        if (box != null) {
           box.add(m);
        }
    }
}
