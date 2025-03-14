
public class Email {
    // class attributes
    String subject;
    String sender;
    String message;

    // class constructor
    public Email(String subject, String sender, String message) {
        this.subject = subject; // this is a keyword in Java which refers to the current object
        this.sender = sender;
        this.message = message;
    }
}
