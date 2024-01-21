package org.example.serialization.write;

import java.io.File;

public interface Writer<T> {
    void write(File file, T object);
}
