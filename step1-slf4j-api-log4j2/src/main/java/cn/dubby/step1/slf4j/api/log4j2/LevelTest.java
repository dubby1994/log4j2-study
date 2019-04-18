package cn.dubby.step1.slf4j.api.log4j2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author dubby
 * @date 2019/4/18 16:23
 */
public class LevelTest {

    private static final Logger logger = LoggerFactory.getLogger(LevelTest.class);

    public static void main(String[] args) {
        logger.trace("trace");
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
    }

}
