package com.epam.module4.task03;

import java.io.File;
import java.io.IOException;

/**
 * Created by pxjok on 25.10.2015.
 */
public class Task03 {
    public static void main(String[] args) {
        File input = new File("src\\com\\epam\\module4\\task03\\text.txt");
        File output = new File("src\\com\\epam\\module4\\task03\\output.txt");

        UTF8To16Converter converter = new UTF8To16Converter(input, output);
        try {
            converter.readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

       converter.printReadText();

        try {
            converter.writeFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
