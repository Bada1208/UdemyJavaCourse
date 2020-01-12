package collections.queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.stream.Stream;

public class QueueClass {
    public static void main(String[] args) {
        Person person3 = new Person(3);
        Person person2 = new Person(2);
        Person person0 = new Person(0);
        Person person1 = new Person(1);
        Person person4 = new Person(4);

        Queue<Person> personQueue = new LinkedList<>();
        personQueue.add(person3);
        personQueue.add(person2);
        personQueue.add(person0);
        personQueue.add(person1);
        personQueue.add(person4);

        Stream.of(personQueue).forEach(s->System.out.println(s));//[Person{id=3}, Person{id=2}, Person{id=0}, Person{id=1}, Person{id=4}]

        Queue<Person> personQueueArray = new ArrayBlockingQueue<Person>(5);//max elements 5
        personQueueArray.add(person3);
        personQueueArray.add(person2);
        personQueueArray.add(person0);
        personQueueArray.add(person1);
        personQueueArray.add(person4);
        System.out.println(personQueueArray.offer(person0));//false max capacity is 5
        //remove() - deletes first element and return it
        System.out.println(personQueueArray.remove());//Person{id=3}
        //peek() - returns first element
        System.out.println(personQueueArray.peek());//Person{id=2}

    }
}

class Person {
    private int id;

    public Person(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }
}