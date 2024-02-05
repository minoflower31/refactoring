package me.whiteship.refactoring._04_long_parameter_list._14_replace_parameter_with_query.self;

public class Order {

    private final int quantity;

    private final double itemPrice;

    public Order(int quantity, double itemPrice) {
        this.quantity = quantity;
        this.itemPrice = itemPrice;
    }

    public double finalPrice() {
        return this.discountedPrice();
    }

    private double discountedPrice() {
        double basePrice = getBasePrice();
        int discountLevel = getDiscountLevel();

        return discountLevel == 2 ? basePrice * 0.90 : basePrice * 0.95;
    }

    //BasePrice 와 DiscountLevel 은 다른 곳에서도 호출 가능성이 있다 판단하여 메서드 추출

    public int getDiscountLevel() {
        return this.quantity > 100 ? 2 : 1;
    }

    public double getBasePrice() {
        return this.quantity * this.itemPrice;
    }
}
