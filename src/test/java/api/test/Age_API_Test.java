package api.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endpoints.UserEndpoints;
import api.payload.Age;
import io.restassured.response.Response;

public class Age_API_Test {
	 
	Faker faker;
	Age agePayload;
	
	@BeforeClass
	
	public void setUpData()
	{
		faker=new Faker();
		agePayload = new Age();
		
		agePayload.setRelationship_id(1);
		agePayload.setType("update");
		//agePayload.setCognito_id(#############);
		agePayload.setClient_id(212);
		agePayload.setAge(34);
		agePayload.setRequest_type(1);
		
	}
	
	@Test (priority=1)
	public void testPostUser()
	{
		Response response= UserEndpoints.userAge(agePayload);
		response.then().log().all();
		
		Assert.assertEquals(response.getStatusCode(), 200);
		
		
	}

}
