package api.endpoints;

import static io.restassured.RestAssured.given;

import api.payload.Age;
import api.payload.Exam;
import api.payload.Profile;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UserEndpoints {
	
	public static Response userAge(Age payload) {
		
		Response response=given()
		 .header("x-api-key", "q1Bb7XxZuG8bsuEJRHwwQ2AVSDnj8y0Z3mGb9THi")
		 .header("Authorization","eyJraWQiOiI5V21WeDRkajdVWEU4eWFiQlNoU2hpVmxtXC9lOEo5bUR2VFBHSTJ4Q241TT0iLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiI4MTFiNTUxMC04MDAxLTcwY2EtOGQxYy01ZTcyNWJkNzJlZjMiLCJlbWFpbF92ZXJpZmllZCI6dHJ1ZSwiaXNzIjoiaHR0cHM6XC9cL2NvZ25pdG8taWRwLnVzLWVhc3QtMi5hbWF6b25hd3MuY29tXC91cy1lYXN0LTJfcjlmbTh2Wno5IiwiY29nbml0bzp1c2VybmFtZSI6IjgxMWI1NTEwLTgwMDEtNzBjYS04ZDFjLTVlNzI1YmQ3MmVmMyIsIm9yaWdpbl9qdGkiOiI2ZWRiZTZlZi02YjdhLTQ0MzctOWZkYS02M2ZhMmJhZjU2OTQiLCJhdWQiOiI0YTc1NHNxdG1sdThmZ2dnMGQwOGI5ZGpsMyIsImV2ZW50X2lkIjoiM2Q3ZDAwYTgtZGE1OS00MjEyLWE3ZTUtNmZkY2U3MjgxNGU1IiwidG9rZW5fdXNlIjoiaWQiLCJhdXRoX3RpbWUiOjE3NDM0Njk2MTAsImV4cCI6MTc0MzQ3MzIxMCwiaWF0IjoxNzQzNDY5NjEwLCJqdGkiOiJhYmY1NDllOS1kNDJjLTQ0ODktOTgwMS05ZmQ3Y2FlZDE4YWQiLCJlbWFpbCI6ImhlbW5hdGgyODNAZ21haWwuY29tIn0.opmh_-APUHCNY1MKUPxjG7IZrmSb6qUWSz7ZArC8R-_xhT0HudedoYQqtRdiJ0DRa2SYOzfgd0Oy1f35Y_6-GnjLwMC6tf2ojRKFxZBULxcehxxd4OhV9QWeGTqfWQzvJhqyQMD3FQIBzpkE9cY2A7sN42ypR0MC8vFZlHhcXZUaRlTrQKyA_DStvgRqdQT9H4KgOcH5omrMjpbBVPTqrdFhlT1weIpHYqxV9eRykmfl9G-MLuG0lJDE7OJfIz7Zx47RSYHUdjHWyxUTVUP0-84l0T-xXdJEH3yi2VV7ASPjIvEtShFHyS9D45S4nIJDNpWq-Wln595oEcMCbGYqWg")
		 .contentType(ContentType.JSON)
		 .accept(ContentType.JSON)
		 .body(payload)
		 
		 .when()
		  .post(Routes.age_URL);
		
		return response;	
		
	}
	
public static Response userProfile(Profile payload) {
		
		Response response=given()
		 .contentType(ContentType.JSON)
		 .accept(ContentType.JSON)
		 .body(payload)
		 
		 .when()
		  .post(Routes.profile_URL);
		
		return response;	
		
	}

public static Response userLanguage(Exam payload) {
	
	Response response=given()
	 .contentType(ContentType.JSON)
	 .accept(ContentType.JSON)
	 .body(payload)
	 
	 .when()
	  .post(Routes.exam_URL);
	
	return response;	
	
}

}
