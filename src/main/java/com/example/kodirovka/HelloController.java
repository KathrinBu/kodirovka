package com.example.kodirovka;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class HelloController {
    @FXML
    TextArea vvod;
    @FXML
    TextArea result;
    @FXML
    Button button;

        public List<String> doResult() throws FileNotFoundException {
            List<String> decrypted=vvodTeksta();
            Map<String,String> slovar=slovar();
            for (int i = 0; i < decrypted.size(); i++) {
                String word=decrypted.get(i);
                if(slovar.containsKey(word)){
                    String replace=slovar.get(word);
                    decrypted.set(i,replace);
                }
            }
            result.setText(decrypted.toString());
            return decrypted;
        }

        public List<String> vvodTeksta() throws FileNotFoundException {
            File file = new File("1.txt");
            Scanner scanner = new Scanner(file);
            ArrayList<String> arrayList = new ArrayList<>();
            while (scanner.hasNextLine()) {
                arrayList.add(scanner.nextLine());
            }
            vvod.setText(arrayList.toString());
            return arrayList;
        }

        public Map<String, String> slovar() throws FileNotFoundException {
            File file = new File("2.txt");
            Scanner scanner = new Scanner(file);
            Map<String, String> map = new HashMap<>();
            while (scanner.hasNextLine()) {
                String[] columns=scanner.nextLine().split("\s+");
                if (columns.length>=2){
                    String key=columns[0];
                    String value=columns[1];
                    map.put(key,value);
                }
            }

            return map;
        }
    }




