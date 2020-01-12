package testing.junit_5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyMathTest {
    MyMath myMath;

    @BeforeEach
    public void init() {
        myMath = new MyMath();
    }

    @Test//(expected = ArithmeticException.class) ->j unit4
    public void zeroDenominatorShouldThrowException() {
        Exception exception = assertThrows(ArithmeticException.class, () -> myMath.divide(1, 0));
        assertTrue(exception.getMessage().contains("Cannot divide by zero"));
        //myMath.divide(1,0);->j unit4
    }
}
