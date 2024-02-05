package me.whiteship.refactoring._04_long_parameter_list._15_remove_flag_argument.self;

import java.time.LocalDate;

public class Shipment {

    private Boolean rushState;

    public Shipment() {
        this.rushState = false;
    }

    public LocalDate deliveryDate(Order order) {
        String deliveryState = order.getDeliveryState();
        int deliveryTime = this.rushState ? rush(deliveryState) : unrush(deliveryState);
        
        return order.getPlacedOn().plusDays(deliveryTime);
    }

    public void setRushState(boolean rushState) {
        this.rushState = rushState;
    }

    public int rush(String deliveryState) {
        return switch (deliveryState) {
            case "WA", "CA", "OR" -> 1;
            case "TX", "NY", "FL" -> 2;
            default -> 3;
        };
    }

    public int unrush(String deliveryState) {
        return switch (deliveryState) {
            case "WA", "CA" -> 2;
            case "OR", "TX", "NY" -> 3;
            default -> 4;
        };
    }
}
