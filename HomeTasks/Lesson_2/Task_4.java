/*Возьмите код от калькулятора с прошлого урока.
К этому калькулятору нужно добавить логирование.
Логи запишите в файл log.txtв формате:
"гггг-мм-дд чч:мм User entered the first operand = {первое число}"
"гггг-мм-дд чч:мм User entered the operation = {оператор}"
"гггг-мм-дд чч:мм User entered the second operand = {второе число}"
"гггг-мм-дд чч:мм Result is {результат}" */

// import java.io.File;
// import java.io.FileWriter;
// import java.io.FileReader;
// import java.io.IOException;
// import java.sql.Timestamp;
// import java.io.BufferedReader;
// import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;

// public class Task_4 {
//     class Calculator {
//         public int calculate(char op, int a, int b) {
//             int res = 0;
//             if (op == '+') {
//                 res = a + b;
//             } else if (op == '-') {
//                 res = (a - b);
//             } else if (op == '*') {
//                 res = (a * b);
//             } else if (op == '/') {
//                 if (a != 0) {
//                     res = (a / b);
//                 } else {
//                     System.out.println("Деление на ноль невозможно!");
//                 }
//             } else {
//                 System.out.println("Некорректный оператор: '" + op + "'");
//             }
//             return res;
//         }
//     } 
// }
