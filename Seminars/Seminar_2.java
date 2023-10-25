// package Seminars;
//у сканера есть usedelimiter (посмотреть)
/*Дано четное число N (>0) и символы c1 и c2.
� Написать метод, который вернет строку длины N, которая
состоит из чередующихся символов c1 и c2, начиная с c1.

public class Seminar_2 {
    public static void main(String[] args) {
        int n = 8;
        char c1 = 'a';
        char c2 = 'b';
        System.out.println(concat(c1, c2, n));
    }

    static String concat(char c1, char c2, int n) {
        StringBuilder stringBuilder = new StringBuilder();// используем не string, так как действие 
        // выполняется в цикле и есть много итераций, 
        // если какждый раз к стринг добавлять что-то и сохранять этот обьект, 
        // в стрингбилдере мы модифицируем обьект и только потом его в тустринг собираем.
        for (int i = 0; i < n / 2; i++) {
            stringBuilder.append(c1);
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }
}
*/


/*Напишите метод, который сжимает строку.
� Пример: вход aaaabbbcdd. Результат: a4b3cd2

public class Seminar_2 {
    public static void main(String[] args) {
        String s = "aaaabbbcdd";
        System.out.println(work(s));
    }

    static String work(String s) {
        int count = 1;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) { // charat -метод передает символ с индексом
                count++;
            } else {
                stringBuilder.append(s.charAt(i - 1));
                if (count > 1) { // если счетчик равен 1, то его по заданию писать не надо
                    stringBuilder.append(count);
                    count = 1;
                }
            }
        }
        stringBuilder.append(s.charAt(s.length() - 1));
        if (count > 1) {
            stringBuilder.append(count);
        }
        return stringBuilder.toString();
    }
}
*/

/*Задание №3
� Напишите метод, который принимает на вход строку (String) и определяет 
является ли строка палиндромом (возвращает boolean значение).
Полиндром - Слово или фраза, которые одинаково читаются слева направо и справа налево.

public class Seminar_2 {
    public static void main(String[] args) {
        String string = "аргентина манит негра";
        System.out.println(polindrom(string));

    }

    static boolean polindrom(String s) {
        s = s.replace(" ", ""); // выбрасываем пробелы из строки
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        return stringBuilder.toString().equalsIgnoreCase(s);// equalsIgnoreCase игнорирует регистр
    }
}
*/

/*Задание №4
� Напишите метод, который составит строку, состоящую из 
100 повторений слова TEST и метод, который запишет эту строку 
в простой текстовый файл, обработайте исключения.

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Seminar_2 {

    static Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) {
        createLogger();
        String temp = "TEST";
        String pathName = "C:\\Users\\user\\Documents\\GeekBrains\\Java\\Seminars\\Seminars\\test.txt";
        int n = 5;
        // System.out.println(repeat(temp, n));
        writeFile(repeat(temp, n), pathName);
        System.out.println(readFile(pathName));
        closeLogger();
    }

    public static String repeat(String args, int n) {
        StringBuilder stringBuilder = new StringBuilder(args);
        for (int i = 1; i < n; i++) {
            stringBuilder.append(" ");
            stringBuilder.append(args);
        }
        return stringBuilder.toString();
    }

    public static void writeFile(String args, String nameFile) {
        try {
            FileWriter writer = new FileWriter(nameFile);
            writer.write(args); // записываем в файл строку
            writer.close(); // закрываем обязательно
            logger.info("file if saved correctrly");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            logger.warning("File was not saved");
            e.printStackTrace();
        }

    }

    public static String readFile(String nameFile) {
        String temp = "";
        try (Scanner scanner = new Scanner(new File(nameFile))) {
            temp = scanner.nextLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return temp;
    }

    public static void createLogger() {
        try {
            FileHandler fileHandler = new FileHandler("log1.txt", true);
            SimpleFormatter simpleFormatter = new SimpleFormatter();
            fileHandler.setFormatter(simpleFormatter);
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void closeLogger() {
        Handler[] temp = logger.getHandlers();
        for (Handler handler : temp) {
            handler.close();
        }
    }
}
*/