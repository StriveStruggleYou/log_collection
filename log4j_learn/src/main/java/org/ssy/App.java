package org.ssy;

import org.ssy.service.ServiceLog;
import org.ssy.util.UtilLog;
import org.ssy.web.WebLog;

/**
 * Hello world!
 */
public class App {

  public static void main(String[] args) {
    WebLog.log();
    UtilLog.log();
    ServiceLog.log();
  }
}
