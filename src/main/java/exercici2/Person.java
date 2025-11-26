package exercici2;

import java.util.Objects;

public class Person {
    private final String name;
    private final String surname;
    private final int age;

    public Person(String name, String surname, int age) {
        this.name = Objects.requireNonNull(name);
        this.surname = Objects.requireNonNull(surname);
        if (age < 0) throw new IllegalArgumentException("Age cannot be negative");
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
