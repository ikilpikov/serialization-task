package org.example.entity.client;

public class ClientInfo {
    private ClientFindInfo clientFindInfo;

    public ClientFindInfo getClientFindInfo() {
        return clientFindInfo;
    }

    @Override
    public String toString() {
        return "ClientInfo{" +
                "clientFindInfo=" + clientFindInfo +
                '}';
    }
}
