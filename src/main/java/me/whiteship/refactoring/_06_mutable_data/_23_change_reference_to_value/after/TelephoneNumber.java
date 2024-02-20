package me.whiteship.refactoring._06_mutable_data._23_change_reference_to_value.after;

import java.util.Objects;

/**
 * Record와 동일.
 * Getter, Setter 만들 때 Intellij에서 Getter는 Record Style로, Setter는 Builder Style로 선언 가능
 */

public class TelephoneNumber {

    private final String areaCode;

    private final String number;

    public TelephoneNumber(String areaCode, String number) {
        this.areaCode = areaCode;
        this.number = number;
    }

    public String areaCode() {
        return areaCode;
    }

    public String number() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TelephoneNumber that = (TelephoneNumber) o;
        return Objects.equals(areaCode, that.areaCode) && Objects.equals(number, that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(areaCode, number);
    }


}
