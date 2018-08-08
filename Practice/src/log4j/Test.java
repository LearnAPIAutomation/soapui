package log4j;

import org.apache.logging.log4j.*;


public class Test {
	
	static Logger log=LogManager.getLogger(Test.class.getName());
	
	public static void main(String[] args) {
		
		log.debug("this is debug message");
		log.error("this is error");
		log.fatal("fatal error");
		
	}

}
