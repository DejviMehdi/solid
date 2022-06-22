package s.before;

import java.util.Scanner;

public class App {
    public static void execute() {
        Scanner reader = new Scanner(System.in);
        
        MessagePrinter.printWelcomeMessage();

        Person person = new Person();

        MessagePrinter.printQuestionOnFirstName();
        person.setFirstName(reader.next());

        MessagePrinter.printQuestionOnLastName();
        person.setLastName(reader.next());

        PersonValidator.validateFirstName(person);
        PersonValidator.validateLastName(person);

        MessagePrinter.printResult(person);
        MessagePrinter.printGoodbyeMessage();
    }
}
