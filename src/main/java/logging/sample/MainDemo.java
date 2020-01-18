package logging.sample;

public class MainDemo {
    public static void main(String[] args) {
        org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(MainDemo.class);
        logger.warn("Log4j didn't find log4j.properties. Please, provide them");
    }
}
