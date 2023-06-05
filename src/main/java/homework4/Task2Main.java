package homework4;



public class Task2Main {
    public static void main(String[] args) {
        QueueGen newQ = new QueueGen();
        for (int i = 0; i < 4; i++){
            newQ.enqueue();
        }
        newQ.show();
        newQ.dequeue();
        newQ.show();
        int firstNum = newQ.first();
        System.out.println(firstNum);


    }
}
