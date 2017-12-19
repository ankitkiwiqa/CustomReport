package com.testReport;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;

public class jsonPath {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("build/source1.json");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String json1 = br.readLine();
		String json = "";
		
		//System.out.println("out :"+json1);
		while (json1!=null) {
			json = json + json1;
			json1 = br.readLine();
			//System.out.println("in "+json);
		}
		System.out.println(json);
		Object document = Configuration.defaultConfiguration().jsonProvider().parse(json);

		List<String> authors = JsonPath.read(json, "$[0]..*");
		
		//String author0 = JsonPath.read(document, "$..*");
		
		System.out.println("Found :"+authors);
		//String author1 = JsonPath.read(document, "$.store.book[1].author");
	}

}
