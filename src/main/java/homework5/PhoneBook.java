package homework5;

import java.util.*;

public class PhoneBook {
    Map<String, ArrayList<String>> phonebook = new HashMap<>();

    public void phoneNameAdd(String name) {
        phonebook.put(name, new ArrayList<>());
    }

    public void showPhoneBook() {
        System.out.println(phonebook);
    }

    public void generateNumbers() {
        Set<String> allKeys = phonebook.keySet();
        List<String> keyList = new ArrayList<>(allKeys);
        for (String s : keyList) {
            ArrayList<String> getArray = phonebook.get(s);
            for (int j = 0; j < counter() + 1; j++) {
                getArray.add(String.valueOf(generateRandomPhone()));
            }
        }
    }

    public void sortedPhoneBook() {
        Comparator<Map.Entry<String, ArrayList<String>>> valueComparator = ((o1, o2) ->
                Integer.compare(o2.getValue().size(), o1.getValue().size()));
        List<Map.Entry<String, ArrayList<String>>> sortedList = new ArrayList<>(phonebook.entrySet());
        sortedList.sort(valueComparator);
        sortedList.forEach(System.out::println);
    }

    private int counter() {
        Random random = new Random();
        return random.nextInt(6);
    }

    private int generateRandomPhone() {
        Random random = new Random();
        int min = 1000000;
        int max = 9999999;
        int diff = max - min;
        int i = random.nextInt(diff + 1);
        return i;
    }
}