package com.BaseClass;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class BaseClass {
	RequestSpecification reqSpec;
	Response response;

	public void addHeader(String key, String value) {
		reqSpec = RestAssured.given().header(key, value);
	}

	public void queryParam(String key, String value) {
		reqSpec = reqSpec.queryParam(key, value);
	}

	public void pethParam(String key, String value) {
		reqSpec = reqSpec.pathParam(key, value);
	}

	public void basicAuth(String userName, String password) {
		reqSpec = reqSpec.auth().preemptive().basic(userName, password);
	}

	public void addBody(String body) {
		reqSpec = reqSpec.body(body);
	}

	public Response requestType(String reqType, String endPoint) {

		switch (reqType) {
		case "GET":
			response = reqSpec.get(endPoint);
			break;
		case "POST":
			response = reqSpec.post(endPoint);
			break;
		case "PUT":
			response = reqSpec.put(endPoint);
			break;
		case "DELETE":
			response = reqSpec.delete(endPoint);
			break;

		default:
			break;
		}

		return response;
	}

	public int getStatusCode(Response response) {
		int statusCode = response.getStatusCode();
		return statusCode;
	}

	public ResponseBody getBody(Response response) {
		ResponseBody body = response.getBody();
		return body;
	}

	public String getBodyAsString(Response response) {
		String asString = getBody(response).asString();
		return asString;
	}

	public String getBodyAsPrettyString(Response response) {
		String jsonFormat = getBody(response).asPrettyString();
		return jsonFormat;

	}

}
