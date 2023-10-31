// package HomeTasks.Lesson_4;

// import java.util.LinkedList;

// /*
//  * Реализация очереди
// В классе MyQueue реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди
// dequeue() - возвращает первый элемент из очереди и удаляет его
// first() - возвращает первый элемент из очереди, не удаляя
// getElements() - возвращает все элементы в очереди
// Пример

// queue.enqueue(1);
// queue.enqueue(10);
// queue.enqueue(15);
// queue.enqueue(5);
// System.out.println(queue.getElements()); 
// // [1, 10, 15, 5]

// queue.dequeue();
// queue.dequeue();
// System.out.println(queue.getElements());
// // [15, 5]

// System.out.println(queue.first());
// // 15
//  */

// public class MyQueue<T> {

//         // Напишите свое решение ниже
//         private LinkedList<T> queue = new LinkedList<>();

//         public void enqueue(T element) {
//             // Напишите свое решение ниже /помещает элемент в конец очереди
//             queue.addLast(element);
//         }

//         public T dequeue() {
//             // Напишите свое решение ниже /возвращает первый элемент из очереди и удаляет его
//             return queue.pollFirst();
//         }

//         public T first() {
//             // Напишите свое решение ниже /возвращает первый элемент из очереди, не удаляя
//             return queue.peekFirst();
//         }

//         public LinkedList<T> getElements() { //возвращает все элементы в очереди
//             // Напишите свое решение ниже
//             return new LinkedList<>(queue);
//         }
// }


