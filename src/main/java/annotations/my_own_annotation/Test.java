package annotations.my_own_annotation;

public class Test {
    @MethodInfo(author = "Bogdan", purpose = "print hello")
    public void printHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.printHello();//hello
    }
}
