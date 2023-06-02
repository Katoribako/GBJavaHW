package homework2;
import java.util.HashMap;
import java.util.Map;

public class MapTask1 {
    public static void main(String[] args) throws Exception {
        String  list = MapFileRead.ReadLineFromFile("studentList.json");
        Map<String, String> hashMap
                = new HashMap<String, String>();
        String result = nullFilter(hashMap);

        String parts[] = list.split(",");

        for (String part : parts) {

            String stuData[] = part.split(":");

            String studentKey = stuData[0].trim();
            String studentValue = stuData[1].trim();

            hashMap.put(studentKey, studentValue);
        }
        System.out.println(nullFilter(hashMap));
    }
    public static String nullFilter(Map<String, String> params) {
        StringBuilder s = new StringBuilder();
        for (Map.Entry<String, String> keyVal : params.entrySet()) {
            if (!keyVal.getValue().equals("null")) {
                s.append(keyVal.getKey()).append(" = '").append(keyVal.getValue()).append("' | ");
            }
        }
        return s.toString();

    }
}
