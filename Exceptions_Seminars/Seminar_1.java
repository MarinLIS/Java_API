package Exceptions_Seminars;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Scanner;

/* Задача 1
Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое
значение. Метод ищет в массиве заданное значение и возвращает его индекс. При этом,
например:
1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в
качестве кода ошибки.
2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
3. если вместо массива пришел null, метод вернет -3
4. придумайте свои варианты исключительных ситуаций и верните соответствующие
коды ошибок.
Напишите метод, в котором реализуйте взаимодействие с пользователем. То есть, этот
метод запросит искомое число у пользователя, вызовет первый, обработает возвращенное
значение и покажет читаемый результат пользователю. Например, если вернулся -2,
пользователю выведется сообщение: “Искомый элемент не найден”.
public class Seminar_1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6546, 45, 34};

        getText(getNumber(arr, 3, 6546));

    }

    public static int getNumber(int[] arr, int min, int num) {

        if (arr == null) {
            return -3;
        }
        if (arr.length < min) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -2;
    }

    public static void getText(int code) {
        switch (code) {
            case -3:
                System.out.println("Массив пустой");
                break;
            case -1:
                System.out.println("Длина меньше минимума");
                break;
            case -2:
                System.out.println("Элемент не найден");
                break;
            default:
                System.out.println("Искомый элемент находится на индексе " + code);
                break;
        }
    }
}
*/
/*Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
Необходимо посчитать и вернуть сумму элементов этого массива.
При этом накладываем на метод 2 ограничения: метод может работать только с
квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать
только значение 0 или 1.
Если нарушается одно из условий, метод должен вернуть код ошибки.
Программа должна корректно обработать код ошибки и вывести соответствующее
сообщение пользователю.
Сравнить такой вариант обработки исключений с предыдущим.
 
public class Seminar_1 {
    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 0}, {1, 0, 0}, {0, 0, 1}, {1, 1, 1}};
        getText(sumElements(matrix));
    }

    public static void getText(int code) {
        switch (code) {
            case -3:
                System.out.println("Элементны отличные от 0 и 1");
                break;
            case -1:
                System.out.println("Массив пустой");
                break;
            case -2:
                System.out.println("Массив не квадратный");
                break;
            default:
                System.out.println("Сумма элементов массива равна " + code);
                break;
        }
    }

    public static int sumElements(int[][] matrix){
        if (matrix == null)
            return -1;
        if (matrix.length != matrix[0].length)
            return -2;
        int resultSum = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] != 0 && matrix[i][j] != 1)
                    return -3;
                resultSum += matrix[i][j];
            }
        }
        return resultSum;
    }
}
*/
/* Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента
целочисленный одномерный массив.
Метод должен пройтись по каждому элементу и проверить что он не равен null.
А теперь реализуйте следующую логику:
1. Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом
пользователя
2. Если null’ы встретились в нескольких ячейках, то идеально было бы все их
“подсветить” 

public class Seminar_1 {
    public static void main(String[] args) {
        Integer[] arr = { 12, -23, 56, 2, null, 0, null, -1 };
        checkArray(arr);
    }

    public static void checkArray(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null)
                System.out.println("Найден элемент null на индексе " + i);
        }
    }
}*/

/* 
public class Seminar_1 {
     public static void main(String[] args) throws IOException {
            callMethod6("");
            ArrayList<String> stringArraysList = (ArrayList<String>) callMethod1();
            int a = 10, b = 1;
            callMethod6("");
            int div = callMethod2(a, b);
            System.out.println(div);
            callMethod6("");
            callMethod3(stringArraysList);
        }

        private static void callMethod6(String s) {
            System.out.println("Hello World, it's me!");
        }

        private static void callMethod3(ArrayList<String> stringArraysList) {
            callMethod6("");
            // callMethod3(stringArraysList);
        }

        private static Collection<String> callMethod1() throws IOException {
            callMethod2(100000000, 10 - 9);
            ArrayList<String> ls = new ArrayList<>();
            ls.add("cat");
            return ls;
        }

        public static int callMethod2(int a, int b) throws IOException {
            callMethod6("");
            FileInputStream fis = new FileInputStream("1.txt");
            fis.read();

            if (fis.available() > 0)
                throw new RuntimeException();
            int num = callMethod4("1240"); // O 0
            return a / b;
        }

        private static int callMethod4(String s) {
            callMethod5(s);
            return Integer.parseInt(s);
        }

        private static void callMethod5(String s) {
            callMethod6("");
            String[] strings = new String[5];
            for (int i = 1; i < strings.length; i++) {
                strings[i] = s;
            }
        }
    }
*/