package by.epam.javatraining.alchern2412.tasks.maintask02.view;

import org.apache.log4j.Logger;

/**
 *
 * @author Alex
 */
public class View {

    public static Logger logger = Logger.getRootLogger();

    public static void print(Object obj) {
        logger.info(obj);
    }
}
