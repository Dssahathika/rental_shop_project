/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.db;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.RollingFileAppender;
//import org.apache.log4j.RollingFileAppender
/**
 *
 * @author Dinithi
 */
public class loggers {
   public static org.apache.log4j.Logger loginLog(String clz){
        try {
            String pathString = "C:\\Users\\Dinithi\\Documents\\NetBeansProjects\\finaSadlProject\\src\\com\\db\\LoginLog.java";
            PatternLayout patternLayout = new PatternLayout("%p %d %m %n ");
            RollingFileAppender fileAppender = new RollingFileAppender(patternLayout, pathString);
            fileAppender.setMaxFileSize("10MB");
            fileAppender.setName("LoginLog");
            fileAppender.activateOptions();
            Logger.getRootLogger().addAppender(fileAppender);
            return org.apache.log4j.Logger.getLogger(clz);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    } 

    
}
