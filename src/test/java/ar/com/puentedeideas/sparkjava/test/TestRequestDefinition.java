package ar.com.puentedeideas.sparkjava.test;

import static spark.Spark.get;

/**
 * The class that defines a Spark Web Framework route
 * @author fwasy
 *
 */
public class TestRequestDefinition {

	public TestRequestDefinition() {
		get("/test1", (request, response) ->  new TestRequest1(request, response).execute());
		get("/test2", (request, response) ->  new TestRequest2(request, response).execute());
	}	
		
}