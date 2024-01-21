package org.example.entity.person;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PersonInfo {
    @JsonProperty("FindPersonInfo")
    private FindPersonInfo findPersonInfo;

    public FindPersonInfo getFindPersonInfo() {
        return findPersonInfo;
    }

    public void setFindPersonInfo(FindPersonInfo findPersonInfo) {
        this.findPersonInfo = findPersonInfo;
    }

    @Override
    public String toString() {
        return "PersonInfo{" +
                "findPersonInfo=" + findPersonInfo +
                '}';
    }
}
