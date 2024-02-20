package me.whiteship.refactoring._06_mutable_data._20_remove_setting_method.after;

import me.whiteship.refactoring._06_mutable_data._23_change_reference_to_value.after.TelephoneNumber;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TelephoneNumberTest {

    @Test
    void equalsObject() {
        TelephoneNumber telephoneNumber1 = new TelephoneNumber("123", "1234");
        TelephoneNumber telephoneNumber2 = new TelephoneNumber("123", "1234");

        Assertions.assertThat(telephoneNumber1).isEqualTo(telephoneNumber2);
    }
}
