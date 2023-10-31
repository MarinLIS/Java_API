package HomeTasks.Lesson_4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Calculator {
    private Deque<Integer> history = new ArrayDeque<>();

    public int add(int a, int b) {
        int result = a + b;
        history.push(result);
        return result;
    }

    public int subtract(int a, int b) {
        int result = a - b;
        history.push(result);
        return result;
    }

    public int multiply(int a, int b) {
        int result = a * b;
        history.push(result);
        return result;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divider can't be zero");
        }
        int result = a / b;
        history.push(result);
        return result;
    }

    public Deque<Integer> getHistory() {
        return history;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите два числа:");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            System.out.println("Выберите операцию (+, -, *, /):");
            String operation = scanner.next();

            switch (operation) {
                case "+":
                    System.out.println("Результат: " + calculator.add(num1, num2));
                    break;
                case "-":
                    System.out.println("Результат: " + calculator.subtract(num1, num2));
                    break;
                case "*":
                    System.out.println("Результат: " + calculator.multiply(num1, num2));
                    break;
                case "/":
                    System.out.println("Результат: " + calculator.divide(num1, num2));
                    break;
                default:
                    System.out.println("Неверная операция!");
            }

            System.out.println("История результатов: " + calculator.getHistory());
        }
    }
}

