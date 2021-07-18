import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC001_WeatherApi_Get {
	@Test
	void getweatherDeatils()
	{
		 //Specify base URI
		  RestAssured.baseURI="https://reqres.in";
		  
		  //Request object
		  RequestSpecification httpRequest=RestAssured.given();
		  
		  //Response object
		  Response response=httpRequest.request(Method.GET,"#support-heading");
		  
		  //print response in console window
		  String responseBody=response.getBody().asString();
		  System.out.println("Response Body is:" +responseBody);
		  
		  //validating headers
		  String contentType=response.header("Content-Type");// capture details of Content-Type header
		  System.out.println("Content Type is:"+contentType);
		  Assert.assertEquals(contentType, "text/html; charset=utf-8");
		  
		  String contentEncoding=response.header("Transfer-Encoding");// capture details of Content-Encoding  header
		  System.out.println("Transfer Encoding is:"+contentEncoding);
		  Assert.assertEquals(contentEncoding, "chunked");
		  
		  int statusCode= response.getStatusCode();
		  Assert.assertEquals(statusCode, 404);
		  
		  String statusLine= response.getStatusLine();
		  System.out.println("Status Line is "+statusLine);
		  
		 }
		 
				
		
	}


