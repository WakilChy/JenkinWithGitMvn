package api.intig;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APITest01 {
	
	@Test
	public void statusCode() {
			Response resGet = RestAssured.get("https://reqres.in/api/users?page=2");
			System.out.println("Status Code is : "+resGet.getStatusCode());
			System.out.println("Status Content is : "+resGet.contentType());
			System.out.println("Get time : "+resGet.getTime());
			//System.out.println("Body  : "+resGet.body().asPrettyString());
			
			Assert.assertEquals(resGet.getStatusCode(), 200);
	}

}
