package me.whiteship.refactoring._06_mutable_data._22_combine_functions_into_transform.self;

import java.time.Month;
import java.time.Year;

public abstract class Base {

    public static double baseRate(Month month, Year year) {
        return 10;
    }

    public static double calculateBaseCharge(Reading reading) {
        return Base.baseRate(reading.month(), reading.year()) * reading.quantity();
    }
}
