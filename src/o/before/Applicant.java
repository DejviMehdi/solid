package o.before;

public class Applicant extends Base {
    private EmployeeType typeOfEmployee;

    public Applicant(String firstName, String lastName, EmployeeType typeOfEmployee) {
        super.setFirstName(firstName);
        super.setLastName(lastName);
        this.typeOfEmployee = typeOfEmployee;
    }

    public EmployeeType getTypeOfEmployee() {
        return this.typeOfEmployee;
    }

    public void setTypeOfEmployee(EmployeeType typeOfEmployee) {
        this.typeOfEmployee = typeOfEmployee;
    }

}
