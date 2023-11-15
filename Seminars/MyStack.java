// package Seminars;
// /*релизовать стек с помощью массива (мы создадим свой класс)
//  * size
//  * empty
//  * push
//  * peek
//  * pop
// */
// /**
//  * Seminar_4
// //  */

// public class MyStack {
//     private String[] arr = new String[10];
//     private int size = 0;

//     public int size() { // должен позволить увидеть сколько элементов
//         return size;
//     }

//     public boolean empty() {// должен позволить увидеть пустая или не пустая коллекция
//         return size == 0;
//     }

//     public void push(String item){ // должен позволить добавить элемент в коллекцию
//         arr[size++] = item; // присваиваем значение и увеличиваем 
//     }

//     public String peek(){ // позволит посмотреть последний эелемнт коллекции
//         return arr[size - 1];
//     }

//     public String pop() { // должен посмотреть последний элемент и удалить его
//         return arr[--size];
//     }

//     @Override
//     public String toString() { // должен позволить вывести коллекцию
//         StringBuilder stringBuilder = new StringBuilder();
//         stringBuilder.append("[");
//         if (!empty()) {
//             stringBuilder.append(arr[0]);
//             for (int i = 1; i < size; i++) {
//                 stringBuilder.append(", ");
//                 stringBuilder.append(arr[i]);
//             }
//         }
//         stringBuilder.append("]");
//         return stringBuilder.toString();
//     }
    
//     public String toReverseString() { // должен позволить вывести коллекцию реверсивно
//         StringBuilder stringBuilder = new StringBuilder();
//         stringBuilder.append("[");
//         if (!empty()){
//             stringBuilder.append(arr[size - 1]);
//             for (int i = size - 2; i >= 0; i--) {
//                 stringBuilder.append(", ");
//                 stringBuilder.append(arr[i]);
//             }
//         }
//         stringBuilder.append("]");
//         return stringBuilder.toString();
//     }
// }

