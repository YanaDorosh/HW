package com.solvd.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesIO {

    private static String separator = File.separator;
    private static String PATH = "src/res/files/path/path.properties";

    public String getValueFromProperties(int key) {
        Properties properties = new Properties();
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(PATH);
            properties.load(inputStream);
            inputStream.close();
            return properties.getProperty(String.valueOf(key));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "default";
    }

    public void setValueToProperties(int key, String value) {
        Properties properties = new Properties();
        try {
            FileOutputStream outputStream = new FileOutputStream(PATH);
            properties.setProperty(String.valueOf(key), String.valueOf(value));
            properties.store(outputStream, "");
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}


