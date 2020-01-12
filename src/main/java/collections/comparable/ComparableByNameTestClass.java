package collections.comparable;

import java.util.*;

public class ComparableByNameTestClass {
    public static void main(String[] args) {
        List<PersonName> peopleListName = new ArrayList<>();
        Set<PersonName> peopleSetName = new TreeSet<>();

        addElements(peopleListName);
        addElements(peopleSetName);

        System.out.println(peopleListName);
        //[Person{id=4, name='George'}, Person{id=2, name='To'}, Person{id=3, name='Igor'}, Person{id=1, name='Ivana'}]
        System.out.println(peopleSetName);
        //[Person{id=2, name='To'}, Person{id=3, name='Igor'}, Person{id=1, name='Ivana'}, Person{id=4, name='George'}]

    }

    public static void addElements(Collection collection) {
        collection.add(new PersonName(4, "George"));
        collection.add(new PersonName(2, "To"));
        collection.add(new PersonName(3, "Igor"));
        collection.add(new PersonName(1, "Ivana"));

    }
}

class PersonName implements Comparable<PersonName> {
    private int id;
    private String name;

    public PersonName(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonName person = (PersonName) o;
        return id == person.id &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(PersonName o) {
        if (this.name.length() > o.getName().length()) return 1;
        else if (this.name.length() < o.getName().length()) return -1;
        else return 0;
    }
}

