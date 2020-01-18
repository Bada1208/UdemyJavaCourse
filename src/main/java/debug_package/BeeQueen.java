package debug_package;

/**
 * Class which shows bee-hive in programmatically way.
 */
public class BeeQueen {

    private double eatenNectar = 0;

    public void eatNectar(double nectar) {
        eatenNectar += nectar;
    }

    public double getEatenNectar() {
        return eatenNectar;
    }
}
