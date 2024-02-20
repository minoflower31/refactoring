package me.whiteship.refactoring._06_mutable_data._23_change_reference_to_value.self;

public class Person {

    private final TelephoneNumber officeTelephoneNumber;

    public Person() {
        this.officeTelephoneNumber = new TelephoneNumber();
    }

    public String officeAreaCode() {
        return this.officeTelephoneNumber.areaCode();
    }

    public void officeAreaCode(String areaCode) {
        this.officeTelephoneNumber.areaCode(areaCode);
    }

    public String officeNumber() {
        return this.officeTelephoneNumber.number();
    }

    public void officeNumber(String number) {
        this.officeTelephoneNumber.number(number);
    }

}
