package com.epam.module4.task01;

import java.io.*;

/**
 * Created by pxjok on 22.10.2015.
 */
public class IOTest {
    public static void main(String[] args) {
        File file = new File("src\\com\\epam\\module4\\task01\\io.txt");
        try (InputStream inputStream = new FileInputStream(file)) {
            int availableBytes = inputStream.available();
            System.out.println("Available: " + availableBytes);
            int c;
            while (true) {
                c = inputStream.read();
                if (c < 0) break;
                System.out.println("Readed int: " + c);
                System.out.println("Readed char: " + (char)c);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
