package RestAPI;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

import static io.restassured.RestAssured.*;


public class RESTAPI {
@Test
	public void getUser()
{
		Response response = given().when().get("https://reqres.in/api/users?page=2");
		int statusoutput = response.statusCode();
		int expectedstatus = 200;
		
		System.out.println(statusoutput);
		System.out.println(expectedstatus);
		
		AssertJUnit.assertEquals(statusoutput, expectedstatus);
		
}
 @Test
public void getsingleUser()
{
		Response response = given().when().get("https://reqres.in/api/users/2");
		ResponseBody responseBody = response.getBody();
		
		String actualresponse = responseBody.asString();
		System.out.println(actualresponse);
		AssertJUnit.assertTrue(actualresponse.contains("Weaver"));
		
}


}
