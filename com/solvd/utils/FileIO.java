package com.solvd.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Scanner;

public class FileIO {

    public String readFromFile(String path) {
        File file = new File(path);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
        return "default";

    }

    public void writeToFile(String path, Collection<?> value) {

        File file = new File(path);
        try {
            PrintWriter printWriter = new PrintWriter(file);
            for (Object list: value){
            printWriter.println(list);
            }
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void writeToFile(String path, String value) {

        File file = new File(path);
        try {
            PrintWriter printWriter = new PrintWriter(file);
                printWriter.println(value);
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
