/*Задание №0
� Дана последовательность чисел. Необходимо вернуть сумму
уникальных чисел
� Пример: [1, 2, 2, 3]
� Результат: 4 

import java.util.Arrays;
import java.util.HashMap;


public class Seminar_5 {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 2, 3 };
        System.out.println(Arrays.toString(arr));
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);

        }
        System.out.println(map);
        
        int sum = 0;
        for (int i : arr) {
            if (map.get(i) == 1) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

*/
/*Задание №1
� Вам дан массив путей, где пути[i] = [”Город А”, “Город Б”] означают, что
существует прямой путь, идущий от ”Город А” до“Город Б”. Верните
город назначения, то есть город без какого-либо пути, ведущего в
другой город.
� Пример: [["Москва","Самара"],["Курск","Пенза"],["Самара","Курск"]]
� Результат: Пенза */


/*Задание №1
� Дана строка. Необходимо написать метод, который отсортирует слова в
строке по длине с помощью TreeMap. Строки с одинаковой длиной не
должны “потеряться”.
� Пример строки: Я помню чудное мгновенье Передо мной явилась ты Как
мимолетное виденье Как гений чистой красоты */

/*. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.
3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества. */

/*
 1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24. 
2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите 
процент уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
Для вычисления процента используйте формулу:
процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
 

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Seminar_5 {
    public static void main(String[] args) {
        Integer[] array = new Integer[1000]; 
        fillArray(array);
        System.out.println("Array");
        System.out.println(Arrays.toString(array));
        System.out.println("Result");
        System.out.println(unic(array));
    }
    
    public static void fillArray(Integer[] args) {
        for (int i = 0; i < args.length; i++) {
            Random random = new Random();
            args[i] = random.nextInt(0, 25);
        }
    }
    public static double unic(Integer[] args){
        Set<Integer> unic = new HashSet<>(Arrays.asList(args));
        System.out.println("Set");
        System.out.println(unic);
        double result = unic.size() * 100.0 / args.length; 
        return result;
    }
}
*/
