public class EmailNotification implements NotificationStrategy {
    @Override
    public void send() {
        // Kirim Email
        System.out.println("Sending Email notification");
    }
}