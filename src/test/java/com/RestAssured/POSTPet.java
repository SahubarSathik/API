package com.RestAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POSTPet {
	static RequestSpecification reqSpec;

	public static void main(String[] args) {
		reqSpec = RestAssured.given();
		reqSpec = reqSpec.header("Content-Type", "application/json");
		reqSpec = reqSpec.header("accept", "application/json");
		reqSpec = reqSpec.body("{\r\n" + 
				"  \"id\": 100,\r\n" + 
				"  \"category\": {\r\n" + 
				"    \"id\": 10,\r\n" + 
				"    \"name\": \"dog\"\r\n" + 
				"  },\r\n" + 
				"  \"name\": \"doggie\",\r\n" + 
				"  \"photoUrls\": [\r\n" + 
				"    \"string\"\r\n" + 
				"  ],\r\n" + 
				"  \"tags\": [\r\n" + 
				"    {\r\n" + 
				"      \"id\": 20,\r\n" + 
				"      \"name\": \"cat\"\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"status\": \"available\"\r\n" + 
				"}");

		Response response = reqSpec.post("https://petstore.swagger.io/v2/pet");
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody().asPrettyString());
	}
}
