package lab51.task1;

import lab51.task1.Person;

public class Main {


    public static void main(String[] args) {
        Person per1 = new Person(1, "Huda Ayoub", 25, "Software Engineer");
        Person per2 = new Person(2, "Rawan Ayoub", 30, "Desginer");

        try {
            per1.setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception thrown: " + e.getMessage());
        }
        Person[] people = { per1, per2 };
        Person foundPerson = Person.findByName("Huda Ayoub", people);
        if (foundPerson != null) {
            System.out.println("Found person: " + foundPerson.getName());
        } else {
            System.out.println("Person not found.");
        }
    }
}