package homework2;
import java.util.HashMap;
import java.util.Map;

public class EasyTask1 {
    public static void main(String[] args) {
        Map<String, String> roster = new HashMap<String, String>();

        roster.put("name", "Ivanov");
        roster.put("country", "Russia");
        roster.put("city", "Moscow");
        roster.put("age", null);
        System.out.println(nullFilter(roster));

    }
    public static String nullFilter(Map<String, String> params)
    {
        StringBuilder s = new StringBuilder();
        for (Map.Entry<String,String> keyVal : params.entrySet())
        {
            if (keyVal.getValue() != null)
            {
                s.append(keyVal.getKey() +" = '" + keyVal.getValue()+"' | ");
            }
        }
        return s.toString();
    }
}
