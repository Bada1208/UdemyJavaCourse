package testing.junit_5;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Vector2DTest {
    private final double EPS = 1e-9;//1e-9 == 0.0000000001
    private static Vector2D vector;

    @BeforeAll
    public static void createNewVector() {
        vector = new Vector2D();
    }

    @Test
    public void newVectorShouldHaveZeroLength() {
        assertEquals(0, vector.length(), EPS);
    }

    @Test
    public void newVectorShouldHaveZeroX() {
        assertEquals(0, vector.getX(), EPS);
    }

    @Test
    public void newVectorShouldHaveZeroY() {
        assertEquals(0, vector.getY(), EPS);
    }
}
