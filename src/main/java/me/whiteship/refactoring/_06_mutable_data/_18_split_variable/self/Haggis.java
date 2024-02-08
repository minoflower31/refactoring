package me.whiteship.refactoring._06_mutable_data._18_split_variable.self;

public class Haggis {

    private double primaryForce;
    private double secondaryForce;
    private double mass;
    private int delay;

    public Haggis(double primaryForce, double secondaryForce, double mass, int delay) {
        this.primaryForce = primaryForce;
        this.secondaryForce = secondaryForce;
        this.mass = mass;
        this.delay = delay;
    }

    public double distanceTravelled(int time) {
        double result;
        double primaryAcc = this.primaryForce / this.mass;
        int primaryTime = Math.min(time, this.delay);

        result = 0.5 * primaryAcc * (primaryTime * 2);

        int secondaryTime = time - this.delay;
        if (secondaryTime > 0) {
            double primaryVelocity = primaryAcc * delay;
            double secondaryAcc = (primaryForce + secondaryForce) / mass;
            result += primaryVelocity * secondaryTime + 0.5 * secondaryAcc * (secondaryTime * 2);
        }

        return result;
    }
}
