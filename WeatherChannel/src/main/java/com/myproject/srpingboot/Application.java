package com.myproject.srpingboot;
//package com.myproject;
//
//import javax.xml.ws.Endpoint;
//
//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class Application implements CommandLineRunner{
//
//	static final Logger logger = LogManager.getLogger(Application.class.getName());
//	
//		@Value("${service.port}")
//	    private String servicePort;
//	
//		@Override
//	    public void run(String... args) throws Exception {
//	        Endpoint.publish("http://localhost:" + servicePort
//	                + "/myproject", new WeatherChannelImpl());
//	    }
//
//	
//	public static void main(String[] args) {
//	        logger.info("entering application");
//	        SpringApplication.run(Application.class, args);
//	}
//
//}
