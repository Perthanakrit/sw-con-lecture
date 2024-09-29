package communication;

public interface Messenger {
    void send(String message);
    void receive(String message);
}
