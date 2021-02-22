import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;
 
public class MoreCases { 
	
 @Test
 public static void MusicFestivalData()
 {   
 // Specify the base URL to the RESTful web service
 RestAssured.baseURI = "http://eacodingtest.digital.energyaustralia.com.au/api/v1";
 
 // Get the RequestSpecification of the request that you want to sent
 // to the server. The server is specified by the BaseURI that we have
 // specified in the above step.
 RequestSpecification httpRequest = RestAssured.given();
 
 // Make a request to the server by specifying the method Type and the method URL.
 // This will return the Response from the server. Store the response in a variable.
 Response response = httpRequest.request(Method.POST, "/festivals");
 
 // Now let us print the body of the message to see what response
 // we have received from the server
 String responseBody = response.getBody().asString();
 JsonPath jsonPathEvaluator = response.jsonPath();
 System.out.println("Response Body is =>  " + responseBody);
 int StatusCode = response.getStatusCode();
 // Test Case - Status Code check
 System.out.println("****************************** Test case 1 *************************");
 System.out.println("****************************** Negative Case - To check call of API with different Method-POST *************************");
 System.out.println("Status Code Received =>  " + StatusCode);
 Assert.assertEquals(StatusCode /*actual value*/, 405 /*expected value*/, "404 is the correct Status Code--");
 
 }

 

}