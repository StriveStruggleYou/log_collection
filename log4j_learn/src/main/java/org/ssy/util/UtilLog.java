package org.ssy.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by manager on 2018/6/15.
 */
public class UtilLog {


  private static Logger logger = LoggerFactory.getLogger("org.ssy.util");

  public static void log() {
    logger.warn("UtilLog");
  }

}
