package collections.list.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListClass {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();
        measureTimeAdding(arrayList);//162 add method
        measureTimeAdding(linkedList);//2772 add method

        measureTimeGetting(arrayList);//5 get method
        measureTimeGetting(linkedList);//308 get method

        measureTimeAddingToTheFirstIndex(arrayList);//3351 add to the 0 index
        measureTimeAddingToTheFirstIndex(linkedList);//4 add to the 0 index
    }

    private static void measureTimeAdding(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        long result = end - start;
        System.out.println(result);
    }

    private static void measureTimeAddingToTheFirstIndex(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000; i++) {
            list.add(0, i);
        }
        long end = System.currentTimeMillis();
        long result = end - start;
        System.out.println(result);
    }

    private static void measureTimeGetting(List<Integer> list) {
        for (int i = 0; i < 1_0_000; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_0_000; i++) {
            list.get(i);
        }
        long end = System.currentTimeMillis();
        long result = end - start;
        System.out.println(result);
    }
}
