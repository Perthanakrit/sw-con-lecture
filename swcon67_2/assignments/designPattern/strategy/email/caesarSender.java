//ธนกฤต ตระกาจัทร์ 661040206060

package designPattern.strategy.email;

import java.util.List;
import java.util.Map;

public class caesarSender implements Messager {
    int key;
    public caesarSender(int key) {
        this.key = key;
    }

    @Override
    public String encrypt(Email m) {
        char[] data = m.getText().toCharArray();
        for (int i = 0; i < data.length; i++) {
            data[i] = (char)(data[i] + key);
        }

        return new String(data);
    }
}
