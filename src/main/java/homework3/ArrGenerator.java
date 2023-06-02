package homework3;

import java.util.ArrayList;

public class ArrGenerator {

    public static ArrayList<Integer> CreateRandomArray(int num){
        ArrayList <Integer> list = new ArrayList<>();
        for(int i = 0; i < num; i++){
            list.add((int)(Math.random()*100));
        }
        return list;
    }
    public static void PrintArray(ArrayList<Integer> arr){
        for(int element: arr) {
            System.out.printf("%d, ", element);
        }
        System.out.println();
    }
}
