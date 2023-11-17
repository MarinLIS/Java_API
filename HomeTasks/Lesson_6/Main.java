package HomeTasks.Lesson_6;

import java.lang.reflect.Array;
import java.util.HashMap;
/*
 * продумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
 * Реализовать в java.
 * Создать множество ноутбуков
 * Написать метод, который будет заправшивать у пользователя критерий (или критерии) 
 * фильтрации  и выведет ноутбуки, отвечающие фильтру. 
 * критерии фильтрации можно хранить в map. но можно создать эталонный фильтр (эталонный обьект), 
 куда сохранять все заполняемые данные и потом искать по нему
  
 Например:
  "введите цифру, соответствующую необходимому критерию: "
  1 - ОЗУ
  2 - Объем ЖД
  3 - Операционная система
  4 - Цвет
  5 - Поиск

  Далее нужно запросить минимальное значение для указания критериев - сохранить 
  параметры фильтрации можно также в map.
  Отфильтровать ноутбукииз первоначального множества и вывести подходящие по условиям.

 */
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import HomeTasks.Lesson_6.Note;

public class Main {
    public static void main(String[] args) {

        Set<Note> nBooks = new HashSet<>();

        Note nBook1 = new Note();
        nBook1.name = "Honor";
        nBook1.ram = 8;
        nBook1.hdMemory = 256;
        nBook1.operatSys = "Linux";
        nBook1.color = "blue";
        nBook1.stockQty = 5;

        Note nBook2 = new Note();
        nBook2.name = "Huawei";
        nBook2.ram = 8;
        nBook2.hdMemory = 256;
        nBook2.operatSys = "Windows";
        nBook2.color = "black";
        nBook2.stockQty = 2;

        Note nBook3 = new Note();
        nBook3.name = "Toshiba";
        nBook3.ram = 16;
        nBook3.hdMemory = 512;
        nBook3.operatSys = "Windows";
        nBook3.color = "black";
        nBook3.stockQty = 0;

        Note nBook4 = new Note();
        nBook4.name = "Acer";
        nBook4.ram = 16;
        nBook4.hdMemory = 512;
        nBook4.operatSys = "Windows";
        nBook4.color = "white";
        nBook4.stockQty = 4;

        Note nBook5 = new Note();
        nBook5.name = "Apple";
        nBook5.ram = 32;
        nBook5.hdMemory = 1024;
        nBook5.operatSys = "MacOs";
        nBook5.color = "blue";
        nBook5.stockQty = 3;

        Note nBook6 = new Note();
        nBook6.name = "Apple";
        nBook6.ram = 16;
        nBook6.hdMemory = 512;
        nBook6.operatSys = "MacOs";
        nBook6.color = "white";
        nBook6.stockQty = 1;

        nBooks.add(nBook1);
        nBooks.add(nBook2);
        nBooks.add(nBook3);
        nBooks.add(nBook4);
        nBooks.add(nBook5);
        nBooks.add(nBook6);
        
        
        System.out.println(clientChoice(nBooks, clientAnswer()));
        

    }

    static void print(Set<Note> nBooks) {
        for (Note nBook : nBooks) {
            System.out.println(nBook);
        }
    }

    static Set<Note> clientChoice(Set<Note> nBooks, Note nBookClient) {
        Set<Note> res = new HashSet<>();
        for (Note nBook : nBooks) {
            if (nBook.name.equals(nBookClient.name)
                    && nBook.ram == nBookClient.ram
                    && nBook.hdMemory == nBookClient.hdMemory
                    && nBook.operatSys.equals(nBookClient.operatSys)
                    && nBook.color.equals(nBookClient.color)) {
                res.add(nBook);
            }
        }
        if (res.isEmpty()) {
            System.out.println("Ноутбука с такими параметрами нет!");
            System.out.println("Ваши параметры: " + nBookClient);
            System.out.println("Продолжить поиск по: "
                    + "\n1 - " + nBookClient.name + " ?"
                    + "\n2 - " + nBookClient.ram + " ?"
                    + "\n3 - " + nBookClient.color + " ?");
            Scanner scanner = new Scanner(System.in);
            String ans = scanner.nextLine();
            if (ans.equals("1")) {
                System.out.println("Из "+ nBookClient.name + " можем предложить: ");
                print(selectByName(nBooks, nBookClient));
            }
            if (ans.equals("2")) {
                System.out.println("Из " + nBookClient.ram + " можем предложить: ");
                print(selectByRam(nBooks, nBookClient));
            }
            if (ans.equals("3")) {
                System.out.println("Из "+ nBookClient.color + " можем предложить: ");
                print(selectByColor(nBooks, nBookClient));
            }
        }
        return res;
    }

    static Note clientAnswer() {
        Note nBookClient = new Note();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Для поиска введите параметры");
        System.out.println("Выберите производителя?"
                + "\n1 - Honor "
                + "\n2 - Huawei "
                + "\n3 - Toshiba "
                + "\n4 - Acer "
                + "\n5 - Apple ");
        String n = scanner.nextLine();
        if (n.equals("1")) {
            nBookClient.name = "Honor";
        } else if (n.equals("2")) {
            nBookClient.name = "Huawei";
        } else if (n.equals("3")) {
            nBookClient.name = "Toshiba";
        } else if (n.equals("4")) {
            nBookClient.name = "Acer";
        } else if (n.equals("5")) {
            nBookClient.name = "Apple";
        }

        System.out.println("Выберите минимальный объем оперативной памяти?"
                + "\n1 - 8Gb "
                + "\n2 - 16Gb"
                + "\n3 - 32Gb ");
        String r = scanner.nextLine();
        if (r.equals("1")) {
            nBookClient.ram = 8;
        } else if (r.equals("2")) {
            nBookClient.ram = 16;
        } else if (r.equals("3")) {
            nBookClient.ram = 32;
        }

        System.out.println("Выберите минимальный объем памяти ЖД?"
                + "\n1 - 256 Gb "
                + "\n2 - 512 Gb "
                + "\n3 - 1024 Gb ");
        String hd = scanner.nextLine();
        if (hd.equals("1")) {
            nBookClient.hdMemory = 256;
        } else if (hd.equals("2")) {
            nBookClient.hdMemory = 512;
        } else if (hd.equals("3")) {
            nBookClient.hdMemory = 1024;
        }

        System.out.println("Выберите ПУ операционную систему?"
                + "\n1 - Windows "
                + "\n2 - Linux "
                + "\n3 - MacOs ");
        String op = scanner.nextLine();
        if (op.equals("1")) {
            nBookClient.operatSys = "Windows";
        } else if (op.equals("2")) {
            nBookClient.operatSys = "Linux";
        } else if (op.equals("3")) {
            nBookClient.operatSys = "MacOs";
        }

        System.out.println("Выберите цвет?"
                + "\n1 - blue "
                + "\n2 - white "
                + "\n3 - black ");
        String col = scanner.nextLine();
        if (col.equals("1")) {
            nBookClient.color = "blue";
        } else if (col.equals("2")) {
            nBookClient.color = "white";
        } else if (col.equals("3")) {
            nBookClient.color = "black";
        }
        return nBookClient;

    }
    
    static Set<Note> selectByName(Set<Note> nBooks, Note nBookClient) {
        Set<Note> res = new HashSet<>();
        for (Note nBook : nBooks) {
            if (nBook.name.equals(nBookClient.name)) {
                res.add(nBook);
            }
        }
        return res;
    }

    static Set<Note> selectByRam(Set<Note> nBooks, Note nBookClient) {
        Set<Note> res = new HashSet<>();
        for (Note nBook : nBooks) {
            if (nBook.ram >= nBookClient.ram) {
                res.add(nBook);
            }
        }
        return res;
    }

    static Set<Note> selectByColor(Set<Note> nBooks, Note nBookClient) {
        Set<Note> res = new HashSet<>();
        for (Note nBook : nBooks) {
            if (nBook.color.equals(nBookClient.color)) {
                res.add(nBook);
            }
        }
        return res;
    }

}
