package me.whiteship.refactoring._07_divergent_change._26_extract_class.after;

public record TelephoneNumber(String areaCode, String number) {

    public String print() {
        return this.areaCode() + " " + this.number();
    }
}