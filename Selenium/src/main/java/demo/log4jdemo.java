package demo;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class log4jdemo {
	
	private static Logger logger = LogManager.getLogger(log4jdemo.class);

	public static void main(String[] args) {
		
		System.out.println("hello!");
		
		logger.info("this is information message");
		logger.error("this is error message");
		logger.warn("this is warning message");
		
		System.out.println("comlpeted");
		
		 	

	}

}
