package org.example.entity.person;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FindPersonInfo {
    @JsonProperty("PersonName")
    private PersonName personName;

    public PersonName getPersonName() {
        return personName;
    }

    public void setPersonName(PersonName personName) {
        this.personName = personName;
    }

    @Override
    public String toString() {
        return "FindPersonInfo{" +
                "personName=" + personName +
                '}';
    }
}
