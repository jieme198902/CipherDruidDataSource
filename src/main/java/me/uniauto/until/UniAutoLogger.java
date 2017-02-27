package me.uniauto.until;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 互联网平台日志封装类，少去了各个模块不断引入日志依赖的繁琐问题
 *
 * @author quanxiwei
 */
public class UniAutoLogger {
    public static boolean initLoggger = false;

    private Logger logger;

    private UniAutoLogger(Class<?> clazz) {
        super();
        logger = LoggerFactory.getLogger(clazz);
    }

    private UniAutoLogger(String loggerName) {
        super();
        logger = LoggerFactory.getLogger(loggerName);
    }


    /**
     * 获取一个logger对象，采用静态方法，方便使用。
     *
     * @param loggerName 日志记录名
     * @return {@link UniAutoLogger}
     */
    public static UniAutoLogger getLogger(String loggerName) {
        return new UniAutoLogger(loggerName);
    }

    /**
     * 获取一个logger对象，采用静态方法，方便使用
     *
     * @param clazz 日志记录的类名
     * @return {@link UniAutoLogger}
     */
    public static UniAutoLogger getLogger(Class<?> clazz) {
        return new UniAutoLogger(clazz);
    }

    public void debug(String msg) {
        logger.debug(msg);
    }

    public void debug(String format, Object... argArray) {
        logger.debug(format, argArray);
    }

    public void debug(String msg, Throwable t) {
        logger.debug(msg, t);
    }

    public void debug(Throwable t) {
        logger.debug(t.getMessage(), t);
    }

    public void warn(String msg) {
        logger.warn(msg);
    }

    public void warn(String format, Object... argArray) {
        logger.warn(format, argArray);
    }

    public void warn(String msg, Throwable t) {
        logger.warn(msg, t);
    }

    public void warn(Throwable t) {
        logger.warn(t.getMessage(), t);
    }

    public void error(String msg) {
        logger.error(msg);
    }

    public void error(String format, Object... argArray) {
        logger.error(format, argArray);
    }

    public void error(String msg, Throwable t) {
        logger.error(msg, t);
    }

    public void error(Throwable t) {
        logger.error(t.getMessage(), t);
    }

    public void info(String msg) {
        logger.info(msg);
    }

    public void info(String format, Object... argArray) {
        logger.info(format, argArray);
    }

    public void info(String msg, Throwable t) {
        logger.info(msg, t);
    }

    public void info(Throwable t) {
        logger.info(t.getMessage(), t);
    }

    public void trace(String msg) {
        logger.trace(msg);
    }

    public void trace(String format, Object... argArray) {
        logger.trace(format, argArray);
    }

    public void trace(String msg, Throwable t) {
        logger.trace(msg, t);
    }

    public void trace(Throwable t) {
        logger.trace(t.getMessage(), t);
    }

    public boolean isDebugEnabled() {
        return logger.isDebugEnabled();
    }
}
