package org.simpleRequest;

import org.testng.annotations.Test;

import com.BaseClass.BaseClass;

import io.restassured.response.Response;

public class SampleTestNG extends BaseClass {

	@Test

	private void login() {
		// 1.Header
		addHeader("Content-Type", "application/json");

		// 2.Basic Auth
		basicAuth("sathikdme@gmail.com", "Sahubar@1990");

		// 3.Request Type
		Response response = requestType("POST", "https://omrbranch.com/api/login");

		int statusCode = getStatusCode(response);
		System.out.println(statusCode);

		String jsonFormat = getBodyAsPrettyString(response);
		System.out.println(jsonFormat);

	}

}
