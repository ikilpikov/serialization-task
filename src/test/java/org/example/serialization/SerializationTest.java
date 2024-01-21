package org.example.serialization;

import org.example.convert.ClientToPersonConverter;
import org.example.entity.client.ClientInfo;
import org.example.entity.person.PersonInfo;
import org.example.serialization.read.ClientInfoXmlReader;
import org.example.serialization.read.Reader;
import org.example.serialization.write.PersonJsonWriter;
import org.example.serialization.write.Writer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SerializationTest {
    Reader<ClientInfo> reader;
    @BeforeEach
    void setUp() {
        reader = new ClientInfoXmlReader();
    }

    @Test
    void compareExpectedAndActualPersonInfoJson() throws IOException {
        String expected = getExpectedJsonContents();
        String actual = getActualJsonContents();

        assertEquals(expected, actual);
    }

    String getExpectedJsonContents() throws IOException {
        String expectedJsonPath = "src/main/resources/PersonInfoExpected.json";
        String expectedJsonContent = new String(Files.readAllBytes(Paths.get(expectedJsonPath)));

        expectedJsonContent = expectedJsonContent.replace(" ", "");
        expectedJsonContent = expectedJsonContent.replace("\n", "");

        return expectedJsonContent;
    }

    String getActualJsonContents() throws IOException {
        ClientInfo clientInfo = reader.read();

        ClientToPersonConverter converter = new ClientToPersonConverter(clientInfo);
        PersonInfo personInfo = converter.convert();

        String actualJsonPath = "src/main/resources/PersonInfo.json";
        File actualJson = new File(actualJsonPath);

        Writer<PersonInfo> writer = new PersonJsonWriter();
        writer.write(actualJson, personInfo);

        return new String(Files.readAllBytes(Paths.get(actualJsonPath)));
    }

}
