package o.before;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Applicant> applicants = Arrays.asList(
                new Applicant("William", "Ardianto", EmployeeType.staff),
                new Applicant("Wilson", "Lim", EmployeeType.manager),
                new Applicant("Wesley", "Lim", EmployeeType.executive)
        );

        List<Employee> employees = new ArrayList<>();
        Accounts accountProcessor = new Accounts();

        applicants.forEach(person -> employees.add(accountProcessor.create(person)));

        for (Employee employee : employees) {
            System.out.println(String.format("%s %s: %s IsManager: %s IsExecutive: %s",
             employee.getFirstName(), employee.getLastName(), employee.getEmail(), employee.isManager(),
              employee.isExecutive()));
        }
    }
}
