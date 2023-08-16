package com.example.kodirovka;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class HelloController {
    @FXML
    TextArea vvod;
    @FXML
    TextArea result;
    @FXML
    Button button;


        public void doResult() throws FileNotFoundException {
            List<String> decrypted=vvodTeksta();
            Map<String,String> slovar=slovar();
            decrypted.replaceAll(a->slovar.get():slovar.containsKey());
        }

        public List<String> vvodTeksta() throws FileNotFoundException {
            File file = new File("1.txt");
            Scanner scanner = new Scanner(file);
            ArrayList<String> arrayList = new ArrayList<>();
            while (scanner.hasNextLine()) {
                arrayList.add(scanner.nextLine());
            }
            return arrayList;
        }

        public Map<String, String> slovar() throws FileNotFoundException {
            File file = new File("2.txt");
            Scanner scanner = new Scanner(file);
            Map<String, String> map = new HashMap<>();
            List<String> list;
            String key = "";
            String value="";
            while (scanner.hasNextLine()) {
                list= new ArrayList<>(List.of(scanner.nextLine().split(" ")));
                for (int i = 0; i < list.size(); i++) {
                    if (i == 0) {
                        key = list.get(i);
                } else {
                    value+= Integer.parseInt(list.get(i));
                    }
                } map.put(key,value);
            }

            return map;
        }
    }




