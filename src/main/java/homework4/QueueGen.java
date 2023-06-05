package homework4;
//Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;

public class QueueGen {
    LinkedList<Integer> newList = new LinkedList<>();
   public void enqueue(){
       newList.add(randomNum());
   }
    public int dequeue() {
        if (!newList.isEmpty()) {
            return newList.pollFirst();
        } else {
            throw new RuntimeException("Queue is empty.");
        }
    }
    public int first() {
        if (!newList.isEmpty()) {
            return newList.peekFirst();
        } else {
            throw new RuntimeException("Queue is empty");
        }
    }
    public void show(){
        System.out.println(newList);
    }


    public static int randomNum() {
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }


}
