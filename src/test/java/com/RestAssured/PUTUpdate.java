package com.RestAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PUTUpdate {
	static RequestSpecification reqSpec;
	public static void main(String[] args) {
		 reqSpec = RestAssured.given();
		 reqSpec = reqSpec.header("Content-Type","application/json");
		 reqSpec = reqSpec.body("{\r\n" + 
		 		"    \"name\": \"sathik\",\r\n" + 
		 		"    \"job\": \"softwareEngineer\"\r\n" + 
		 		"}");
		
		 Response response =reqSpec.put("https://reqres.in/api/users/2");
		 System.out.println(response.getStatusCode());
		 System.out.println(response.getBody().asPrettyString());
		 
		 
		
	}
}
