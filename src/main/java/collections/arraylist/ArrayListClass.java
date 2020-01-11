package collections.arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListClass {
    public static void main(String[] args) {
        //we must always write List in order to change our realization of List

        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList);

        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(9));

        System.out.println(arrayList.size());

        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.println(arrayList.get(i));
        }
        arrayList.remove(5);

        for (Integer integer : arrayList) {
            System.out.println(integer);
        }
        //arrayList=new LinkedList<>();//our object arrayList is a LinkedList
    }
}
