package me.whiteship.refactoring._06_mutable_data._22_combine_functions_into_transform.after;

import java.time.Month;
import java.time.Year;

public abstract class ReadingClient {

    protected double taxThreshold(Year year) {
        return 5;
    }

    protected double baseRate(Month month, Year year) {
        return 10;
    }

    protected EnrichReading enrichReading(Reading reading) {
        return new EnrichReading(reading, calculateBaseCharge(reading), calculateTaxableCharge(reading));
    }

    private double calculateBaseCharge(Reading reading) {
        return baseRate(reading.month(), reading.year()) * reading.quantity();
    }

    private double calculateTaxableCharge(Reading reading) {
        return Math.max(0,  - taxThreshold(reading.year()));
    }
}
