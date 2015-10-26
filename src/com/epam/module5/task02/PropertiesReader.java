package com.epam.module5.task02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by pxjok on 26.10.2015.
 */
public class PropertiesReader {
    private Map<String, String> properties = new HashMap<>();
    private StringBuilder key = new StringBuilder();
    private StringBuilder value = new StringBuilder();

    public void load(String fileName) throws IOException, IllegalArgumentException{
        try(FileReader reader = new FileReader(fileName); BufferedReader bufferedReader = new BufferedReader(reader)){
            int c;
            while(true){
               c = bufferedReader.read();
            }
        }
    }

}
