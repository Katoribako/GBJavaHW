package homework2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class MapFileRead {
    public static String  ReadLineFromFile(String pathway) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(pathway));
        String str;
        int size = 0;
        while ((str = br.readLine()) != null) {
            size +=1;
        }
        br.close();
        String [] listData = new String [size];

        int i = 0;
        BufferedReader br1 = new BufferedReader(new FileReader(pathway));
        while ((str = br1.readLine()) != null) {
            listData[i] = str;
            i += 1;
        }
        br1.close();
        return Arrays.toString(listData);
    }
}
