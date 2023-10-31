package HomeTasks.Lesson_4;

import java.util.ArrayDeque;
import java.util.Deque;

/*
 * Калькулятор с отменой последней операции

В обычный калькулятор без логирования добавьте возможность отменить последнюю операцию.
Отмена последней операции должна быть реализована следующим образом: 
если передан оператор '<' калькулятор должен вывести результат предпоследней операции.

calculate('+', 3, 7)
calculate('+', 4, 7)
calculate('<', 0, 0)

// 10
// 11
// 10

calculate('*', 3, 2)
calculate('-', 7, 4)
calculate('<', 0, 0)

// 6
// 3
// 6
 */

public class Task_3 {
    Deque<Integer> history = new ArrayDeque<>();
    //     public int calculate(char op, int a, int b) {
    //         // Напишите свое решение ниже
    //         Deque<Integer> history = new ArrayDeque<>();
    //         int currentResult = 0;
    //         // queue.add(5);
    //         // queue.add(3);
    //         // queue.add(21);
    //         // System.out.println(queue)
    //         switch (op) {
    //             case '+':
    //                 currentResult = a + b;
    //                 history.push(currentResult);
    //                 break;
    //             case '-':
    //                 currentResult = a - b;
    //                 history.push(currentResult);
    //                 break;
    //             case '*':
    //                 currentResult = a * b;
    //                 history.push(currentResult);
    //                 break;
    //             case '/':
    //                 if (b != 0) {
    //                     currentResult = a / b;
    //                     history.push(currentResult);
    //                 } else {
    //                     throw new IllegalArgumentException("Cannot divide by zero");
    //                 }
    //                 break;
    //             case '<':
    //                 if (!history.isEmpty()) {
    //                     history.pop();
    //                     if (!history.isEmpty()) {
    //                         currentResult = history.peek();
    //                     }
    //                 }
    //                 break;
    //             default:
    //                 throw new IllegalArgumentException("Invalid operator");
    //         }
    //         return currentResult;
    //     }

    // }

    public int calculate(char op, int a, int b) {
        
        int res = 0;
        if (op == '+') {
            res = a + b;
            history.push(res);
        } else if (op == '-') {
            res = (a - b);
            history.push(res);
        } else if (op == '*') {
            res = (a * b);
            history.push(res);
        } else if (op == '/') {
            if (a != 0) {
                res = (a / b);
                history.push(res);
            } else {
                System.out.println("Деление на ноль невозможно!");
            }
        } else if (op == '<'){
            if (!history.isEmpty()) {
                history.pop();
                if (!history.isEmpty()) {
                    res = history.peek();
                }
            }
        } else {
            System.out.println("Некорректный оператор: '" + op + "'");
        }
        return res;
    }
}
