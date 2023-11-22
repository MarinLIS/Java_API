package HomeTasks.Lesson_6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
public class Main_2 {
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

        Note resultBook = clientAnswer();
        System.out.println(
                "Выполнить строгую фильтрацию, учитывая введенным параметрам (1)"
                +"\nили предложить все варианты по каждому параметру отдельно (2)");
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        if (n.equals("1")) {
            print(selectByStrict(nBooks, resultBook));
        } else if (n.equals("2")) {
            print(selectByPar(nBooks, resultBook));
        }
    }
    
    static void print(Set<Note> nBooks) {
        for (Note nBook : nBooks) {
            System.out.println(nBook);
        }
    }

    static Note clientAnswer() {
        Note nBookClient = new Note();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Осуществить поиск по: ");
        
        while (true) {

            System.out.println("\n0 - Завершить ввод параметров"
                    + "\n1 - Производителю "
                    + "\n2 - Минимальному объему оперативной памяти"
                    + "\n3 - Минимальному объему памяти ЖД"
                    + "\n4 - Операционной системе"
                    + "\n5 - Цвету");

            String n = scanner.nextLine();
            if (n.equals("0")) {
                break;
            }
            if (n.equals("1")) {
                System.out.println("Введите название производителя: ");
                nBookClient.name = clientInput();
            } else if (n.equals("2")) {
                System.out.println("Введите минимальный объем ОП: ");
                nBookClient.ram = Integer.parseInt(clientInput());
            } else if (n.equals("3")) {
                System.out.println("Введите минимальный объем памяти ЖД ");
                nBookClient.hdMemory = Integer.parseInt(clientInput());
            } else if (n.equals("4")) {
                System.out.println("Введите предустановленную ОП: ");
                nBookClient.operatSys = clientInput();
            } else if (n.equals("5")) {
                System.out.println("Введите желаемый цвет: ");
                nBookClient.color = clientInput();
            } else {
                System.out.println("Вы ввели неверный параметр!");
            }

        }
        return nBookClient;

    }
    
    static Set<Note> selectByPar(Set<Note> nBooks, Note nBookClient) {
        Set<Note> res = new HashSet<>();

        for (Note nBook : nBooks) {
            if (nBookClient.name != null && !nBookClient.name.isEmpty()) {
                if (nBook.name.equalsIgnoreCase(nBookClient.name)) {
                    res.add(nBook);
                }
            }
            if (nBookClient.ram != 0) {
                if (nBook.ram >= nBookClient.ram) {
                    res.add(nBook);
                }
            }
            if (nBookClient.hdMemory != 0) {
                if (nBook.hdMemory >= nBookClient.hdMemory) {
                    res.add(nBook);
                }
            }
            if (nBookClient.operatSys != null && !nBookClient.operatSys.isEmpty()) {
                if (nBook.operatSys.equalsIgnoreCase(nBookClient.operatSys)) {
                    res.add(nBook);
                }
            }
            if (nBookClient.color != null && !nBookClient.color.isEmpty()) {
                if (nBook.color.equalsIgnoreCase(nBookClient.color)) {
                    res.add(nBook);
                }
            }
        }
        return res;
    }

    static Set<Note> selectByStrict(Set<Note> nBooks, Note nBookClient) {
        Set<Note> res = new HashSet<>();
    
        for (Note nBook : nBooks) {
            boolean matchesAll = true;
    
            if (nBookClient.name != null && !nBookClient.name.isEmpty()) {
                if (!nBook.name.equalsIgnoreCase(nBookClient.name)) {
                    matchesAll = false;
                }
            }
            if (nBookClient.ram != 0) {
                if (!(nBook.ram >= nBookClient.ram)) {
                    matchesAll = false;
                }
            }
            if (nBookClient.hdMemory != 0) {
                if (!(nBook.hdMemory >= nBookClient.hdMemory)) {
                    matchesAll = false;
                }
            }
            if (nBookClient.operatSys != null && !nBookClient.operatSys.isEmpty()) {
                if (!nBook.operatSys.equalsIgnoreCase(nBookClient.operatSys)) {
                    matchesAll = false;
                }
            }
            if (nBookClient.color != null && !nBookClient.color.isEmpty()) {
                if (!nBook.color.equalsIgnoreCase(nBookClient.color)) {
                    matchesAll = false;
                }
            }
    
            if (matchesAll) {
                res.add(nBook);
            }
        }
        return res;
    }

    static String clientInput() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        return line;

    }

}
