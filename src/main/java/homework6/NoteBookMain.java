package homework6;

//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков (Set).
// Написать метод, который будет запрашивать у пользователя критерий (или критерии)
// фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в
// Map или в Сет. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - цвет
// 2 - бренд

import java.util.*;

public class NoteBookMain {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook("7b86", 1, "Xiaomi");
        notebook1.setColor("black");
        notebook1.setHDD(250);
        notebook1.setOS("Windows");
        notebook1.setRAM(8);

        Notebook notebook2 = new Notebook("111", 2, "Acer");
        notebook2.setColor("white");
        notebook2.setHDD(1000);
        notebook2.setOS("Windows");
        notebook2.setRAM(4);

        Notebook notebook3 = new Notebook("235cc", 3, "Honor");
        notebook3.setColor("black");
        notebook3.setHDD(2000);
        notebook3.setOS("Aurora");
        notebook3.setRAM(16);

        Notebook notebook4 = new Notebook("123", 4, "MSI");
        notebook4.setColor("black");
        notebook4.setHDD(750);
        notebook4.setOS("Linux");
        notebook4.setRAM(8);

        HashSet<Notebook> notebooks = new HashSet<>(Arrays.asList(notebook1, notebook2, notebook3, notebook4));
        HashSet<Notebook> res = new HashSet<>();

        System.out.print("Please choose what kind of filter do you need:" +
                "\n 1 - RAM \n 2 - HDD \n 3 - OS \n 4 - Color \n or 5 to start sorting\n");
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        sc.nextLine();
        HashMap<String, Object> filters = new HashMap<>();
        while (n!= 5){
            if (n == 1) {
                System.out.println("Please input a value of minimal RAM do you need");
                Integer temp = sc.nextInt();
                sc.nextLine();
                filters.put("RAM", temp);
            }
            if (n == 2) {
                System.out.println("Please input a value of minimal size of HDD");
                Integer temp = sc.nextInt();
                sc.nextLine();
                filters.put("HDD", temp);
            }
            if (n == 3) {
                System.out.println("Please input a name of OS whats you need");
                String temp = sc.nextLine();
                filters.put("OS", temp);
            }
            if (n == 4) {
                System.out.println("Please input a color");
                String temp = sc.nextLine();
                filters.put("color", temp);
            }
            if (n > 5 || n <= 0) {
                System.out.println("Please input a correct number! ");
                break;
            }


        System.out.printf("Please choose what kind of filter do you need:\n 1 - RAM \n 2 - HDD \n 3 -OS \n 4 - Color" +
                " \n and 5 to start sorting\n");
        n = sc.nextInt();
        sc.nextLine();
    }
        for (Map.Entry<String, Object> entry : filters.entrySet()) {
            if (entry.getKey().equals("RAM")) {
                Iterator<Notebook> it = notebooks.iterator();
                while (it.hasNext()) {
                    Notebook lap = (Notebook) it.next();
                    if (lap.getRAM() >= (Integer) entry.getValue()) {
                        res.add(lap);
                    }
                }
            }
            if (entry.getKey().equals("HDD")) {
                Iterator<Notebook> it = notebooks.iterator();
                while (it.hasNext()) {
                    Notebook lap = (Notebook) it.next();
                    if (lap.getHDD() >= (Integer) entry.getValue()) {
                        res.add(lap);
                    }
                }
            }
            if (entry.getKey().equals("OS")) {
                Iterator<Notebook> it = notebooks.iterator();
                while (it.hasNext()) {
                    Notebook lap = (Notebook) it.next();
                    if (lap.getOS().equals(entry.getValue())) {
                        res.add(lap);
                    }
                }
            }
            if (entry.getKey().equals("color")) {
                Iterator<Notebook> it = notebooks.iterator();
                while (it.hasNext()) {
                    Notebook lap = (Notebook) it.next();
                    if (lap.getColor().equals(entry.getValue())) {
                        res.add(lap);
                    }
                }
            }
        }

        Iterator<Notebook> it = res.iterator();
        while (it.hasNext()) {
            Notebook lap = (Notebook) it.next();
            System.out.println(lap.toString());
            System.out.println();
        }

    }}
