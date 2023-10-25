package Lections;

// Task_0
// public class Lection_2 {

//     public static void main(String[] args) {
//         Object o = 1;
//         GetType(o); // Integer
//         o = 1.2;
//         GetType(o);// Integer
//     }
//     static void GetType(Object obj){
//         System.out.println(obj.getClass().getName());
//     }
// }

// public class Lection_2 {
//     public static void main(String[] args) {
//         System.out.println(Sum(1, 2));
//         System.out.println(Sum(1.0, 2));
//         System.out.println(Sum(1, 2.0));
//         System.out.println(Sum(1.2, 2.1));
//     }

//  static int Sum(int a, int b) { ...
//  }

//  static double Sum(double a, double b) { ...
//  }

//  static String Sum(String a, String b) { ...
//  }
// }
// public class Lection_2 {
//  public static void main(String[] args) {
//  System.out.println(Sum(1, 2));
//  System.out.println(Sum(1.0, 2));
//  System.out.println(Sum(1, 2.0));
//  System.out.println(Sum(1.2, 2.1));
//  }
//  static Object Sum(Object a, Object b) {
//  if (a instanceof Double && b instanceof Double) {  // instanceof - является, принадлежит
//  return (Object)((Double) a + (Double) b);
//  } else if(a instanceof Integer && b instanceof Integer) {
//  return (Object)((Integer) a + (Integer) b);
//  } else return 0;
//  }
// }

// Task_1
// public class Lection_2 {
//     static int[] AddItemInArray(int[] array, int item) {
//         int length = array.length;

//         int[] temp = new int[length + 1];
//         System.arraycopy(array, 0, temp, 0, length);
//         temp[length] = item;
//         return temp;
//     }

//     public static void main(String[] args) {
//         int[] a = new int[] { 0, 9 };
//         for (int i : a) { System.out.printf("%d ", i); }
//         a = AddItemInArray(a, 11);
//         a = AddItemInArray(a, 111);
//         a = AddItemInArray(a, 1111);
//         System.out.println();
//         for (int j : a) { System.out.printf("%d ", j); }
//         System.out.println();
//     }
// }
// Task_2
// public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        //ArrayList list = new ArrayList();
//        list.add(2809);

//        for (Object o : list) {
//            System.out.println(o);
//        }
//    }
// }

// Task_3
// import java.util.ArrayList;

// public class Lection_2 {
//     public static void main(String[] args) {
//         ArrayList<Integer> list1 = new ArrayList<Integer>();
//         ArrayList<Integer> list2 = new ArrayList<>();
//         ArrayList<Integer> list3 = new ArrayList<>(10);
//         ArrayList<Integer> list4 = new ArrayList<>(list3);
//         System.out.println(list3);
//         list3.add(123);
//         System.out.println(list4);

//     }
// }

// Task_4
// import java.util.Arrays;
// import java.util.List;

// public class Lection_2 {
//     public static void main(String[] args) {
//         int day = 29;
//         int month = 9;
//         int year = 1990;
//         Integer[] date = { day, month, year };
//         List<Integer> d = Arrays.asList(date);
//         System.out.println(d); // [29, 9, 1990]
//     }
// }

// Task_5
// import java.util.Arrays;
// import java.util.List;

// public class Lection_2 {
//     public static void main(String[] args) {
//         StringBuilder day = new StringBuilder("28");
//         StringBuilder month = new StringBuilder("9");
//         StringBuilder year = new StringBuilder("1990");
//         List<StringBuilder> d = Arrays.asList(day, month, year);
//         System.out.println(d); // [29, 9, 1990]
//         day = new StringBuilder("09");
//         System.out.println(d); // [29, 09, 1990]
//     }
// }
// import java.util.List;

// public class Lection_2 {
//     public static void main(String[] args) {
//         Character value = null;
//         List<Character> list1 = List.of('S', 'e', 'r', 'g', 'e', 'y'); // формировании через list.of, 
//                                          мы не сможем удалить элемент с индексом
//         System.out.println(list1);
//         list1.remove(1); // java.lang.UnsupportedOperationException
//         List<Character> list2 = List.copyOf(list1);

//     }
// }

// import java.util.*;

// public class Lection_2 {
//     public static void main(String[] args) {
//         List<Integer> list = List.of(1, 12, 123, 1234, 12345);

//         for (int item : list) {
//             System.out.println(item);
//         }

//         Iterator<Integer> col = list.iterator();
//         System.out.println();

//         while (col.hasNext()) {
//             col.remove();
//             System.out.println(col.next());
//             //col.next();
//         }

//     }
// }

