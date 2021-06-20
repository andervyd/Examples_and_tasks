package by.andervyd.standard_libraries.log_handler;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Ex00 {
    public static void main(String[] args) {

        Logger logger =
                Logger.getLogger("rus.lifebeing.myapp.computing");
        logger.setLevel(Level.ALL);

        logger.info("Message");
        logger.warning("Warning");

        try {
            int i = 0 / 0;
        } catch (Exception e) {
            logger.log(Level.WARNING, "Division by zero", e);
        }
    }
}
