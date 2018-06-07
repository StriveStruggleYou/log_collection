package org.ssy.learn2;


import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.LoggerContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by manager on 2018/6/7.
 */
public class LearnLevelInherit {

  public static void main(String args[]) {

    LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
    //设置全局日志级别
    ch.qos.logback.classic.Logger logger = loggerContext.getLogger("org.ssy.learn2");
    //TRACE < DEBUG < INFO < WARN < ERROR,default是debug模式
    System.out.println(logger.getLevel());
    logger.trace("hello world");
    logger.setLevel(Level.INFO);
    logger.warn("Low fuel level.");
    // 该请求无效，因为DEBUG < INFO.
    logger.debug("Starting search for nearest gas station.");
  }

}
