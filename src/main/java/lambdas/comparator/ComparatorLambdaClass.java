package lambdas.comparator;

import java.util.*;

public class ComparatorLambdaClass {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Hello", "a", "ab", "segfsgf"));
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) return 1;
                else if (o1.length() < o2.length()) return -1;
                else return 0;
            }
        });
        System.out.println(list);
        List<String> list1 = new ArrayList<>(Arrays.asList("Helo", "a", "absdgsdgsg", "segfsgf"));
        list1.sort((o1, o2) -> {
            if (o1.length() > o2.length()) return 1;
            else if (o1.length() < o2.length()) return -1;
            else return 0;
        });
        System.out.println(list1);

        List<String> list2 = new ArrayList<>(Arrays.asList("Hello", "aq", "kjhghh", "segfsgf"));
        Comparator<String> comparator = ((o1, o2) -> {
            if (o1.length() > o2.length()) return 1;
            else if (o1.length() < o2.length()) return -1;
            else return 0;
        });
        list2.sort(comparator);
        System.out.println(list2);
    }
}
