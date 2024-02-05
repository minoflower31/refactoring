package me.whiteship.refactoring._04_long_parameter_list._15_remove_flag_argument.self;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShipmentTest {

    @Test
    void deliveryDate() {
        LocalDate placedOn = LocalDate.of(2021, 12, 15);
        Order orderFromWA = new Order(placedOn, "WA");

        Shipment shipment = new Shipment();
        shipment.setRushState(true);
        assertEquals(placedOn.plusDays(1), shipment.deliveryDate(orderFromWA));

        shipment.setRushState(false);
        assertEquals(placedOn.plusDays(2), shipment.deliveryDate(orderFromWA));
    }

}