package collections.comparable;

import java.util.*;

public class ComparableByIdTestClass {
    public static void main(String[] args) {
        List<Person> peopleList = new ArrayList<>();
        Set<Person> peopleSet = new TreeSet<>();

        addElements(peopleList);
        addElements(peopleSet);

        System.out.println(peopleList);
        //[Person{id=2, name='Tom'}, Person{id=3, name='Igor'}, Person{id=1, name='Ivan'}, Person{id=4, name='George'}]
        //System.out.println(peopleSet);//collections.comparable.Person cannot be cast to java.lang.Comparable

        System.out.println(peopleSet);
        //[Person{id=1, name='Ivan'}, Person{id=2, name='Tom'}, Person{id=3, name='Igor'}, Person{id=4, name='George'}]
        Collections.sort(peopleList);
        System.out.println(peopleList);
        //[Person{id=1, name='Ivan'}, Person{id=2, name='Tom'}, Person{id=3, name='Igor'}, Person{id=4, name='George'}]
    }

    public static void addElements(Collection collection) {
        collection.add(new Person(2, "Tom"));
        collection.add(new Person(3, "Igor"));
        collection.add(new Person(1, "Ivan"));
        collection.add(new Person(4, "George"));
    }
}

class Person implements Comparable<Person> {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
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
    public int compareTo(Person o) {
        if (this.id > o.getId()) return 1;
        else if (this.id < o.getId()) return -1;
        else return 0;
    }
}
