package ar.com.puentedeideas.sparkjava.test;

import spark.servlet.SparkApplication;

public class TestApplication implements SparkApplication {

	@Override
	public void init() {
		System.out.println("Test application initialized");
		new TestRequestDefinition();
	}

	@Override
	public void destroy() {
		System.out.println("Test application stopped");
	}

}
