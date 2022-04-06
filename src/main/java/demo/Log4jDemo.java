package demo;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.message.LoggerNameAwareMessage;


public class Log4jDemo {

    private static Logger logger = LogManager.getLogger(Log4jDemo.class);

    public static void main(String[] args) {

        System.out.println("Hello world");

        logger.info("This is info logger message");
        logger.warn("This is warn logger message");
        logger.error("This is error logger message");
        logger.fatal("This is fatal logger message");
        logger.debug("This is debug logger message");

        System.out.println("Completed");

    }
}
