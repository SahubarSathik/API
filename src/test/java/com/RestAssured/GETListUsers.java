package com.RestAssured;

import javax.management.modelmbean.RequiredModelMBean;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GETListUsers {
	static RequestSpecification reqSpec;

	public static void main(String[] args) {

		System.out.println("-------------multiUsers-----------------------");
		// Initialize the RestAssured Class
		reqSpec = RestAssured.given();
		// Header
		reqSpec = reqSpec.header("Content-Type", "application/json");
		// queryParameter
		reqSpec = reqSpec.queryParam("page", "2");

		// Reequest Type
		Response response = reqSpec.get("https://reqres.in/api/users");
		// status code
		int statusCode = response.statusCode();
		System.out.println(statusCode);
		String asString = response.asString();
		// System.out.println(asString);
		String asPrettyString = response.asPrettyString();
		System.out.println(asPrettyString);

		System.out.println("----------------sinlgleUsers---------------------");
		reqSpec = reqSpec.header("","");
		reqSpec = reqSpec.pathParam("page", "2");
		Response response1 = reqSpec.get("https://reqres.in/api/users/{page}");
		System.out.println(response1.getStatusCode());
		System.out.println(response1.getBody().asPrettyString());

		System.out.println("--------singleUserNOtFound----------------");
		reqSpec = reqSpec.header("Content-Type", "application/json");
		reqSpec = reqSpec.pathParam("page", "23");
		Response response2 = reqSpec.get("https://reqres.in/api/users/{page}");
		System.out.println(response2.getStatusCode());
		System.out.println(response2.getBody().asPrettyString());

		System.out.println("--------listUNknown-------------");
		// reqSpec = reqSpec.header("Content-Type","application/json");
		reqSpec = reqSpec.pathParam("page", "23");
		Response response3 = reqSpec.get("https://reqres.in/api/{page}");
		System.out.println(response3.getStatusCode());
		System.out.println(response3.getBody().asPrettyString());

		System.out.println("--------singleUNknown-------------");
		// reqSpec = reqSpec.header("Content-Type","application/json");
		reqSpec = reqSpec.pathParam("page", "2");
		Response response4 = reqSpec.get("https://reqres.in/api/{page}/2");
		System.out.println(response4.getStatusCode());
		System.out.println(response4.getBody().asPrettyString());

		System.out.println("--------singleUNknownNOtFound-------------");
		reqSpec = reqSpec.header("Content-Type","application/json");
		reqSpec = reqSpec.queryParam("delay", "3");
		Response response5 = reqSpec.get("https://reqres.in/api/users/{delay}");
		System.out.println(response5.getStatusCode());
		System.out.println(response5.getBody().asPrettyString());

	}

}
