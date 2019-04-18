package cn.dubby.step1.slf4j.api.log4j2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author dubby
 * @date 2019/4/18 11:43
 */
public class HelloWorld {

    private static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(HelloWorld.class);
        logger.info("HelloWorld");
        logger.info("Random: {}", ThreadLocalRandom.current().nextInt(0, 1024));
    }

}
