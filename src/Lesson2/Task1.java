package Lesson2;

/**
 * <p>
 * 1) Дана строка sql-запроса "select * from students where ".
 * Сформируйте часть WHERE этого запроса, используя StringBuilder.
 * Данные для фильтрации приведены ниже в виде json-строки.
 * Если значение null, то параметр не должен попадать в запрос.
 * Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 * Пример вывода: "select * from students WHERE name = Ivanov AND country = Russia.....".
 */
// Импортируем класс JSONObject из библиотеки org.json

import org.json.JSONObject;

public class Task1 {
    public static void main(String[] args) {
        // Создаем экземпляр класса StringBuilder и добавляем начальную строку запроса SELECT
        StringBuilder whereClause = new StringBuilder("select * from students where ");

        // Создаем экземпляр класса JSONObject, который содержит фильтры для запроса
        JSONObject filters = new JSONObject("{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}");

        // Проходим циклом по всем ключам фильтров и добавляем соответствующие условия в whereClause
        for (String key : filters.keySet()) {
            // Получаем значение для текущего ключа
            Object value = filters.get(key);
            // Проверяем, что значение не null и не строка "null"
            if (value != null && !value.toString().equals("null")) {
                // Добавляем условие в whereClause
                whereClause.append(key).append(" = ").append(value).append(" AND ");
            }
        }
        // Удаляем последние 5 символов из whereClause, чтобы убрать последний AND
        whereClause.delete(whereClause.length() - 5, whereClause.length());
        // Выводим результат запроса в консоль
        System.out.println(whereClause);
    }
}
