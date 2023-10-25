// package HomeTasks.Lesson_2;
/*Дана строка sql-запроса:

select * from students where "
Сформируйте часть WHERE этого запроса, используя StringBuilder. Пример данных для фильтрации приведены ниже в виде json-строки. Если значение null, то параметр не должен попадать в запрос.

Пример:

{"name": "Ivanov", "country": "Russia", "city": "Moscow", "age": "null"}
Напишите свой код в методе answer класса Answer. Метод answer принимает на вход два параметра:

String QUERY - начало SQL-запроса
String PARAMS - JSON с параметрами */
/*
class Task_1 {
    public static void main(String[] args) {
        String paramsNew = PARAMS.replace('{', ' ').replace('}', ' ');
        String[] params = paramsNew.split(",");
        StringBuilder stringBuilder = new StringBuilder(QUERY);

        for (int i = 0; i < params.length; i++) {
            String[] elements = params[i].replace('"', ' ').split(":");
            if (!"null".equals(elements[1].trim())) {
                stringBuilder.append(elements[0].trim()).append("=").append("'").append(elements[1].trim()).append("'");
                if (i < params.length - 2)
                    stringBuilder.append(" and ");
            }
        }
        return stringBuilder;
    }
}
*/
// 'select * from students where '
// '{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}'
// name='Ivanov' and country='Russia' and city='Moscow'
// '{"name":"Andron", "country":"Russia", "city":"Moscow", "age":"null"}'
// from students1111 where name='Andron' and country='Russia' and city='Moscow'
