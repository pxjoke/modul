package com.epam.module5.task01;

import java.io.*;
import java.nio.file.Path;

/**
 * Created by pxjok on 26.10.2015.
 */
public class TextEditor {

    static void show(Path file) {
        try (FileReader fileReader = new FileReader(file.toString()); BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            StringBuilder stringBuilder = new StringBuilder();
            String tmp;
            while(true){
                tmp = bufferedReader.readLine();
                if (tmp == null) break;
                stringBuilder.append(tmp + "\n");
            }
            System.out.println(stringBuilder);

        } catch (FileNotFoundException nofile) {
            nofile.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void addStringToFile(Path file, String text){
        try(FileWriter fileWriter = new FileWriter(file.toString(), true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter, true)){
            printWriter.println(text);

        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
