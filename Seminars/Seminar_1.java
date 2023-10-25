// package Seminars;

// import java.util.Arrays;

// // Задание №1
// // � Написать программу, которая запросит пользователя ввести
// // <Имя> в консоли.
// // � Получит введенную строку и выведет в консоль сообщение
// // “Привет,<Имя>!”

// import java.util.Scanner;
// import java.time.LocalTime;

// public class Seminar_1 {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//                 System.out.printf("name: ");
//         String name = iScanner.nextLine();
//         System.out.printf("Привет, %s!", name);
//         iScanner.close();
//     }
// }

// /*� В консоли запросить имя пользователя. В зависимости от
// текущего времени, вывести приветствие вида
// � "Доброе утро, <Имя>!", если время от 05:00 до 11:59
// � "Добрый день, <Имя>!", если время от 12:00 до 17:59;
// � "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
// � "Доброй ночи, <Имя>!", если время от 23:00 до 4:59


// public class Seminar_1 {
//     public static void main(String[] args) {
//         Scanner iScan = new Scanner(System.in);
//         System.out.println("Укажите ваше имя: ");
//         String name = iScan.nextLine();
//         LocalTime time = LocalTime.now();
//         int hour = time.getHour();
//         if (hour >= 5 && hour < 12) {
//             System.out.println("Доброе утро, " + name + "!");
//         } else if (hour >= 12 && hour < 18) {
//             System.out.println("Добрый день, " + name + "!");
//         } else if (hour >= 18 && hour < 23) {
//             System.out.println("Добрый вечер, " + name + "!");
//         } else {
//             System.out.println("Доброй ночи, " + name + "!");
//         }
//     }
// }
// */

// /*Дан массив двоичных чисел, например [1,1,0,1,1,1], 
// вывести максимальное количество подряд идущих 1.

// public class Seminar_1 {

//     public static void main(String[] args) {
//         int[] arr = new int[] { 1, 1, 0, 0, 0, 1 };
//         int count = 0, maxcount = 0;
//         for (int i : arr) {
//             if (i == 1) {
//                 count++;
//             } else {
//                 if (count > maxcount) {
//                     maxcount = count;
//                 }
//                 count = 0;
//             }
//         }
//         if (count > maxcount) {
//             maxcount = count;
//         }
//         System.out.println(maxcount);
//     }
// */

// /* Дан массив nums = [3,2,5,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива должны быть 
// отличны от заданного, а остальные - равны ему. 


// public class Seminar_1 {

//     public static void main(String[] args) {
//         int[] arr = new int[] { 3, 2, 5, 3 };
//         int val = 3;
//         int[] res = sort(arr, val);
//         System.out.println(Arrays.toString(res));
//     }
    
//     static int[] sort(int[] arr, int val) {
//         int[] res = new int[arr.length];
//         Arrays.fill(res, val);
//         int dest = 0;
//         for (int i : arr) {
//             if (i != val) {
//                 res[dest] = i;
//                 dest++;
//             }
//         }
//         return res;
//     }
// }
// */

// /*Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке. 

// public class Seminar_1 {

//     public static void main(String[] args) {
//         String s = "Добро пожаловать на курс по Java";
//         String[] words = s.split(" ");
//         String res = "";
//         for (int i = words.length - 1; i >= 0; i--) {
//             res += words[i];
//             res += " ";
//         }
//         System.out.println(res.trim()); // trim удаляет лишний пробел вначале и вконце
//     }
// }
// */

// /* Реализовать функцию возведения числа а в степень b. a, b из Z. Сводя количество 
// выполняемых действий к минимуму.
// Пример 1: а = 3, b = 2, ответ: 9
// Пример 2: а = 2, b = -2, ответ: 0.25
// Пример 3: а = 3, b = 0, ответ: 1
 
// public class Seminar_1 {

//     public static void main(String[] args) {
//         int a = 2;
//         int b = 0;
//         System.out.println(pow(a, b));
//     }

//     static double pow(double a, int b) {
//         if (b==0 || a == 1){
//             return 1;
//         }
//         double res = 1;
//         if (b < 0) {
//             b = -b;
//             a = 1 / a;
//         }
//         for (int i = 0; i < b; i++) {
//             res *= a;
//         }
//             return res;
//     } 
// }
// */

