package Lesson2;

/**
 *
 * @author Mikhail Latypov
 *
 * 1) Дана строка sql-запроса "select * from students where ".
 * Сформируйте часть WHERE этого запроса, используя StringBuilder.
 * Данные для фильтрации приведены ниже в виде json-строки.
 * Если значение null, то параметр не должен попадать в запрос.
 * Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 * Пример вывода: "select * from students WHERE name = Ivanov AND country = Russia.....".
 */

public class Task1 {
    public static void main(String[] args) {
        String query = "select * from students WHERE ";
        StringBuilder whereBuilder = new StringBuilder(query);

        JSONObject filters = new JSONObject("{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}");

        Iterator<String> keys = filters.keys();

        while (keys.hasNext()) {
            String key = keys.next();
            Object value = filters.get(key);

            if (value == null || value.equals("null")) {
                continue;
            }

            whereBuilder.append(key).append(" = ");

            if (value instanceof String) {
                whereBuilder.append("'").append(value.toString()).append("'");
            } else {
                whereBuilder.append(value.toString());
            }

            whereBuilder.append(" AND ");
        }

        whereBuilder.delete(whereBuilder.length() - 5, whereBuilder.length());

        String whereClause = whereBuilder.toString();

        System.out.println(whereClause);
    }
}
