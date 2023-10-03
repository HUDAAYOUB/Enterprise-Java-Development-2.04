package lab51.task1;
public class Person {
    private int id;
    private String name;
    private int age;
    private String occupation;

    public Person(int id, String name, int age, String occupation) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age invalid");
        }
        this.age = age;
    }

    public boolean equals(Person otherPerson) {
        return this.name.equals(otherPerson.getName())
                && this.age == otherPerson.getAge()
                && this.occupation.equals(otherPerson.getOccupation());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getOccupation() {
        return occupation;
    }

    public static Person findByName(String fullName, Person[] people) {
        for (Person person : people) {
            if (person.getName().equals(fullName)) {
                return person;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}