package com.epam.module4.task03;

import java.io.*;

/**
 * Created by pxjok on 25.10.2015.
 */
public class UTF8To16Converter {
    private File inputFile;
    private File outputFile;
    private StringBuilder readText = new StringBuilder();

    public String getReadText(){
        return readText.toString();
    }

    public UTF8To16Converter(File inputFile, File outputFile) {
        this.inputFile = inputFile;
        this.outputFile = outputFile;
    }


    public void readFile() throws IOException {

        try (InputStream fileInputStream = new FileInputStream(inputFile);
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            int c;
            while (true) {
                c = bufferedReader.read();
                if (c == -1) break;
                readText.append((char) c);
            }
        }

    }

    public void writeFile() throws IOException {
        try (OutputStream fileOutputStream = new FileOutputStream(outputFile);
             OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-16");
             BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter)) {
            bufferedWriter.write(readText.toString(), 0, readText.toString().length());
        }
    }

    public void printReadText() {
        System.out.println(readText);
    }


}
