// package HomeTasks.Lesson_3;
/*Анализатор списка

Напишите функцию analyzeNumbers, которая принимает на вход целочисленный список arr и:
Сортирует его по возрастанию и выводит на экран
Находит минимальное значение в списке и выводит на экран - Minimum is {число}
Находит максимальное значение в списке и выводит на экран - Maximum is {число}
Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}
Напишите свой код в методе analyzeNumbers класса Answer. 
Метод analyzeNumbers принимает на вход один параметр:

Integer[] arr - список целых чисел

Пример
arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
analyzeNumbers(arr)

// [1, 2, 3, 4, 5, 6, 7, 8, 9]
// Minimum is 1
// Maximum is 9
// Average is = 5 */


// import java.util.Arrays;

// public class Task_3 {
//     public static void main(String[] args) {
//         Integer[] arr = { 4, 2, 7, 5, 1, 3, 8, 6, 9 };
//         // ArrayList<Integer> arrTemp = new ArrayList<>(arr.length);
//         // Collections.addAll(arrTemp, arr);
//         System.out.println(Arrays.toString(arr));
//         Arrays.sort(arr);
//         System.out.println(Arrays.toString(arr));
//         System.out.println("Minimum is " + findMin(arr));
//         System.out.println("Maximum is " + findMax(arr));
//         System.out.println("Average is = " + findAvr(arr));
//     }

//     static int findMin(Integer[] arr) {
//         int min = arr[0];
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] < min) {
//                 min = arr[i];
//             }
//         }
//         return min;
//     }

//     static int findMax(Integer[] arr) {
//         int max = arr[0];
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }
//         return max;
//     }
//     static int findAvr(Integer[] arr) {
//         int avr = 0;
//         int sum = 0;
//         for (int i = 0; i < arr.length; i++) {
//             sum += arr[i];
//         }
//         avr = sum / arr.length;
//         return avr;
//     }
// }
