package com.epam.module4.task01;

import java.io.File;
import java.io.IOException;

/**
 * Created by pxjok on 22.10.2015.
 */
public class Task01 {
    public static void main(String[] args) {
        File file = new File("src\\com\\epam\\module4\\task01\\keywords.txt");
        File progFile = new File("src\\com\\epam\\module4\\task01\\JavaKeyWordsCounter.java");
        File outputFile = new File("src\\com\\epam\\module4\\task01\\out.txt");
        JavaKeyWordsCounter javaKeyWordsCounter = new JavaKeyWordsCounter(progFile, file);
        javaKeyWordsCounter.parseWithReader();
        javaKeyWordsCounter.printAll();
        javaKeyWordsCounter.printUsed();

        try {
            javaKeyWordsCounter.printToFileWithWriter(outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
