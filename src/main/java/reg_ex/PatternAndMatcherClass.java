package reg_ex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatcherClass {
    public static void main(String[] args) {
        String s = "swkjedfh waskfj askj d ss ,sdfsdf," +
                " joe@gmail.com asdf asdasd asd asdf rfr fddsd moe@yandex.ru";
        Pattern email = Pattern.compile("\\w+@(gmail|yandex)\\.(com|ru)");
        Matcher matcher = email.matcher(s);
        while (matcher.find()) {// находим совпадение
            System.out.println(matcher.group());// получаем совпадение
        }
    }
}
