package org.example.entity.person;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IdentityCard {
    @JsonProperty("IdType")
    private int idType;

    @JsonProperty("IdSeries")
    private int idSeries;

    @JsonProperty("IdNum")
    private int idNum;

    public int getIdType() {
        return idType;
    }

    public int getIdSeries() {
        return idSeries;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    public void setIdSeries(int idSeries) {
        this.idSeries = idSeries;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    @Override
    public String toString() {
        return "IdentityCard{" +
                "idType=" + idType +
                ", idSeries=" + idSeries +
                ", idNum=" + idNum +
                '}';
    }
}
