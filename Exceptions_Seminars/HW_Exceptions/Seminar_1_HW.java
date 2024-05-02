// package Exceptions_Seminars.HW_Exceptions;

// class Answer {
    /*Задача 2 */
    /*public static void arrayOutOfBoundsException() {
        int[] array = new int[5];
        // Попытка получить элемент за пределами массива
        try {
            array[5] = 0; // Это вызовет IndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e; // Перебрасываем исключение, чтобы его можно было перехватить в main
        }
    }
    
    public static void divisionByZero() {
        int a = 10;
        // Попытка разделить на ноль
        try {
            a /= 0; // Это вызовет ArithmeticException
        } catch (ArithmeticException e) {
            throw e; // Перебрасываем исключение, чтобы его можно было перехватить в main
        }
    }
    
    public static void numberFormatException() {
        // Попытка преобразовать строку, которая не является числом, в число
        try {
            int result = Integer.parseInt("hello");
        } catch (NumberFormatException e) {
            throw e; // Перебрасываем исключение, чтобы его можно было перехватить в main
        }
    }*/
    /* Задача 2 
    Реализуйте метод subArrays, принимающий в качестве аргументов два 
    целочисленных массива a и b, и возвращающий новый массив c, каждый 
    элемент которого равен разности элементов двух входящих массивов в 
    той же ячейке.    Если длины массивов не равны - верните нулевой массив длины 1.
    Напишите свой код в методе subArrays класса Answer. 
    Метод subArrays принимает на вход два параметра:
    int[] a - первый массив
    int[] b - второй массив
    */
    
        /*public int[] subArrays(int[] a, int[] b) {
        // Проверяем, что длины массивов равны
        if (a.length != b.length) {
            return new int[1]; // Возвращаем нулевой массив длины 1
        }
        
        // Создаем новый массив для хранения разностей
        int[] c = new int[a.length];
        
        // Вычисляем разности элементов и заполняем массив c
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] - b[i];
        }
        
        return c;
        }*/
    
        /* Задача 3 
         * Реализуйте метод divArrays, принимающий в качестве аргументов два целочисленных массива a и b, и возвращающий новый массив с, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
        
        Если длины массивов не равны - верните нулевой массив длины 1.
        
        Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
        
        Напишите свой код в методе divArrays класса Answer. Метод divArrays принимает на вход два параметра:
        
        int[] a - первый массив
        int[] b - второй массив
        Пример
        
        
        a = new int[]{12, 8, 16};
        b = new int[]{4, 2, 4};
        
        Вывод: [3, 4, 4]
        
        a = new int[]{12, 8, 16, 25};
        b = new int[]{4, 2, 4};
        
        Вывод: [0]
        */
/*
    public int[] divArrays(int[] a, int[] b) {  
        // Проверяем, что длины массивов равны
        if (a.length != b.length) {
            // Возвращаем нулевой массив длины 1, если длины массивов не равны
            return new int[1];
        }

        // Создаем новый массив для хранения частных
        int[] c = new int[a.length];

        // Вычисляем частные и заполняем массив c
        for (int i = 0; i < a.length; i++) {
            try {
                c[i] = a[i] / b[i];
            } catch (ArithmeticException e) {
                // Если при делении возникает исключение (деление на ноль),
                // возвращаем нулевой массив длины 1
                return new int[1];
            }
        }

        return c;
    }
}
*/

