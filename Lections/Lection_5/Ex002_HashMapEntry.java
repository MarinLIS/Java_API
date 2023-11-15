package Lections.Lection_5;

import java.util.*;

public class Ex002_HashMapEntry {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();
        db.putIfAbsent(1, "один");
        db.put(3, "два");
        db.put(2, "три");
        System.out.println(db); 

        for (var item : db.entrySet()) {// entrySet - итератор для Map
            System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
        }
    }
}