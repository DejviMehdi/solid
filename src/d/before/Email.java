package d.before;

public class Email implements SendEmailMessage {
    @Override
    public void sendEmail(Person person, String message) {
        System.out.printf("Simulating sending an email to %s", person.email);
    }
}
