//ธนกฤต ตระกาจัทร์ 661040206060

package designPattern.strategy.email;

public class Main {
    public static void main(String[] args) {
        Email email1 = new Email("Kwan", "Kate", "Hello");
        Email email2 = new Email("George", "Ken", "Hi");
        EmailSystem emailSystem = new EmailSystem();

        emailSystem.send(new switchCipherSender(), email1);
        emailSystem.send(new caesarSender(2), email2);
    }
}
