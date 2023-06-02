package homework2;
import java.util .*;

public class StrToHashMap {



    public static void main(String[] args) throws Exception {

        String myList = MapFileRead.ReadLineFromFile("studentList.json");


        Map<String, String> hashMap
                = new HashMap<String, String>();

        String parts[] = myList.split(",");

        for (String part : parts) {

            String stuData[] = part.split(":");

            String studentKey = stuData[0].trim();
            String studentValue = stuData[1].trim();

            hashMap.put(studentKey, studentValue);
        }

        System.out.println("String to HashMap: " + hashMap);
    }
}

