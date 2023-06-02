package homework2;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.*;
// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой
// итерации запишите в лог-файл.

public class Task2 {
    public static void main(String[] args) throws IOException {

        int[] array = createRandomArr(10, -5, 15);
        System.out.print("Not Sorted: ");
        System.out.println(showArray(array));
        int[] sortArray = sortByBubble(array);
        System.out.print("Sorted: ");
        System.out.println(showArray(sortArray));
    }

    static int[] createRandomArr(int size, int downBound, int upperBond) {
        Random rand = new Random();
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = rand.nextInt(upperBond) + downBound;
        }
        return array;
    }

    static String showArray(int[] array) {
        return Arrays.toString(array);
    }

    static int[] sortByBubble(int[] array) throws IOException {
        Logger log = logResult();
        int[] sortArray = Arrays.copyOf(array, array.length);
        int temp = 0;
        for (int i = 0; i < sortArray.length; i++) {
            for (int j = 0; j < sortArray.length - i - 1; j++) {
                if (sortArray[j] > sortArray[j + 1]) {
                    temp = sortArray[j+1];
                    sortArray[j + 1] = sortArray[j];
                    sortArray[j] = temp;

                    log.log(Level.INFO, showArray(sortArray) + "\n");
                }
            }
        }
        return sortArray;
    }

    static Logger logResult() throws IOException {
        Logger log = Logger.getLogger(Task2.class.getName());
        FileHandler fh = new FileHandler("BubbleLog.txt", true);
        log.addHandler(fh);
        log.setUseParentHandlers(false);

        SimpleFormatter sf = new SimpleFormatter();
        fh.setFormatter(sf);
        return log;
    }
}