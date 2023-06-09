package homework5;

public class MainTask {

    public static void main(String[] args) {
        PhoneBook phones = new PhoneBook();
        phones.phoneNameAdd("Lee");
        phones.phoneNameAdd("Derek");
        phones.phoneNameAdd("Ann");
        phones.generateNumbers();
        System.out.println("\nPhonebook:");
        phones.showPhoneBook();
        System.out.println("\nSorted phonebook:");
        phones.sortedPhoneBook();
    }

}
