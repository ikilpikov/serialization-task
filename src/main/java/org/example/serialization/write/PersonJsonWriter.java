package org.example.serialization.write;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.json.JsonMapper;
import org.example.entity.person.PersonInfo;

import java.io.File;
import java.io.IOException;

public class PersonJsonWriter implements Writer<PersonInfo> {
    public void write(File file, PersonInfo object) {
        JsonMapper jsonMapper = new JsonMapper();
        jsonMapper.enable(SerializationFeature.WRAP_ROOT_VALUE);

        try {
            jsonMapper.writeValue(file, object);
        } catch (IOException e) {
            System.out.println("Ошибка при записи JSON файла.");
        }
    }

}
