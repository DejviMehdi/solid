package l.before;

public class UnmanagedEmployee extends Employee{
    @Override
    public void assignManager(Employee manager) {
        throw new UnsupportedOperationException("This CEO has no manager");
    }
    
}
