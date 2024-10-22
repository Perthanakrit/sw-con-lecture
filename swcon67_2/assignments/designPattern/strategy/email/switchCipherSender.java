//ธนกฤต ตระกาจัทร์ 661040206060

package designPattern.strategy.email;

import java.util.List;
import java.util.Map;

public class switchCipherSender implements Messager{
    @Override
    public String encrypt(Email m) {
        char[] data = m.getText().toCharArray();
        for (int i = 0; i < data.length-1; i += 2) {
            char tmp = data[i];
            data[i] = data[i+1];
            data[i+1] = tmp;
        }
       return new String(data);
    }
}
