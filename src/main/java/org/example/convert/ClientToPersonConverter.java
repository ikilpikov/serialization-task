package org.example.convert;

import org.example.entity.client.ClientInfo;
import org.example.entity.client.Dul;
import org.example.entity.person.FindPersonInfo;
import org.example.entity.person.IdentityCard;
import org.example.entity.person.PersonInfo;
import org.example.entity.person.PersonName;

public class ClientToPersonConverter {
    private ClientInfo clientInfo;

    public ClientToPersonConverter(ClientInfo clientInfo) {
        this.clientInfo = clientInfo;
    }

    public PersonInfo convert() {
        PersonInfo personInfo = new PersonInfo();
        FindPersonInfo findPersonInfo = new FindPersonInfo();
        personInfo.setFindPersonInfo(findPersonInfo);

        PersonName personName = new PersonName();
        findPersonInfo.setPersonName(personName);

        Dul dul = clientInfo.getClientFindInfo().getDul();
        personName.setFirstName(dul.getFirstName());
        personName.setLastName(dul.getLastName());
        personName.setMiddleName(dul.getSecondName());

        IdentityCard identityCard = new IdentityCard();
        findPersonInfo.setIdentityCard(identityCard);
        identityCard.setIdType(dul.getDocumentType());
        identityCard.setIdSeries(dul.getSeries());
        identityCard.setIdNum(dul.getNumber());

        findPersonInfo.setPartyId(clientInfo.getClientFindInfo().getPartyId());

        return personInfo;
    }

}
