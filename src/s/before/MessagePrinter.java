package s.before;

public class MessagePrinter {
    private MessagePrinter() {}

    public static void printWelcomeMessage() {
        System.out.println("Welcome to my application");
    }

    public static void printQuestionOnFirstName() {
        System.out.println("What is your first name: ");
    }

    public static void printQuestionOnLastName() {
        System.out.println("What is your last name: ");
    }

    public static void printResult(Person person) {
        System.out.println(String.format("Your username is %s %s", person.getFirstName(), person.getLastName()));
    }

    public static void printGoodbyeMessage() {
        System.out.println("End of application");
    }
}
