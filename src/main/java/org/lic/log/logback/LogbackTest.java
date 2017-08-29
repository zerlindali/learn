package org.lic.log.logback;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;

public class LogbackTest {
	
	private static final Logger logger=(Logger) LoggerFactory.getLogger(LogbackTest.class);

	public static void main(String[] args){
		if(logger.isDebugEnabled()){
			logger.debug("slf4j-logback debug message");
		}
		if(logger.isInfoEnabled()){
			logger.debug("slf4j-logback info message");
		}
		if(logger.isTraceEnabled()){
			logger.debug("slf4j-logback trace message");
		}
		
		LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
	    StatusPrinter.print(lc);
	}
}
