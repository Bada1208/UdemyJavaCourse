package annotations;

public class TestClass {
    @Deprecated
    public void myMethod(){
        System.out.println("Hello");
    }
}
class MainClass{
    public static void main(String[] args) {
        TestClass testClass=new TestClass();
        testClass.myMethod();
    }
}
