package org.example.entity.person;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FindPersonInfo {
    @JsonProperty("PersonName")
    private PersonName personName;

    @JsonProperty("IdentityCard")
    private IdentityCard identityCard;

    @JsonProperty("PartyID")
    private int partyId;

    public PersonName getPersonName() {
        return personName;
    }

    public IdentityCard getIdentityCard() {
        return identityCard;
    }

    public int getPartyId() {
        return partyId;
    }

    public void setPersonName(PersonName personName) {
        this.personName = personName;
    }

    public void setIdentityCard(IdentityCard identityCard) {
        this.identityCard = identityCard;
    }

    public void setPartyId(int partyId) {
        this.partyId = partyId;
    }

    @Override
    public String toString() {
        return "FindPersonInfo{" +
                "personName=" + personName +
                ", identityCard=" + identityCard +
                ", partyId=" + partyId +
                '}';
    }
}
