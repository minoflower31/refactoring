package me.whiteship.refactoring._06_mutable_data._19_separate_query_from_modifier.self;

import me.whiteship.refactoring._06_mutable_data._19_separate_query_from_modifier.Person;

import java.util.List;

public class Criminal {

    public String alertForMiscreant(List<Person> people) {
        for (Person p : people) {
            if (p.getName().equals("Don") || p.getName().equals("John")) {
                setOffAlarms();
                return p.getName();
            }
        }

        return "";
    }

    private void setOffAlarms() {
        System.out.println("set off alarm");
    }
}
