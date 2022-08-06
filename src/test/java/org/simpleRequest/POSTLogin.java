package org.simpleRequest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POSTLogin {
	static RequestSpecification reqSpec;

	public static void main(String[] args) {

		reqSpec = RestAssured.given();
		reqSpec = reqSpec.header("Content-Type", "application/json");
		// Basic Authentication
		reqSpec = reqSpec.auth().preemptive().basic("sathikdme@gmail.com", "Sahubar@1990");
		Response response = reqSpec.post("https://omrbranch.com/api/login");
		System.out.println(response.getStatusCode());
		System.out.println(response.body().asPrettyString());

	}
}
