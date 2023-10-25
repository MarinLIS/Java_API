// package Seminars;
// /*Задание №0
// � Даны следующие строки, cравнить их с помощью == и метода
// equals() класса Object
// � String s1 = "hello";
// � String s2 = "hello";
// � String s3 = s1;
// � String s4 = "h" + "e" + "l" + "l" + "o";
// � String s5 = new String("hello");
// � String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'}); */

// import java.util.List;

// public class Seminar_3 {
//     public static void main(String[] args) {
//     }
// }

// import java.util.ArrayList;

// import javax.swing.text.html.HTMLDocument.Iterator;

// import java.util.ArrayList;
// import java.util.Random;

/*Задание №1
Заполнить список десятью случайными числами.
Отсортировать список методом sort() и вывести его на экран. 
public class Seminar_3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int n = 10;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(rnd.nextInt(20) + 1);
            list.sort(null);
        }
        System.out.println(list);
    }
}
public class ListColl {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        fillList(list, 10, 0, 10);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        ArrayList<Integer> list1 = new ArrayList<>()  ;
        fillList(list1, 10, 0, 10);
        list1.sort(Comparator.reverseOrder());
        System.out.println(list1);
    }
    public static void fillList(ArrayList<Integer> list, int n, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(min, max + 1));
        }
    }
}
*/

/*Задание №2
� Создать список типа ArrayList<String>.
� Поместить в него как строки, так и целые числа.
� Пройти по списку, найти и удалить целые числа. */
// public class Seminar_3 {

//     public static void main(String[] args) {
//         ArrayList<String> list = new ArrayList<>();
//         list.add("apple");
//         list.add("5");
//         list.add("orange");
//         list.add("cucumber");
//         list.add("6");
//         list.add("100");
//         list.add("raisins");
//         list.add("meat");
//         list.add ("12.3")
//         System.out.println(list);

//         for (int i = 0; i < list.size(); i++) {
//             String element = list.get(i);
//             try {
//                 Integer.parseInt(element);
//                 list.remove(i);
//                 i--;
//             } catch (NumberFormatException ignored) {

//             }
//         }
//         System.out.println("List with deleted Integers:" + list);
//     }
// }
// public class ListColl2 {
//    public static void main(String[] args) {
//     ArrayList list = new ArrayList<>();
//     fillList(list);
//     System.out.println(list);
//     for (int i = list.size()-1; i >= 0; i--) {
//         if (list.get(i) instanceof Number){
//             list.remove(i);
//         }       
//     }
//     System.out.println(list);
//    }
//    public static void fillList(ArrayList list) {
//         list.add("apple");
//         list.add(5);
//         list.add("orange");
//         list.add("cucumber");
//         list.add(6);
//         list.add(100);
//         list.add(12.3);
//         list.add("raisins");
//         list.add("meat");
//    } 
// }
/* Задание №3.1 Заполнить список названиями планет Солнечной системы в
произвольном порядке с повторениями.
� Вывести название каждой планеты и количество его
повторений в списке.*/
// import java.util.*;

// public class Seminar_3 {

//     public static void main(String[] args) {
//         String str = "Saturn, Earth, Niptun, Mars, Venus, Jupiter, Saturn, Earth, Niptun, Mercury, Saturn, Earth, Niptun";
//         List<String> planetList = new ArrayList<>();
//         for (String s : str.split(", ")) {
//             planetList.add(s);
//         }
//         System.out.println(planetList);
//         Map<String, Integer> tempList = new HashMap<String, Integer>();
//         for (int i = 0; i < planetList.size(); i++) {
//             String tempString = planetList.get(i);
//             if (!tempList.containsKey(tempString)) {
//                 tempList.put(tempString, 1);
//             } else {
//                 tempList.put(tempString, tempList.get(tempString) + 1);
//             }
//         }
//         for (Map.Entry<String, Integer> entry : tempList.entrySet()) {
//             System.out.println("Планета " + entry.getKey() + " встречается " + entry.getValue() + " раз(а");
//         }
//     }
// }

/*Задание №3.2 Пройти по списку из предыдущего задания и удалить
повторяющиеся элементы.*/

/*
 /*
    Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
    что на 0й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг.
    Напишите метод для заполнения данной структуры.
    [
        ["Роман", "Мастер и Маргарита", "Война и мир"],
        ["Сказка", "Золотой ключик", "Репка"],
        ["Фентези", "Гарри Поттер"]
    ]
    
    public static void main(String[] args) {
        List<List<String>> shopBook = new ArrayList<>();
        addBook(shopBook, "Роман", "Мастер и Маргарита");
        addBook(shopBook, "Сказка", "Золотой ключик");
        addBook(shopBook, "Роман", "Война и мир");
        addBook(shopBook, "Фентези", "Гарри Поттер");
        addBook(shopBook, "Сказка", "Репка");
        addBook(shopBook, "Сказка", "Сказка о царе Салтане");
        addBook(shopBook, "Сказка", "Сказка");

        System.out.println(shopBook);
    }

    static void addBook(List<List<String>> shopBook, String genre, String nameBook){
        for (int i = 0; i < shopBook.size(); i++) {
            List<String> curList = shopBook.get(i);
            if (curList.get(0).equalsIgnoreCase(genre)){
                if (!curList.contains(nameBook)){
                    curList.add(nameBook);
                }
                return;
            }
        }
        List<String> list = new ArrayList<>();
        list.add(genre);
        list.add(nameBook);
        shopBook.add(list);
    }
}
*/
/*
    Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
    Вывести название каждой планеты и количество его повторений в списке.
     
    public static void main(String[] args) {
        List<String> unicPlanets = new ArrayList<>();
        unicPlanets.add("Марс");
        unicPlanets.add("Венера");
        unicPlanets.add("Земля");
        unicPlanets.add("Юпитер");
        unicPlanets.add("Сатурн");
        unicPlanets.add("Уран");
        unicPlanets.add("Нептун");
        unicPlanets.add("Меркурий");

        List<String> rndListPlanets = generateList(unicPlanets, 10);
        System.out.println(rndListPlanets);
        for (String planet: unicPlanets){
            int count = Collections.frequency(rndListPlanets, planet);
            System.out.println(planet + " встречается " + count + " раз");
        }
    }

    static List<String> generateList(List<String> origin, int count){
        Random random = new Random();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(origin.get(random.nextInt(origin.size())));
        }
        return list;
    }
}
*/