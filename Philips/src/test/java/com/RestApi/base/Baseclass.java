package com.RestApi.base;

import org.apache.log4j.Level;	
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeClass;	
	
import io.restassured.response.Response;
import io.restassured.specification.RedirectSpecification;	
	
	
	
public class Baseclass {	
	
	
	public static RedirectSpecification httpreq;
	public static Response response;
	
	
	public Logger logger;
	@BeforeClass
	public void setup()
	{
	
	logger = logger.getLogger("EmployeeRestApi");
	PropertyConfigurator.configure("log4j.properties");
	logger.setLevel(Level.DEBUG);

	
	
	
	}
}	
