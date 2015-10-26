package com.epam.module5.task01;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Created by pxjok on 25.10.2015.
 */
public class Task01 {
    public static void main(String[] args) {
        Path file = Paths.get("src\\com\\epam");
        Explorer explorer = new Explorer(file);
        boolean working = true;
        String input;
        explorer.help();
        explorer.printPath();
        try (Scanner scanner = new Scanner(System.in)) {
            while (working) {
                input = scanner.next();
                switch (input) {
                    case "ls":
                        explorer.ls();
                        break;
                    case "up":
                        //explorer.up();
                        break;
                    case "cd":
                        input = scanner.next();
                        explorer.cd(input);
                        break;
                    case "cat":
                        input = scanner.next();
                        explorer.cat(input);
                        break;
                    case "addStr":
                        input = scanner.next();
                        System.out.println("Type text, type :e in the new line to finish");
                        StringBuilder stringBuilder = new StringBuilder();
                        while (!scanner.hasNext(":e")) {
                            stringBuilder.append(scanner.nextLine() + "\n");
                        }
                        explorer.addStringToFile(input, stringBuilder.toString());
                        break;
                    case "delete":
                        input = scanner.next();
                        explorer.delete(input);
                        break;
                    case "create":
                        input = scanner.next();
                        explorer.create(input);
                        break;
                    case "help":
                        explorer.help();
                        break;
                    case "q":
                        working = false;
                        break;

                }

                explorer.printPath();
            }
        }

    }
}
