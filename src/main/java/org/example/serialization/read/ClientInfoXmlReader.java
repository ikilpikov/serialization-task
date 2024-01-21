package org.example.serialization.read;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.example.entity.client.ClientInfo;

import java.io.File;
import java.io.IOException;

public class ClientInfoXmlReader implements Reader<ClientInfo> {
    private static final String CLIENT_INFO_PATH = "src/main/resources/ClientInfo.xml";

    public ClientInfo read() {
        XmlMapper xmlMapper = new XmlMapper();
        ClientInfo clientInfo = null;

        try {
            clientInfo = xmlMapper.readValue(new File(CLIENT_INFO_PATH), ClientInfo.class);
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e);
        }

        return clientInfo;
    }
}
