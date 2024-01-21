package org.example;

import org.example.convert.ClientToPersonConverter;
import org.example.entity.person.PersonInfo;
import org.example.serialization.read.ClientInfoXmlReader;
import org.example.entity.client.ClientInfo;
import org.example.serialization.read.Reader;
import org.example.serialization.write.PersonJsonWriter;
import org.example.serialization.write.Writer;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Reader<ClientInfo> reader = new ClientInfoXmlReader();
        ClientInfo clientInfo = reader.read();

        ClientToPersonConverter converter = new ClientToPersonConverter(clientInfo);
        PersonInfo personInfo = converter.convert();

        String path = "src/main/resources/PersonInfo.json";
        File file = new File(path);
        Writer<PersonInfo> writer = new PersonJsonWriter();
        writer.write(file, personInfo);
    }
}