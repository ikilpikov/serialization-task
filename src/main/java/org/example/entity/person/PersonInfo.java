package org.example.entity.person;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PersonInfo {
    @JsonProperty("FindPersonInfo")
    private FindPersonInfo findPersonInfo;

    @JsonProperty("IdentityCard")
    private IdentityCard identityCard;

    @JsonProperty("PartyId")
    private int partyId;

    public FindPersonInfo getFindPersonInfo() {
        return findPersonInfo;
    }

    public IdentityCard getIdentityCard() {
        return identityCard;
    }

    public int getPartyId() {
        return partyId;
    }

    public void setFindPersonInfo(FindPersonInfo findPersonInfo) {
        this.findPersonInfo = findPersonInfo;
    }

    public void setIdentityCard(IdentityCard identityCard) {
        this.identityCard = identityCard;
    }

    public void setPartyId(int partyId) {
        this.partyId = partyId;
    }

    @Override
    public String toString() {
        return "PersonInfo{" +
                "findPersonInfo=" + findPersonInfo +
                ", identityCard=" + identityCard +
                ", partyId=" + partyId +
                '}';
    }
}
