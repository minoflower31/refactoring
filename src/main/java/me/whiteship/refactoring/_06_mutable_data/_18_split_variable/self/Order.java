package me.whiteship.refactoring._06_mutable_data._18_split_variable.self;

public class Order {

    public double discount(double inputValue, int quantity) {
        if (inputValue > 50) inputValue -= 2;
        if (quantity > 100) inputValue -= 1;
        return inputValue;
    }
}
