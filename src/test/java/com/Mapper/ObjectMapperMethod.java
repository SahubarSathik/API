package com.Mapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.Pojo.Datum;
import com.Pojo.PojoClass1;
import com.Pojo.Support;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapperMethod {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {

		// 1.Create Object for Object Mapper Class
		ObjectMapper mapper = new ObjectMapper();

		// 2/Mention the path of the file
		File file = new File("C:\\Users\\Sathik\\eclipse-workspace\\API\\src\\test\\resources\\task2.json");

		// 3.Pass the json file to fetch the values
		PojoClass1 c1 = mapper.readValue(file, PojoClass1.class);
		System.out.println(c1.getPage());
		System.out.println(c1.getPer_page());
		System.out.println(c1.getTotal());
		System.out.println(c1.getTotal_pages());
		ArrayList<Datum> data = c1.getData();
		for (Datum datum : data) {
			System.out.println(datum.getId());
			System.out.println(datum.getEmail());
			System.out.println(datum.getFirst_name());
			System.out.println(datum.getLast_name());
			System.out.println(datum.getAvatar());
		}
		Support support = c1.getSupport();
		System.out.println(support.getUrl());
		System.out.println(support.getText());
	}

}
