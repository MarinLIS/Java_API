package Lections.Lection_5;

import java.util.*;
 
public class Ex001_HashMap {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();
        db.putIfAbsent(1, "один"); // метод делает проверку на наличие
        db.put(2, "два"); // если добавляем одинаковые значения - они будут перезаписаны
        db.put(null, "!null"); 
        System.out.println(db); // {null=!null, 1=один, 2=два}
        System.out.println(db.get(44));
        //db.remove(null); 
        System.out.println(db); // {1=один, 2=два}
        System.out.println(db.containsValue("один")); // true если содержит значение
        System.out.println(db.containsValue(1)); // false 
        System.out.println(db.containsKey("один")); // falseесли содержит ключ
        System.out.println(db.containsKey(1)); // true
        System.out.println(db.keySet());//получить все ключи
        System.out.println(db.values()); // получить все значения


    }
}