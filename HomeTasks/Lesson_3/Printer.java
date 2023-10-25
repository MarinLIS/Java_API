package HomeTasks.Lesson_3;

import java.util.Arrays;

// public class Printer {
//     public static void main(String[] args) {
//         int[] a;

//         if (args.length == 0) {
//             // При отправке кода на Выполнение, вы можете варьировать эти параметры
//             a = new int[] { 5, 1, 6, 2, 3, 4 };
//         } else {
//             a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
//         }

//         MergeSort answer = new MergeSort();
//         String itresume_res = Arrays.toString(answer.mergeSort(a));
//         System.out.println(itresume_res);
//     }
// }

// public class Printer{ 
//     public static void main(String[] args) { 
//       Integer[] arr = {};
      
//       if (args.length == 0) {
//         // При отправке кода на Выполнение, вы можете варьировать эти параметры
//         arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
//       }
//       else{
//         arr = Arrays.stream(args[0].split(", "))
//                         .map(Integer::parseInt)
//                         .toArray(Integer[]::new);
//       }     
      
//       Task_2 ans = new Task_2();      
//       ans.removeEvenNumbers(arr);
//     }
// }

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{ 
    public static void main(String[] args) { 
        int[] a;

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{5, 7, 9, 15, 1, 6, 2, 3, 4};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        Task_1 ans = new Task_1();
        String itresume_res = Arrays.toString(ans.mergeSort(a));
        System.out.println(itresume_res);
    }
}