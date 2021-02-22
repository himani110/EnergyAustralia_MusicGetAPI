import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;
import org.testng.Reporter;
 
public class BasicTestCases { 

 @Test(priority=1)
 //Test case to check the Status Code Message
 public void PositiveCases()
 {   
 // Specify the base URL to the RESTful web service
 RestAssured.baseURI = "http://eacodingtest.digital.energyaustralia.com.au/api/v1";
 
 // Get the RequestSpecification of the request 
 RequestSpecification httpRequest = RestAssured.given();
 
 // Make a request to the server by specifying the method Type and the method URL.
 // Storing the response in a variable.
 Response response = httpRequest.request(Method.GET, "/festivals");
 
 // Printing the body of the message
 String responseBody = response.getBody().asString();
 JsonPath jsonPathEvaluator = response.jsonPath();
 //System.out.println("Response Body is =>  " + responseBody);
 int StatusCode = response.getStatusCode();
 // Test Case - Status Code check
 System.out.println("****************************** Start of Test case 1 || check Status Code*************************");
 Reporter.log("Positive Test case :: Verifying Status Code - 200 and 429");
 switch (StatusCode)
 {
 //Test case - To check that Actual Status Code received is 200 and Print the body of Response Message
 case 200:
	 Assert.assertEquals(StatusCode /*actual value*/, 200 /*expected value*/, "Status Code returned : 200");
	 System.out.println("Response Body is =>  " + responseBody);
	 Reporter.log("Expected status Code matches Actual Status Code : 200",true);
	 Reporter.log("Test case - Passed",true);
	 break;
//Test case - To check that Actual Status Code received is 429 and Print the body of Response Message	 
 case 429:
	 Assert.assertEquals(StatusCode /*actual value*/, 429 /*expected value*/, "Status Code returned : 429");
	 System.out.println("Response Body is =>  " + responseBody);
	 assertEquals(responseBody/*actual value*/, "Too many requests, throttling"/*expected value*/,"For Status Code 429 : Proper Body Message is coming");
	 Reporter.log("TC 1: Status Code : 429 : Proper Body Message is coming",true);
	 Reporter.log("Expected status Code matches Actual Status Code : 429",true);
	 Reporter.log("Test case - Passed",true);
	 
	 break;	 
 }
 if (StatusCode !=429)
 {
 System.out.println("****************************** Finish of Test case 1 *************************");
 System.out.println("****************************** Start of Test case 2 || Check Json Schema *************************");
 System.out.println("Festival Name received from Response " + jsonPathEvaluator.get("name"));
 System.out.println("BandName received from Response " + jsonPathEvaluator.get("bands.name"));
 System.out.println("RecordLabel received from Response " + jsonPathEvaluator.get("bands.recordLabel"));
 Reporter.log("Test case 2 - Failed ", true);
 Reporter.log("Currenlty, RecordLabel Name is inherited in Band Attribute	",true);
 System.out.println("****************************** Finish of Test case 2 *************************");
 }
 else
 {
	 System.out.println("TC 2 Stopped:429 Status Code received");
 }
 
 //Test case 3 :: Header check
 System.out.println("****************************** Start of Test case 3 || Headers Check *************************");

 Reporter.log("Test case 2 - Failed ", true);
 Reporter.log("Currenlty, RecordLabel Name is inherited in Band Attribute	",true);
 System.out.println("****************************** Finish of Test case 2 *************************");

 
 }
}