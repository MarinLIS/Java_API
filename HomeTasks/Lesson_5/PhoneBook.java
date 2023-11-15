﻿// package HomeTasks.Lesson_5;
// /*Телефонная книга

// Напишите программу, представляющую телефонную книгу. 
// Программа должна иметь следующие функции:

// add(String name, Integer phoneNum): Добавляет запись в телефонную книгу.
// Если запись с именем name уже существует, добавляет новый номер телефона 
// в существующую запись.
// Если запись с именем name не существует, создает новую запись с этим именем 
// и номером телефона phoneNum.

// find(String name): Поиск номеров телефона по имени в телефонной книге.
// Если запись с именем name существует, возвращает список номеров телефона 
// для этой записи.
// Если запись с именем name не существует, возвращает пустой список.

// getPhoneBook(): Возвращает всю телефонную книгу в виде HashMap, 
// где ключи - это имена, а значения - списки номеров телефона.

// На входе:


// 'Alice'
// 'Bob'
// '123456'
// '789012' 

// На выходе:

// [123456, 789012]
// {Bob=[789012], Alice=[123456, 789012]}
// []
// */

// import java.util.ArrayList;
// import java.util.HashMap;

// public class PhoneBook {
//     private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

//     public void add(String name, Integer phoneNum) {

//         // Введите свое решение ниже
//         if (phoneBook.containsKey(name)) {
//             phoneBook.get(name).add(phoneNum);
//         } else {
//             ArrayList<Integer> phoneNums = new ArrayList<>();
//             phoneNums.add(phoneNum);
//             phoneBook.put(name, phoneNums);
//         }

//     }

//     public ArrayList<Integer> find(String name) {
//         // Введите свое решение ниже
//         return phoneBook.getOrDefault(name, new ArrayList<>());
//     }

//     public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
// // Введите свое решение ниже
//         return phoneBook;
//     }
// }
// // Не удаляйте этот класс - он нужен для 
