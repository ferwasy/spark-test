package ar.com.puentedeideas.sparkjava.test;

import spark.Request;
import spark.Response;

public class TestRequest2 {
	
	private Request request;
	
	private Response response;
	
	public TestRequest2(Request request, Response response) {
		this.request = request;
		this.response = response;
	}

	public String execute() {
		System.out.println(this.request.contextPath());
		this.response.header("Content-Type", "text/plain");
		return "This works 2!";
	}
	
}
