package me.whiteship.refactoring._06_mutable_data._22_combine_functions_into_transform.self;

import java.time.Month;
import java.time.Year;

public class Client3 {

    private double basicChargeAmount;

    public Client3(Reading reading) {
        this.basicChargeAmount = Base.calculateBaseCharge(reading);
    }

    public double getBasicChargeAmount() {
        return basicChargeAmount;
    }
}
