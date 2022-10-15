package essentials;

public class MailService {
    public void sendEmail() {
        this.connect();
        this.auth();
        // send email logic here
        this.disconnect();
    }

    private void connect() {
        System.out.println("connect");
    }

    private void disconnect() {
        System.out.println("disconnect");
    }

    private void auth() {
        System.out.println("authenticate");
    }
}
