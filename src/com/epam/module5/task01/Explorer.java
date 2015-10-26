package com.epam.module5.task01;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by pxjok on 26.10.2015.
 */
public class Explorer {
    Path path;
    Path root;
    Path tmp;


    public Explorer(Path path) {
        this.path = path.normalize();
        this.root = path.normalize();
    }

    public void ls() {
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)) {
            for (Path entry : directoryStream) {
                System.out.println(entry.getFileName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cd(String dest) {
        resolveTmp(dest);
        if (isTmpDirectory() && isTmpExists()) {
            if (isTmpInRoot()) {
                path = tmp.normalize();
            } else {
                System.out.println(tmp + " is went over the root directory!");
            }
        } else {
            System.out.println("No such directory");
        }
    }

    public void cat(String fileName) {
        resolveTmp(fileName);
        if (isTmpExists() && isTmpReadable() && !isTmpDirectory()) {
            if (isTmpInRoot()) {
                TextEditor.show(tmp);
            } else {
                System.out.println(tmp + " is went over the root directory!");
            }
        } else {
            System.out.println("No such File");
        }
    }

    public void addStringToFile(String fileName, String text){
        resolveTmp(fileName);
        if (isTmpExists() && isTmpReadable() && !isTmpDirectory()) {
            if (isTmpInRoot()) {
                TextEditor.addStringToFile(tmp, text);
            } else {
                System.out.println(tmp + " is went over the root directory!");
            }
        } else {
            System.out.println("No such File");
        }
    }

    public void delete(String file){
        resolveTmp(file);
        if (isTmpExists() && isTmpReadable() && !isTmpDirectory()) {
            if (isTmpInRoot()) {
                try {
                    Files.delete(tmp);
                } catch (IOException e) {
                    System.out.println("File doesn't exist!");
                }
            } else {
                System.out.println(tmp + " is went over the root directory!");
            }
        } else {
            System.out.println("No such File");
        }
    }

    public void create(String file){
        resolveTmp(file);

        if(isTmpExists()){
            System.out.println("File already exists!");
            return;
        }

        if(!isTmpInRoot()){
            System.out.println(tmp + " is went over the root directory!");
            return;
        }

        try {
            Files.createFile(tmp);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printPath() {
        System.out.print(path + "> ");

    }

    private boolean isTmpInRoot() {
        try {
            System.out.println(tmp.subpath(0, root.getNameCount()));
            if (tmp.subpath(0, root.getNameCount()).equals(root)) {
                return true;
            }
        } catch (IllegalArgumentException e) {
            return false;
        }
        return false;
    }

    private void resolveTmp(String dest) {
        tmp = Paths.get(path.toString());
        tmp = tmp.resolve(Paths.get(dest).normalize()).normalize();
    }

    private boolean isTmpDirectory() {
        return Files.isDirectory(tmp);
    }

    private boolean isTmpReadable() {
        return Files.isReadable(tmp);
    }

    private boolean isTmpExists() {
        return Files.exists(tmp);
    }

    public void help() {

        System.out.println("Available commands:");
        System.out.println("------------------------");
        System.out.println("cd path (Unix Like)");
        System.out.println("ls (Unix like)");
        System.out.println("cat fileName (Unix like)");
        System.out.println("create path (Creates file)");
        System.out.println("delete path (Delete specified file");
        System.out.println("addStr path (Add text to specified file, to finish text adding just press Enter and type :e)");
        System.out.println("q for exit");
        System.out.println("------------------------");

    }
}
