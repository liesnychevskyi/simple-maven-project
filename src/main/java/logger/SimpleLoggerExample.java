package logger;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleLoggerExample {

    private static final Logger log = LoggerFactory.getLogger(SimpleLoggerExample.class);

    public static void main(String[] args) {
        log.error("This is an Error Message from Logger");
        log.debug("This is a Debug Message from Logger");
        log.warn("This is a Warning Message from Logger");
        log.info("This is an Info Message from Logger");
    }
}
