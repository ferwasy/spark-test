package ar.com.puentedeideas.sparkjava.test;

public class TestEnvironment {
	
	private static volatile TestEnvironment instance;
	
	private SparkServer<TestApplication> sparkServer;
	
	public static final TestEnvironment initialize() throws Throwable {
		if (instance == null) { 
			synchronized (TestEnvironment.class) {
              if (instance == null) {
            	  instance = new TestEnvironment();
              }
            }
        }
        return instance;
	}
	
	private TestEnvironment() throws Throwable {
		this.sparkServer = new SparkServer<>(TestApplication.class);
		this.sparkServer.before();
	}
	
	public SparkServer<TestApplication> sparkServer() {
		return this.sparkServer;
	}

}
