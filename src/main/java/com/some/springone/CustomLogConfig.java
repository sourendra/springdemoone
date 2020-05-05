package com.some.springone;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class CustomLogConfig {

    private String rootLoggerLevel;
    private String printedLoggerLevel;

    public void setRootLoggerLevel(String rootLoggerLevel) {
        this.rootLoggerLevel = rootLoggerLevel;
    }

    public void setPrintedLoggerLevel(String printedLoggerLevel) {
        this.printedLoggerLevel = printedLoggerLevel;
    }

    public void initLogger(){
        //parse Levels
        Level rootLevel = Level.parse(rootLoggerLevel);
        Level printedLevel = Level.parse(printedLoggerLevel);

        //get logger for appContext
        Logger applicationContextLogger = Logger.getLogger(AnnotationConfigApplicationContext.class.getName());

        //get parent logger
        Logger parentLogger = applicationContextLogger.getParent();

        //set root logging level
        parentLogger.setLevel(rootLevel);

        //setup console handler
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(printedLevel);
        consoleHandler.setFormatter(new SimpleFormatter());

        //add handler to the logger
        parentLogger.addHandler(consoleHandler);
    }
}
