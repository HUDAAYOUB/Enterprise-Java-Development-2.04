package lab51.task2;
import java.util.ArrayList;
import java.util.Objects;

public class personList {
        private String id;
        private String firstName;
        private String lastName;

        public personList(String id, String firstName, String lastName) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getId() {
            return id;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public personList clone() {
            return new personList(generateNewId(), this.firstName, this.lastName);
        }

        private String generateNewId() {
            int newId = Integer.parseInt(this.id) + 1;
            return String.valueOf(newId);
        }

        public static personList findByName(String name, ArrayList<personList> people) {
            String[] names = name.split(" ");

            if (names.length != 2) {
                throw new IllegalArgumentException("The name should be in the format 'firstName lastName'.");
            }

            String firstName = names[0];
            String lastName = names[1];

            for (personList person : people) {
                if (person.getFirstName().equals(firstName) && person.getLastName().equals(lastName)) {
                    return person;
                }
            }
            return null;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        personList that = (personList) o;
        return Objects.equals(id, that.id) && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName);
    }

    @Override
    public String toString() {
        return "personList{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
