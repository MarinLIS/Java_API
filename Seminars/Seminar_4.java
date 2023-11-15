// package Seminars;

// import HomeTasks.Lesson_4.MyQueue.MyQueue;

// public class Seminar_4 {
//     public static void main(String[] args) {
//         List<Integer> list1 = new ArrayList<>();
//         List<Integer> list2 = new LinkedList<>();
//         System.out.println(work(list1));
//         System.out.println(work(list2));
//     }

//     private static long work(List<Integer> list) {
//         long timeStart = System.currentTimeMillis();
//         for (int i = 0; i < 100000; i++) {
//             list.add(0, i);
//         }
//         long timeFinish = System.currentTimeMillis();
//         return timeFinish - timeStart;
//     }
// }

/*
 Реализовать консольное приложение, которое:
Принимает от пользователя строку вида text~num
Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
Если введено print~num, выводит строку из позиции num в связном списке и 
удаляет её из списка.
 */

// public class Seminar_4 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         List<String> list1 = new LinkedList<>();
//         while (true) {
//             String s = scanner.nextLine();
//             String[] arrTemp = s.split("~");
//             String text = arrTemp[0];
//             int num = Integer.parseInt(arrTemp[1]);
//             if (text.equals("print")) {
//                 System.out.println(list1.get(num));
//                 list1.remove(num);
//                 break;
//             } else {
//                 list1.add(num, text);
//                 System.out.println(list1);
//             }
//         }
//         System.out.println(list1);
//     }

// }
/*Реализовать консольное приложение, которое:
Принимает от пользователя и “запоминает” строки.
Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, 
а первая - последней.
Если введено revert, удаляет предыдущую введенную строку из памяти. */

/**
 * Seminar_4
 */
// public class Seminar_4 {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         List<String> list1 = new LinkedList<>();
//         boolean flag = true;
//         while (flag) {
//             String s = scanner.nextLine();
//             switch (s) {
//                 case "print":
//                     // for (int index = list1.size() - 1; index >= 0; index--) {
//                     //     System.out.print(list1.get(index) + " ");
//                     // }
//                     ListIterator<String> iterator = list1.listIterator(list1.size());
//                     while (iterator.hasPrevious()) {
//                         System.out.print(iterator.previous() + ",");
//                     }
//                     System.out.println();
//                     break;
//                 case "revert":
//                     if (list1.isEmpty()) {
//                         System.out.println("list is empty, fill it");
//                     } else {
//                         list1.remove(list1.size() - 1);
//                     }
//                     break;
//                 case "q":
//                     flag = false;
//                     break;
//                 default:
//                     list1.add(s);

//             }

//         }
//     }
// }

/**
 * Seminar_4
 */
// public class Seminar_4 {

//     public static void main(String[] args) {
//         String[] arr = { "1", "2", "3", "4" };
//         printStack(arr);
//         System.out.println(Arrays.asList(arr));
//     }

//     static void printStack(String[] arr) {
//         Stack<String> stack = new Stack<>();
//         stack.addAll(Arrays.asList(arr));
//         // System.out.println(stack);
//         // for (String s : stack) {
//         //     System.out.print(s + " ");
//         // }
//         while (!stack.empty()) {
//             System.out.print(stack.pop() + " ");
//         }

//     }

//     static void printQueue(String[] arr) {
//         Queue<String> queue = new LinkedList<>();
//         queue.addAll(Arrays.asList(arr));
//         while (!queue.isEmpty()) {
//             System.out.println(queue.poll());
//         }
//     }
// }
/*релизовать стек с помощью массива (мы создадим свой класс)
 * size
 * empty
 * push
 * peek
 * pop
*/
/**
 * Seminar_4
//  */

// public class Seminar_4 {
//     public static void main(String[] args) {
//         MyStack stack = new MyStack();
//         stack.push("1");
//         stack.push("2");
//         stack.push("3");
//         stack.push("4");
//         System.out.println(stack.toString());
        
//         stack.pop();
//         System.out.println(stack.toReverseString());
//     }
// }

// public class Seminar_4 {
//     public static void main(String[] args) {
//         HomeTasks.Lesson_4.MyQueue<Integer> queue = new HomeTasks.Lesson_4.MyQueue<>();
//         if (args.length == 0) {
//             // При отправке кода на Выполнение, вы можете варьировать эти параметры
//             queue.enqueue(1);
//             queue.enqueue(10);
//             queue.enqueue(15);
//             queue.enqueue(5);
//         } else {
//             queue.enqueue(Integer.parseInt(args[0]));
//             queue.enqueue(Integer.parseInt(args[1]));
//             queue.enqueue(Integer.parseInt(args[2]));
//             queue.enqueue(Integer.parseInt(args[3]));
//         }
        
//         System.out.println(queue.getElements());

//         queue.dequeue();
//         queue.dequeue();
        
//         System.out.println(queue.getElements());

//         System.out.println(queue.first());
//     }
// }
