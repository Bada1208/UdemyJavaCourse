package reflection_api;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class TestReflectionClass2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Scanner scanner = new Scanner(System.in);

        Class classObject1 = Class.forName(scanner.nextLine());
        Class classObject2 = Class.forName(scanner.nextLine());
        String methodName = scanner.nextLine();

        Method method = classObject1.getMethod(methodName, classObject2);
        Object o1 = classObject1.newInstance();
        Object o2 = classObject2.getConstructor(String.class).newInstance("String value");
        method.invoke(o1, o2);
        System.out.println(o1);//Person{id=-1, name='String value'}
    }
}
