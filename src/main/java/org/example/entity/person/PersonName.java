package org.example.entity.person;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PersonName {
    @JsonProperty("FirstName")
    private String firstName;

    @JsonProperty("LastName")
    private String lastName;

    @JsonProperty("SecondName")
    private String secondName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "PersonName{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
