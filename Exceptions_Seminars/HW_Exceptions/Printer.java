package Exceptions_Seminars.HW_Exceptions;
/*
public class Printer {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}*/

// import java.util.Arrays;

// import java.util.Arrays;
/*
public class Printer{ 
    public static void main(String[] args) { 
      int[] a = {};
      int[] b = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        a = new int[]{4, 5, 6};
        b = new int[]{1, 2, 3};
      }
      else{
        a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
      }     
      
      Answer ans = new Answer(); 
      String itresume_res = Arrays.toString(ans.subArrays(a, b));     
      System.out.println(itresume_res);
    }
}
*/


// public class Printer{ 
//     public static void main(String[] args) { 
//       int[] a = {};
//       int[] b = {};
      
//       if (args.length == 0) {
//         // При отправке кода на Выполнение, вы можете варьировать эти параметры
//         a = new int[]{12, 8, 16};
//         b = new int[]{4, 2, 4};
//       }
//       else{
//         a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
//         b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
//       }     
      
//       Answer ans = new Answer(); 
//       String itresume_res = Arrays.toString(ans.divArrays(a, b));     
//       System.out.println(itresume_res);
//     }
// }

// public class Printer {
//     public static void main(String[] args) {
//         int[] intArray;
//         int d;

//         if (args.length == 0) {
//             intArray = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90};
//             d = 2; // По умолчанию используем 0, если аргумент не передан
//         } else {
//             intArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
//             d = Integer.parseInt(args[1]); // Можно использовать значение по умолчанию или передать его как аргумент.
//         }

//         double result = Expr.expr(intArray, d);
//         System.out.println(result);
//     }
// }

public class Printer {
    public static void main(String[] args) {
        int a;
        int b;

        if (args.length == 0) {
            a = 7;
            b = 0; // Default values if no arguments are provided
        } else {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
        } 

        double result = Expr.expr(a, b);
        System.out.println(result);
    }
}