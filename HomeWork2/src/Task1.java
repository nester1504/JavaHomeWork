import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task1 {

    public static void sQLQueryBuilder() {
        String filterParams = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        StringBuilder whereClause = new StringBuilder();

        // Удаляем возможные пробелы в строке параметров

        filterParams = filterParams.replaceAll("\\s+", "");

        // Удаляем первую и последнюю фигурные скобки из строки параметров
        filterParams = filterParams.substring(1, filterParams.length() - 1);

        String[] params = filterParams.split(",");

        for (String param : params) {
            String[] keyValue = param.split(":");
            String key = keyValue[0].replaceAll("\"", "");
            String value = keyValue[1].replaceAll("\"", "");

            if (!value.equals("null")) {
                if (whereClause.length() > 0) {
                    whereClause.append(" AND ");
                }
                whereClause.append(key).append(" = '").append(value).append("'");
            }
        }

        String sqlQuery = "SELECT * FROM students WHERE " + whereClause.toString();
        System.out.println(sqlQuery);

    }
}
