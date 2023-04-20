package Homework2;

// Task1 Дана строка sql-запроса "select * from students where ".
// Сформируйте часть WHERE этого запроса, используя StringBuilder.
// Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
//
// Пример 1:
// Параметры для фильтрации: {"name:Ivanov", "country:Russia", "city:Moscow", "age:null"}
// Результат: SELECT * FROM USER WHERE name = 'Ivanov' and country = 'Russia' and city = 'Moscow';
//
// Пример 2:
// Параметры для фильтрации: {"name:null", "country:null", "city:null", "age:null"}
// Результат: SELECT * FROM USER;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        String[] filterJSON = new String[] {"name:Ivanov", "country:Russia", "city:Moscow", "age:null"};
//        String[] filterJSON = new String[] {"name:null", "country:null", "city:null", "age:null"};
        Map<String,String> dict = new LinkedHashMap<String,String>();
        String[] temp;
        for (int i = 0; i < filterJSON.length; i++) {
            temp = filterJSON[i].split(":");
            dict.put(temp[0], temp[1]);
        }

        String[] columnNames = dict.keySet().toArray(new String[0]);
        String[] values = dict.values().toArray(new String[0]);

        StringBuilder request = new StringBuilder();
        request.append("SELECT * FROM USER WHERE");

        for (int i = 0; i < values.length; i++) {
            if (!values[i].equals("null")) {
                request.append(" ");
                request.append(columnNames[i]);
                request.append(" = ");
                request.append("'" + values[i] + "'");
                request.append(" and");
            }
        }
        if (request.substring(request.length() - 3, request.length()).equals("and")) {
            request.delete(request.length() - 4, request.length());
        };

        if (request.toString().equals("SELECT * FROM USER WHERE")) {
            request.delete(request.length() - 6, request.length());
        }
        request.append(";");

        System.out.println(request);
    }
}
