package org.day1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class FirstDay {
	public static void main(String[] args) throws IOException, ParseException {

		// Mention the path of the json file
		FileReader reader = new FileReader(
				"C:\\Users\\Sathik\\eclipse-workspace\\API\\src\\test\\resources\\task1.json");

		// Create Object for json parser
		JSONParser jsonParser = new JSONParser();

		// Pass the jason file to fetch the values from json
		Object obj = jsonParser.parse(reader);

		// convet to json object
		JSONObject j = (JSONObject) obj;

		Object object = j.get("data");

		JSONObject j1 = (JSONObject) object;
		Object objId = j1.get("id");
		System.out.println(objId);
		Object objEmail = j1.get("email");
		System.out.println(objEmail);
		System.out.println(j1.get("first_name"));
		System.out.println(j1.get("last_name"));
		System.out.println(j1.get("avatar"));
		
		
		Object object2 = j.get("support");
		JSONObject j2 = (JSONObject)object2;
		
		System.out.println(j2.get("url"));
		System.out.println(j2.get("text"));
		
		
		
		
		
		

	}

}
