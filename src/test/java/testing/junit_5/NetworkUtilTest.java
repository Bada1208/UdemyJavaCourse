package testing.junit_5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class NetworkUtilTest {
    @Test
    @Timeout(value = 2000, unit = TimeUnit.MILLISECONDS)
    public void getConnectionShouldReturnFasterThanTwoSeconds() {
        NetworkUtils.getConnection();
    }
}
