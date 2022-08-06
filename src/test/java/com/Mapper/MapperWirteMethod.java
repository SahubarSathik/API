package com.Mapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.Pojo.Details;
import com.Pojo.Student1;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MapperWirteMethod {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {

		File file = new File("C:\\Users\\Sathik\\eclipse-workspace\\API\\src\\test\\resources\\mapperTask.json");
		ObjectMapper mapper = new ObjectMapper();
		Details d1 = new Details("santhose", "kathir", "criket", 569565566998l, false);
		Details d2= new Details("vishnu", "barath", "football", 9987666669l, false);
		Details d3 = new Details("mala", "vinoth", "carom", 9898989898l, true);
		Details d4 = new Details("sanjay", "veda", "vollyball", 89646659846l, false);
		Details d5 = new Details("kumar", "malai", "criket", 8976544236l, true);
		List<Details> li = new ArrayList<Details>();
		li.add(d1);
		li.add(d2);
		li.add(d3);
		li.add(d4);
		li.add(d5);
		
		Student1 s1 = new Student1("mechanical", 3, 'B', "HariKrishnan", li);
		mapper.writeValue(file, s1);

	}

}
