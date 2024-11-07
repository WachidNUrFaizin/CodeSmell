import java.util.HashMap;
import java.util.Map;

public class NotificationService {
    private final Map<String, NotificationStrategy> strategies = new HashMap<>();

    public NotificationService() {
        strategies.put("SMS", new SMSNotification());
        strategies.put("EMAIL", new EmailNotification());
        strategies.put("PUSH", new PushNotification());
    }

    public void sendNotification(String type) {
        NotificationStrategy strategy = strategies.get(type);
        if (strategy != null) {
            strategy.send();
        } else {
            throw new IllegalArgumentException("Type not supported");
        }
    }
}