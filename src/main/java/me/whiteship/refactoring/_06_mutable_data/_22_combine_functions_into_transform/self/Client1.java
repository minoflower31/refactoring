package me.whiteship.refactoring._06_mutable_data._22_combine_functions_into_transform.self;

import java.time.Month;
import java.time.Year;

public class Client1 {

    double baseCharge;

    public Client1(Reading reading) {
        this.baseCharge = Base.calculateBaseCharge(reading);
    }

    public double getBaseCharge() {
        return baseCharge;
    }
}
