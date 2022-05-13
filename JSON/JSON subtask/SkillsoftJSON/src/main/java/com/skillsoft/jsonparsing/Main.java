package com.skillsoft.jsonparsing;

import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;


public class Main {

	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		System.out.println("****Creating JSONObject");
		
		JSONObject dinner=new JSONObject();
		
		dinner.put("name", "Jane Stark");
		dinner.put("age", 22);
		dinner.put("gender",null);
		dinner.put("isAllergic", false);
		dinner.put("amountSpent", 153.27);
		
		System.out.println(dinner.toJSONString());
		
		try(FileWriter file=new FileWriter("dinner.json")){
			dinner.writeJSONString(file);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("******Writing out JSONObject");
	}
}
