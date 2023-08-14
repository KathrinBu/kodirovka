package com.example.kodirovka;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class HelloController {
    @FXML
    TextArea vvod;
    @FXML
    TextArea result;

public class Result{


    public Result() throws FileNotFoundException {
        File file=new File("1.txt");
        Scanner scanner=new Scanner(file);
        TreeSet<String> treeSet = new TreeSet<>();
        while (scanner.hasNextLine()){
            treeSet.add(scanner.nextLine());
        }
        File file2=new File("2.txt");
        Scanner scanner1=new Scanner(file2);
        Map<String, String> secret = new HashMap<>();
        String[] keys=new String[10];
        String[] values=new String[10];

        while (scanner1.hasNextLine()){
            secret.put(keys.toString(),values.toString());
        }
        if(treeSet.contains(keys)){
            treeSet.getClass().replace);
        }
    }
}
}
