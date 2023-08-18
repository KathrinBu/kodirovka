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

    @FXML
    public void doResult() throws FileNotFoundException {
        List<String> decrypted = vvodTeksta();
        Map<String, String> slovar = slovar();
        decrypted = encrypt(decrypted, slovar);

        result.setText(decrypted.toString());
    }

    public List<String> encrypt(List<String> text, Map<String, String> slovar) {
        for (int i = 0; i < text.size(); i++) {
            //todo пока что в переменной word целая большая фраза. Надо разбивать на слова
            String word = text.get(i);
            if (slovar.containsKey(word)) {
                String replace = slovar.get(word);
                text.set(i, replace);
            }
        }
        return text;
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
            String[] columns = scanner.nextLine().split("\s+");
            if (columns.length >= 2) {
                String key = columns[0];
                String value = columns[1];
                map.put(key, value);
            }
        }

        return map;
    }
}




