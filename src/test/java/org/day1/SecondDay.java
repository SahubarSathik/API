package org.day1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class SecondDay {
	public static void main(String[] args) throws IOException, ParseException {

		FileReader fileReader = new FileReader
				("C:\\Users\\Sathik\\eclipse-workspace\\API\\src\\test\\resources\\task2.json");
		
		JSONParser jsonParser = new JSONParser();
		
		Object parse = jsonParser.parse(fileReader);
		JSONObject jsonObject =(JSONObject)parse;
		Object object = jsonObject.get("data");
		
		JSONArray jsonArray = (JSONArray) object;
		for (int i = 0; i < jsonArray.size(); i++) {
			
			Object obj1 = jsonArray.get(i);
			JSONObject jsonObject2 = (JSONObject) obj1;
			Object object1 = jsonObject2.get("id");
			Object object2 = jsonObject2.get("email");
			Object object3 = jsonObject2.get("first_name");
			Object object4 = jsonObject2.get("last_name");
			Object object5 = jsonObject2.get("avatar");
			System.out.println(object1+"\n"+object2+"\n"+object3+"\n"+object4+"\n"+object5);
		}
		Object object2 = jsonObject.get("support");
	    JSONObject jsonObject2 = (JSONObject)object2;
	    System.out.println(jsonObject2.get("url"));
	    System.out.println(jsonObject2.get("text"));
	    
	    
	    
	    
	    
	    
		
		
		
	}
}
