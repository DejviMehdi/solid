package s.before;

public class PersonValidator {
    public static void validateFirstName(Person person) {
        if (person.getFirstName() == null || person.getFirstName().isEmpty()) {
            System.out.println("You did not give us a valid first name!");
        }
    }

    public static void validateLastName(Person person) {
        if (person.getLastName() == null || person.getLastName().isEmpty()) {
            System.out.println("You did not give us a valid last name!");
        }
    }
}
