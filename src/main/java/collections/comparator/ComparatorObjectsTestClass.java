package collections.comparator;

import java.util.*;

public class ComparatorObjectsTestClass {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>(Arrays.asList(
                new Person(1, "Bod"),
                new Person(3, "Dan"),
                new Person(2, "Viki")));

        System.out.println(people);//[Person{id=1, name='Bod'}, Person{id=3, name='Dan'}, Person{id=2, name='Viki'}]

        //Collections.sort(people);//we cannot sort in a such way, we must use comparable in order to solve this
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getId() > o2.getId()) return 1;
                else if (o1.getId() < o2.getId()) return -1;
                else return 0;
            }
        });

        System.out.println(people);//[Person{id=1, name='Bod'}, Person{id=2, name='Viki'}, Person{id=3, name='Dan'}]
    }
}

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}