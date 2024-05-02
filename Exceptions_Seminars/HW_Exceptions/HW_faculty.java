package Exceptions_Seminars.HW_Exceptions;

// /*Реализуйте метод, принимающий в качестве аргументов двумерный массив.
// Метод должен проверить что длина строк и столбцов с одинаковым индексом одинакова,
// детализировать какие строки со столбцами не требуется.
// Как бы вы реализовали подобный метод? 
// 1. Проверить длина строк и длина столбцов одинакова? если не одинаковая - ошибку
// 2. Проходим по массиву и ищем полностью заполненные строки и столбцы
// 3. Смотрим
// */
// public class HW_faculty {
//     public static void main(String[] args) {
//         // Пример двумерного массива
//         int[][] matrix = {
//             {1, 2, 3},
//             {0, 0, 6},
//             {0, 0, 9}
//         };

//         // Проверяем, заполнены ли строки и столбцы
//         boolean[] columnsFilled = new boolean[matrix[0].length];
//         boolean[] rowsFilled = new boolean[matrix.length];

//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[i].length; j++) {
//                 // Проверяем, заполнен ли столбец
//                 if (matrix[i][j] != 0) {
//                     columnsFilled[j] = true;
//                 }
//                 // Проверяем, заполнена ли строка
//                 if (matrix[i][j] != 0) {
//                     rowsFilled[i] = true;
//                 }
//             }
//         }

//         // Находим полностью заполненные строку и столбец
//         int fullyFilledRow = -1;
//         int fullyFilledColumn = -1;
//         for (int i = 0; i < matrix.length; i++) {
//             if (rowsFilled[i]) {
//                 fullyFilledRow = i;
//                 System.out.println(fullyFilledRow);
//                 break;
//             }
//         }
//         for (int j = 0; j < matrix[0].length; j++) {
//             if (columnsFilled[j]) {
//                 fullyFilledColumn = j;
//                 System.out.println(fullyFilledColumn);
//                 break;
//             }
//         }

//         // Находим элемент на пересечении полностью заполненной строки и столбца
//         int element = matrix[fullyFilledRow][fullyFilledColumn];

//         // Выводим результаты
//         System.out.println("Элемент на пересечении полностью заполненной строки и столбца: " + element);
//     }
// }
/*Семинар 2_домашка
Задача 2 Напишите программу, которая вычисляет значение выражения intArray[8] / d, гдеintArray- массив целых чисел, а d - делитель.
Программа проверяет, имеется ли в массиве intArray элемент с индексом 8, и если нет, выводит сообщение о невозможности выполнения операции.
Также программа проверяет, равен ли делитель d нулю, и если да, выводит соответствующее сообщение.
На входе:
'1 2 3 4 5 6 7 8 9'
'1'
На выходе:
intArray[8] / d = 9 / 1 = 9.0
9.0*/

// class Expr {

//     public static double expr(int[] intArray, int d) {

//         if (intArray.length < 8) {
//             System.out.println(
//                     "It's not possible to evaluate the expression - intArray[8] / d as there is no 8th element in the given array");
//             return Double.NaN;
//         }
//         if (d == 0) {
//             System.out.println("It's not possible to evaluate the expression - intArray[8] / d as d = 0");
//             return Double.NaN;
//         }
//         double result = intArray[8] / d;
//         System.out.printf("intArray[8] / d = %d / %d = %.1f%n", intArray[8], d, result);
//         return result;

//     }
// }


// Напишите программу для выполнения арифметической операции деления двух целых чисел a и b.
// При этом программа должна проверить, что делитель b не равен нулю, и выполнить деление только в этом случае.
// Если b равен нулю, программа должна вернуть результат равный нулю.
// После выполнения операции деления, программа также должна вывести сумму чисел a и b с помощью метода printSum.
// Если аргументы не переданы через командную строку, используйте значения по умолчанию.

// На входе:


// '12'
// '5'
// На выходе:


// 17
// 2.4

class Expr {

    public static double expr(int a, int b) {
        if (b == 0) {
            System.out.println(a + b);
            return 0; // Возвращаем 0.0, если делитель равен нулю
        }
        System.out.println(a + b);
        return (double) a / b; // Приводим a к double и выполняем деление
    }

    public static void printSum(int a, int b) {
        System.out.println(a + b); // Выводим сумму a и b
    }
}
