package com.epam.module4.task01;

import java.io.*;

/**
 * Created by pxjok on 22.10.2015.
 */
public class JavaKeyWordsCounter {
    private File file;
    private JavaKeyWords keyWords;
    private final int A = 65;
    private final int Z = 90;
    private final int a = 97;
    private final int z = 122;

    JavaKeyWordsCounter(File file, File keyWordsFile) {
        this.file = file;
        keyWords = new JavaKeyWords(keyWordsFile);
    }

    public void parseWithInputStream() {
        try (InputStream inputStream = new FileInputStream(file); BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream)) {
            int c;
            String tmp = "";
            while (true) {
                c = bufferedInputStream.read();
                if (c == -1) {
                    keyWords.tryInc(tmp);
                    break;
                }
                if (isLetter(c)) {
                    tmp += (char) c;
                } else {
                    if (tmp != "") {
                        keyWords.tryInc(tmp);
                        tmp = "";
                    }
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void parseWithReader() {
        try (Reader reader = new FileReader(file); BufferedReader bufferedReader = new BufferedReader(reader)) {
            int c;
            String tmp = "";
            while (true) {
                c = bufferedReader.read();
                if (c == -1) {
                    keyWords.tryInc(tmp);
                    break;
                }
                if (isLetter(c)) {
                    tmp += (char) c;
                } else {
                    if (tmp != "") {
                        keyWords.tryInc(tmp);
                        tmp = "";
                    }
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean isLetter(int c) {
        if ((c >= A && c <= Z) || c >= a && c <= z) return true;
        return false;
    }

    public void printAll() {
        keyWords.printAll();
    }

    public void printUsed() {
        System.out.println(keyWords.usedWords());
    }

    public void printToFileWithStream(File outputFile) throws IOException {
        try (OutputStream outputStream = new FileOutputStream(outputFile); BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream)) {
            byte[] b = keyWords.usedWords().getBytes();
            bufferedOutputStream.write(b, 0, b.length);
        }
    }

    public void printToFileWithWriter(File outputFile) throws IOException {
        try (Writer writer = new FileWriter(outputFile); BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            char[] b = keyWords.usedWords().toCharArray();
            bufferedWriter.write(b, 0, b.length);
        }
    }

}
