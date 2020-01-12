package collections.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableClass {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();//not List but ArrayList
        list.add(2);
        list.add(222);
        list.add(3);

        //before java 5
        Iterator<Integer> integerIterator = list.iterator();
        while (integerIterator.hasNext()) {
            System.out.print(integerIterator.next() + " ");//2 222 3
        }
        System.out.println("\n");
        //removing element with iterator
        int index = 0;
        Iterator<Integer> integerIterator1 = list.iterator();
        while (integerIterator1.hasNext()) {
            System.out.print(integerIterator1.next() + " ");//2 222 3
            if (index == 1) integerIterator1.remove();
            index++;
        }
        System.out.println(list);//[2, 3]

    }
}
