// package HomeTasks.Lesson_1;

/*Напишите функцию printPrimeNums, которая выведет на экран все простые 
числа в промежутке от 1 до 1000, каждое на новой строке. 
class Answer_1 {
    public void printPrimeNums() {
        boolean check;
        for (int i = 2; i <= 1000; i++) {
            check = true;
            for (int j = 2; j < i; j++) {
                if ((i % j) == 0) { // берется i (напр 6) и j пробегается по внутреннему циклу 
                    //начиная с 2 до 5 (5<6). Если 6 разделится хотя бы на что-то, то будет 
                    //break и переход i на 7 итд
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(i);
            }
        }
    }
}
*/
