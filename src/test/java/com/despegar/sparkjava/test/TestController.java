package com.despegar.sparkjava.test;

import spark.Request;
import spark.Response;
import spark.Service;

/**
 * The class that defines a Spark Web Framework route
 * @author fwasy
 *
 */
public class TestController {

	public TestController(Service service) {
		service.get("/test", (request, response) ->  this.testMethod(request, response));
	}
	
	public String testMethod(Request request, Response response) {
		return "This works!";
	}
		
}