package com.epam.module4.task01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by pxjok on 22.10.2015.
 */
public class JavaKeyWords {
    private Map<String, Integer> words = new HashMap<>();

    public JavaKeyWords(File filename) {
        try (FileReader fileReader = new FileReader(filename); BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String tmp = null;
            while (true) {
                tmp = bufferedReader.readLine();
                if (tmp == null) break;
                words.put(tmp, 0);

            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public boolean tryInc(String word) {
        if (words.containsKey(word)) {
            Integer tmp = words.get(word);
            words.put(word, tmp + 1);
            return true;
        } else {
            return false;
        }
    }

    public void printAll() {
        System.out.println(words);
    }

    public String usedWords(){
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            if(entry.getValue() > 0){
                result.append(entry.getKey());
                result.append(" ");
                result.append(entry.getValue());
                result.append("\n");
            }
        }
        return result.toString();
    }
}
