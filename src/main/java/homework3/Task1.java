package homework3;

//Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array = ArrGenerator.CreateRandomArray(10);
        ArrGenerator.PrintArray(array);
        NotEvenNumberSelector(array);
        ArrGenerator.PrintArray(array);
        int minValue = MinValue(array);
        int maxValue = MaxValue(array);
        Double avg = Avg(array);
        System.out.printf("Min vlaue is : %d \n", minValue);
        System.out.printf("Max value is : %d \n", maxValue);
        System.out.printf("AVG is: %.1f \n", avg);

    }
    public static void NotEvenNumberSelector(ArrayList<Integer> list){
        int i = 0;
        while (i < list.size()){
            if(list.get(i) % 2 == 0) list.remove(i);
            else i++;
        }
    }
    public static int MinValue(ArrayList<Integer> array){
        int minimum = array.get(0);
        for (int element : array){
            if(element < minimum) minimum = element;
        }
        return minimum;
    }
    public static int MaxValue(ArrayList<Integer> array){
        int maximum = array.get(0);
        for (int element : array){
            if (element > maximum) maximum = element;
        }
        return maximum;
    }
    public static Double Avg(ArrayList<Integer> array){
        int sum = 0;
        for(int element : array){
            sum += element;
        }
        double v = (double) sum / (double) array.size();
        return v;
    }

}
