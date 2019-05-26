package com.RestApi.base;


import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.utilities.RestUtil;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RedirectSpecification;

public class Tc2_Post extends Baseclass {
	
	String empname = RestUtil.empname();
	String empsal = RestUtil.empsal();
	String empAge = RestUtil.empAge();
	
	@Test
	void Post() throws InterruptedException
	{
		logger.info("*********Started TC002_post**********");
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
		httpreq=(RedirectSpecification) RestAssured.given();
		JSONObject requestParams = new JSONObject();
		requestParams.put("name", empname);
		requestParams.put("salary",empsal);
		requestParams.put("age",empAge);
		httpreq.header("Count-Type","application/json");
		httpreq.body(requestParams.toJSONString());
		response =httpreq.request(Method.POST,"/create");
		Thread.sleep(5000);
	}
@Test
public void checkResponsebody() throws InterruptedException
{
	String ResponseBody=response.getBody().asString();
	logger.info("Post MESSAGE" +ResponseBody);
	Assert.assertEquals(ResponseBody.contains(empname),true);
	Assert.assertEquals(ResponseBody.contains(empsal),true);
	Assert.assertEquals(ResponseBody.contains(empAge),true);
}

public static String getid() throws InterruptedException
{
	JsonPath jsonPathEvaluator = response.jsonPath();
	String employeeID = jsonPathEvaluator.get("id");
	System.out.println("Employee ID received from Response" + employeeID);
	Thread.sleep(3000);
	return(employeeID);
}
@Test

	String  
	
	
}
	



		
		
		
		
	
	
	
	


