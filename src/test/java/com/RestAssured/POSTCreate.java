package com.RestAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POSTCreate {
	static RequestSpecification reqSpec;

	public static void main(String[] args) {
		reqSpec = RestAssured.given();
		reqSpec = reqSpec.header("Content-Type", "application/json");
		reqSpec = reqSpec.body("{\r\n" + "    \"name\": \"sathik\",\r\n" + "    \"job\": \"testEngineer\"\r\n" + "}");

		Response response = reqSpec.post("https://reqres.in/api/users");
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody().asPrettyString());
		System.out.println("--------postSingleRigistersuccessful-------");
		reqSpec = reqSpec.body(
				"{\r\n" + "    \"email\": \"eve.holt@reqres.in\",\r\n" + "    \"password\": \"pistol1\"\r\n" + "}");

		Response response1 = reqSpec.post("https://reqres.in/api/register");
		System.out.println(response1.getStatusCode());
		System.out.println(response1.getBody().asPrettyString());
		System.out.println("--------postRigisterUnseccessful-------");
		reqSpec = reqSpec.body("{\r\n" + "    \"email\": \"sydney@fife\"\r\n" + "}");

		Response response2 = reqSpec.post("https://reqres.in/api/register");
		System.out.println(response2.getStatusCode());
		System.out.println(response2.getBody().asPrettyString());
		System.out.println("--------login-------");
		reqSpec = reqSpec.body(
				"{\r\n" + "    \"email\": \"eve.holt@reqres.in\",\r\n" + "    \"password\": \"cityslicka\"\r\n" + "}");

		Response response3 = reqSpec.post("https://reqres.in/api/login");
		System.out.println(response3.getStatusCode());
		System.out.println(response3.getBody().asPrettyString());
		System.out.println("--------loginUnseuccessful-------");
		reqSpec = reqSpec.body(
				"{\r\n" + 
				"    \"email\": \"peter@klaven\"\r\n" + 
				"}");

		Response response4 = reqSpec.post("https://reqres.in/api/login");
		System.out.println(response4.getStatusCode());
		System.out.println(response4.getBody().asPrettyString());
	}

}
