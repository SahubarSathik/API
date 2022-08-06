package com.RestAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DELETE {
	
	static RequestSpecification reqSpec;
	
public static void main(String[] args) {
	
	 reqSpec = RestAssured.given();
	 
	 Response response = reqSpec.delete("https://reqres.in/api/users/2");
	 System.out.println(response.getStatusCode());
	 System.out.println(response.getBody().asPrettyString());
	
	
}
}
