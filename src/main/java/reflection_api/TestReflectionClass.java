package reflection_api;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestReflectionClass {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person();

        Class personClass = Person.class;//1
        Class personClass1 = person.getClass();//2
        Class personClass2 = Class.forName("reflection_api.Person");//3

        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName() + ", " + method.getReturnType() +
                    ", " + Arrays.toString(method.getParameterTypes()));
        }
        /*
getName, class java.lang.String, []
getId, int, []
setName, void, [class java.lang.String]
setId, void, [int]
sayHello, void, []
wait, void, []
wait, void, [long, int]
wait, void, [long]
equals, boolean, [class java.lang.Object]
toString, class java.lang.String, []
hashCode, int, []
getClass, class java.lang.Class, []
notify, void, []
notifyAll, void, []*/
        Field[] fields = personClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + ", " + field.getType());
        }
        /*
id, int
name, class java.lang.String*/
        Annotation[] annotations = personClass.getAnnotations();
        for (Annotation annotation : annotations) {
            if (annotation instanceof Author) System.out.println("Author");//Author
        }
    }
}
