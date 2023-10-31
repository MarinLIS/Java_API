package HomeTasks.Lesson_4;

// import java.util.LinkedList;

// import HomeTasks.Lesson_4.MyQueue.MyQueue;

// import java.util.ArrayDeque;
// import java.util.Deque;

/*Task1 */
// public class Printer{ 
//     public static void main(String[] args) { 
//         LinkedList<Object> ll = new LinkedList<>();

//         if (args.length == 0 || args.length != 4) {
//         // При отправке кода на Выполнение, вы можете варьировать эти параметры
//             ll.add(1);
//             ll.add("One");
//             ll.add(2);
//             ll.add("Two");
//         } else {
//             ll.add(Integer.parseInt(args[0]));
//             ll.add(args[1]);
//             ll.add(Integer.parseInt(args[2]));
//             ll.add(args[3]);
//         }

//         Task_1 answer = new Task_1();
//         System.out.println(ll);
//         LinkedList<Object> reversedList = answer.revert(ll);
//         System.out.println(reversedList);
//     }
// }
/*Task2 */
// public class Printer {
//     public static void main(String[] args) {
//         HomeTasks.Lesson_4.MyQueue<Integer> queue = new HomeTasks.Lesson_4.MyQueue<>();

//         if (args.length == 0) {
//         // При отправке кода на Выполнение, вы можете варьировать эти параметры
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

/*Task3 */
public class Printer {
    public static void main(String[] args) {
        int a, b, c, d;
        char op, op2, undo;

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '+';
            b = 7;
            c = 10;
            op2 = '-';
            d = 7;
            undo = '<';
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
            c = Integer.parseInt(args[3]);
            op2 = args[4].charAt(0);
            d = Integer.parseInt(args[5]);
            undo = args[6].charAt(0);
        }

        Task_3 calculator = new Task_3();
        int result = calculator.calculate(op, a, b);
        System.out.println(result);
        int result2 = calculator.calculate(op2, c, d);
        System.out.println(result2);
        int prevResult = calculator.calculate(undo, 0, 0);
        System.out.println(prevResult);
    }
}
