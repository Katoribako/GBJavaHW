package homework2;
import java.io.File;
import java.io.PrintWriter;

//Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса,
// используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
//Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

public class Task1 {
    public static void main(String[] args) {
        try {
            File file = new File("studentList.json");
            if(!file.exists()) {
                boolean nFile = file.createNewFile();
            }
            PrintWriter pw = new PrintWriter(file);
            pw.println( "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\" }");
            pw.close();
            String [] list = FileRead.ReadingFromFile("studentList.json");
            System.out.println(list[0]);
            StringBuilder resultSelect = LineInList(list[0]);
            System.out.println(resultSelect);
        }
        catch (Exception e) {
            System.out.print("Error" + e);


        }
    }
    public static StringBuilder LineInList(String line) {
        String line1 = line.replace("{", "");
        String line2 = line1.replace("}", "");
        String line3 = line2.replaceAll("\"", "");
        System.out.println(line3);
        StringBuilder result = new StringBuilder("select * from students where ");

        String [] arrayData = line3.split(", ");
        for (int i =0; i < arrayData.length-1; i++) {
            String[] arrData = arrayData[i].split(":");
            if(!arrData[1].equals("null")) if (i != 0) {
                result.append(", ");
                result.append(arrData[0]);
                result.append(" = ");
                result.append(arrData[1]);
            } else {
                result.append(arrData[0]);
                result.append(" = ");
                result.append(arrData[1]);
            }

        }
        return result;
    }




}
