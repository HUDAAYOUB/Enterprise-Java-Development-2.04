package lab51.task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<personList> listName = new ArrayList<>();
        personList Person1 = new personList("111", "Elian", "White");
        personList Person2 = new personList("222", "Arwa", "Trad");
        personList Person3 = new personList("333", "Huda", "Ayoub");

        personList clonedPerson1 = Person1.clone();
        System.out.println("Original Person: " + Person1);
        System.out.println("Cloned Person: " + clonedPerson1);


        personList clonedPerson2 = Person2.clone();
        System.out.println("Original Person: " + Person2);
        System.out.println("Cloned Person: " + clonedPerson2);


        personList clonedPerson3 = Person3.clone();
        System.out.println("Original Person: " + Person3);
        System.out.println("Cloned Person: " + clonedPerson3);
    }
}
