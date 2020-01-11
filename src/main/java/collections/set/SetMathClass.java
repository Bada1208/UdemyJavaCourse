package collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetMathClass {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(0);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(8);

        //union - объединение множеств
        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        System.out.println(unionSet);//[0, 1, 2, 3, 4, 5, 6, 7, 8]

        //intersection - пересечение множеств
        Set<Integer> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        System.out.println(intersectionSet);//[3, 4, 5]

        // difference - разность множеств
        Set<Integer> differenceSet = new HashSet<>(set1);
        differenceSet.removeAll(set2);
        System.out.println(differenceSet);//[0, 1, 2]
    }
}
