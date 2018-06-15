package org.ssy.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by manager on 2018/6/15.
 */
public class ServiceLog {

  private static Logger logger = LoggerFactory.getLogger("org.ssy.service");


  public static void log() {
    logger.warn("ServiceLog");
  }
}
