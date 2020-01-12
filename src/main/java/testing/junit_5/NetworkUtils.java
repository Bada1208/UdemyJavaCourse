package testing.junit_5;

public class NetworkUtils {
    public static void getConnection() {
        //gets connection with the server
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return;
    }
}
