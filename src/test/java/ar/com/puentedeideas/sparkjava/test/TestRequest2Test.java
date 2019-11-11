package ar.com.puentedeideas.sparkjava.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.ClassRule;
import org.junit.Test;

import com.despegar.http.client.GetMethod;
import com.despegar.http.client.HttpResponse;

/**
 * The test class
 * @author fwasy
 *
 */
public class TestRequest2Test {
	
	@ClassRule
	public static SparkServer<TestApplication> testServer = new SparkServer<>(TestApplication.class, 4567);
	
	@Test
	public void test() throws Exception {
		GetMethod get = testServer.get("/test2", false);
		get.addHeader("Test-Header", "test");
		HttpResponse httpResponse = testServer.execute(get);
		assertEquals(200, httpResponse.code());
		assertEquals("This works 2!", new String(httpResponse.body()));
		assertNotNull(testServer.getApplication());
	}
	
	
}