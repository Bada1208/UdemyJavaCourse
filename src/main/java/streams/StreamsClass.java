package streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsClass {
    public static void main(String[] args) {
        int[] arr = new int[10];
        List<Integer> list = new ArrayList<>();
        fillArr(arr);
        fillList(list);

        //map()
        arr = Arrays.stream(arr).map(a -> a * 2).toArray();
        list = list.stream().map(a -> a * 2).collect(Collectors.toList());

        System.out.println(Arrays.toString(arr));
        System.out.println(list);


        int[] arr1 = new int[10];
        List<Integer> list1 = new ArrayList<>();
        fillArr(arr1);
        fillList(list1);
        //filter()
        arr1 = Arrays.stream(arr1).filter(a -> a % 2 == 0).toArray();
        list1 = list1.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());

        //forEach()
        Arrays.stream(arr1).forEach(a -> System.out.print(a + " "));
        System.out.println();
        list1.forEach(a -> System.out.print(a + " "));

        int[] arr2 = new int[10];
        List<Integer> list2 = new ArrayList<>();
        fillArr(arr2);
        fillList(list2);

        //reduce()
        int sumArr = Arrays.stream(arr2).reduce((acc, b) -> acc + b).getAsInt();
        System.out.println(sumArr);
        int sumList = list2.stream().reduce((acc, b) -> acc * b).get();
        System.out.println(sumList);

        Set<Integer> integerSet = new HashSet<>(Arrays.asList(3, 4, 7));
        System.out.println(integerSet);//[3, 4, 7]
        integerSet = integerSet.stream().filter(a -> a % 2 != 0).map(a -> a * 2).collect(Collectors.toSet());
        integerSet.forEach(a -> System.out.print(a + " "));//6 14
    }

    public static void fillArr(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }

    public static void fillList(List<Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }
}
