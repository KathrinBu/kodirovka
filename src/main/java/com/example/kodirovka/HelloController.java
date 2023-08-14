package com.example.kodirovka;

import javafx.fxml.FXML;
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
        ArrayList<String> arrayList=new ArrayList<>();
        int count=0;
        while (scanner.hasNextLine()){
            arrayList.add(scanner.nextLine());
            count++;
        }
        Map<Integer, String> map=new HashMap<>();
        Collection<Integer> collection=map.keySet();
        for (String str:arrayList) {
            map.put(count,str);
        }
        File file2=new File("2.txt");
        Scanner scanner1=new Scanner(file2);
        String[] keys =scanner1.nextLine().split(" ");
        String[] a=new String[(keys.length+1)/2];
        String[] b=new String[(keys.length-a.length)];

                for (Integer k: collection) {
                    String s= map.get(k);
                    for (int i = 0; i < keys.length; i++) {
                        if(s.equals(a.toString())){
                            map.replace(k,s,b.toString());

                        }
                    }

                }
            }
        }


        }



