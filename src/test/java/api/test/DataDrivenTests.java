package api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.UserEndpoints;
import api.payload.Age;
import api.utilities.DataProviders;
import io.restassured.response.Response;


//we can pass multiple data
public class DataDrivenTests {
	
	@Test(priority=1, dataProvider="Data", dataProviderClass=DataProviders.class)
	
	public void testPostUser(int Relationship_ID, String Type, int Client_ID, int Age, int Request_type, int Cognito_ID) {
		Age agePayload= new Age();
		agePayload.setRelationship_id(Relationship_ID);
		agePayload.setType(Type);
		agePayload.setClient_id(Client_ID);
		agePayload.setAge(Age);
		agePayload.setRequest_type(Request_type);
		agePayload.setCognito_id(Cognito_ID);
		
		Response response= UserEndpoints.userAge(agePayload);
		//response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);
		
		
		
	}
	

}

