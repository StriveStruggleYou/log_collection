package org.ssy.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by manager on 2018/6/15.
 */
public class WebLog {

  private static Logger logger = LoggerFactory.getLogger("org.ssy.web");

  public static void log() {
    logger.info("WebLog");
  }
}
