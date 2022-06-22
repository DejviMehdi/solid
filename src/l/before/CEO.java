package l.before;

public class CEO extends UnmanagedEmployee {

    @Override
    public void calculatePerHourRate(int rank) {
        double baseAmount = 150;

        salary = baseAmount * rank;
    }

    public void fireSomeone() {
        System.out.println("You're Fired!");
    }
}
