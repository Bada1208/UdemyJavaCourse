package reg_ex;

import java.util.Arrays;

public class RegExTestClass {
    public static void main(String[] args) {
       /*
        \\d - one number
        \\w - one letter
        \\w = [a-zA-Z]
        + - 1 or >
        * - 0 or >
        ? - 0 or 1 symbols before
        ( | | ) - one string from the set
        (a|b|c) equals [a-c] - only a, b and c letters
        [a-zA-Z] - all letters lower & upper case
        [0-9] equals \\d
        [^abc] - all symbols except abc
        . - any symbol
        {2} - 2 symbols before
        {2, } - 2 or more symbols before
        {2, 4} - between 2 & 4 symbols
        */
        String a = "33";
        System.out.println(a.matches("\\d*"));

        String b = "-5454";
        String c = "5454";
        System.out.println(c.matches("-?\\d*"));

        String d = "-5454";
        String e = "+5454";
        System.out.println(d.matches("(-|\\+)?\\d*"));
        String f = "ydfg767";
        System.out.println(f.matches("[a-zA-Z]+\\d+"));

        String g = "hello";
        System.out.println(g.matches("[^abc]*"));

        String url = "http://www.google.com";
        String url1 = "http://www.yandex.ru";
        System.out.println(url.matches("http://www\\..+\\.(com|ru)"));
        System.out.println(url1.matches("http://www\\..+\\.(com|ru)"));

        String num = "123";
        System.out.println(num.matches("\\d{3}"));

        String str = "hello man how are you";
        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));

        String str1 = "hello.man.how.are.you";
        String[] words1 = str1.split("\\.");
        System.out.println(Arrays.toString(words1));

        String str3 = "hello there hey";
        System.out.println(str3.replace(" ", "."));
        System.out.println(str3.replaceFirst(" ", "."));

    }
}
