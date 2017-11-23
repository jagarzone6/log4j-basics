import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Demo {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger("Demo");
        PropertyConfigurator.configure("basics/src/test/resources/log4j.properties");
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
        logger.fatal("fatal");

    }
}
