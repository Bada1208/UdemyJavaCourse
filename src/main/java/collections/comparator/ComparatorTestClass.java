package collections.comparator;

import java.util.*;

public class ComparatorTestClass {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("frog");
        animals.add("fox");
        animals.add("lion");
        animals.add("ox");
        animals.add("dog");
        animals.add("dolphin");

        Collections.sort(animals);
        System.out.println(animals);//[dog, dolphin, fox, frog, lion, ox]
//sorting with the comparator
        Collections.sort(animals, new StringLengthComparator());
        System.out.println(animals);//[ox, dog, fox, frog, lion, dolphin]

        List<Integer> numbers = new ArrayList<>(Arrays.asList(0, 322, 454, 2, 6));
        numbers.stream().sorted().forEach(System.out::println);// 0 2 6 322 454
        //backward int sort
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) return -1;
                else if (o1 < o2) return 1;
                else return 0;
            }
        });
        System.out.println(numbers);//[454, 322, 6, 2, 0]
    }
}

class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        int result;
        if (s1.length() > s2.length()) result = 1;
        else if (s1.length() < s2.length()) result = -1;
        else result = 0;
        return result;
    }
}
