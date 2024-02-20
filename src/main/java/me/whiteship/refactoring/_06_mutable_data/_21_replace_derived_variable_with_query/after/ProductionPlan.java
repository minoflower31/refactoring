package me.whiteship.refactoring._06_mutable_data._21_replace_derived_variable_with_query.after;

import java.util.ArrayList;
import java.util.List;

public class ProductionPlan {

    // 파생된 변수. adjustments로 축적된 값을 확인할 수 있기 때문
    // private double production;
    private List<Double> adjustments = new ArrayList<>();

    public void applyAdjustment(double adjustment) {
        this.adjustments.add(adjustment);
    }

    public double getProduction() {
        // 이 또한 조회라서 저자가 Query라고 부르는 듯
        return this.adjustments.stream().reduce(0d, Double::sum);
    }
}
