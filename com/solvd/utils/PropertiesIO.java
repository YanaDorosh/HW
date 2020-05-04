package com.solvd.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;

public class PropertiesIO {

    public String getValueFromProperties(String path, String key) {
        Properties properties = new Properties();
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(path);
            properties.load(inputStream);
            inputStream.close();
            return properties.getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "default";
    }

    public void setValueToProperties(String path, String key, Collection<?> value) {
        Properties properties = new Properties();
        try {
            FileOutputStream fr = new FileOutputStream(path);
            properties.setProperty(key, String.valueOf(value));
            properties.store(fr, "");
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}


