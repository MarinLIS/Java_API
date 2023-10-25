// package HomeTasks.Lesson_3;

// import java.util.ArrayList;

// /*Удаление четных элементов
// Напишите функцию removeEvenNumbers, которая принимала бы произвольный список целых чисел, 
// удаляла бы из него четные числа и выводила список без четных чисел.
// Напишите свой код в методе removeEvenNumbers класса Answer. Метод removeEvenNumbers 
// принимает на вход один параметр:
// Integer[] arr - список целых чисел
// Пример
// arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
// removeEvenNumbers(arr);

// // [1, 3, 5, 7, 9]

// arr = new Integer[]{2, 4, 6, 8};
// removeEvenNumbers(arr);

// // [] */
// public class Task_2 {
//     public static void removeEvenNumbers(Integer[] arr) {
//         // Введите свое решение ниже
//         ArrayList<Integer> resList = new ArrayList<Integer>(arr.length);
//         for (Integer num: arr) {
//             if (num % 2 != 0) {
//                 resList.add(num);
//             }
//         }
//         System.out.println(resList);
//     }
// }
