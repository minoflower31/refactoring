package me.whiteship.refactoring._06_mutable_data._21_replace_derived_variable_with_query.self;

import java.util.ArrayList;
import java.util.List;

public class ProductionPlan {

    private double production;
    private List<Double> adjustments = new ArrayList<>();

    public void applyAdjustment(double adjustment) {
        this.adjustments.add(adjustment);
    }

    public void setProduction(double adjustment) {
        this.production += adjustment;
    }

    public double getProduction() {
        return this.production;
    }
}
