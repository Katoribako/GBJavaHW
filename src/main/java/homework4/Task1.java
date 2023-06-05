package homework4;
//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
import homework3.ArrGenerator;

import java.util.ArrayList;
import java.util.Collections;
public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array = ArrGenerator.CreateRandomArray(10);
        ArrGenerator.PrintArray(array);
        Collections.reverse(array);
        ArrGenerator.PrintArray(array);

    }
}
