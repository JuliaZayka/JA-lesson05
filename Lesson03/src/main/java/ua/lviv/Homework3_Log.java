package ua.lviv;

import org.apache.log4j.BasicConfigurator; 
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Homework3_Log {

	private static Logger LOG = Logger.getLogger(Homework3_Log.class);

	public static void main(String[] args) {
	
	logWithBasicConfigurator();
	logWithDomConfigurator();
		
	}
	
	public static void logWithBasicConfigurator() {
		BasicConfigurator.configure();	
		//LOG.trace("TRACE Logger message of project");
		  LOG.debug("DEBUG Logger message of project");
		  LOG.info("INFO Logger message of project");
		  LOG.warn("WARN Logger message of project");
		 // LOG.error("ERROR Logger message of project");
		//LOG.fatal("FATAL Logger message of project");
	}
	
	public static void logWithDomConfigurator() {
		DOMConfigurator.configure("loggerConfig.xml");	
		//LOG.trace("TRACE Logger message of project");
		LOG.debug("DEBUG Logger message of project");
		LOG.info("INFO Logger message of project");
		LOG.warn("WARN Logger message of project");
		LOG.error("ERROR Logger message of project");
		//LOG.fatal("FATAL Logger message of project");
	}
}
