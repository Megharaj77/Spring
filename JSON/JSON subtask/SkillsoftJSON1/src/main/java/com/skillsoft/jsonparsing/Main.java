package com.skillsoft.jsonparsing;

import org.json.simple.JSONObject;

import org.json.simple.JSONValue;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Main {

	
//	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
//		
//		System.out.println("****Creating JSONObject");
//		
//		JSONObject diner=new JSONObject();
//		
//		diner.put("name", "Jane Stark");
//		diner.put("age", 22);
//		diner.put("gender",null);
//		diner.put("isAllergic", false);
//		diner.put("amountSpent", 153.27);
//		
//		System.out.println(diner.toJSONString());
//		try(FileWriter file=new FileWriter("diner.json")){
//			diner.writeJSONString(file);
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println("******Writing out JSONObject");
		
		
/*reading data*/
		
		System.out.println("****************Reading JSON");
		
		try(FileReader reader=new FileReader("diner.json")){
			
			JSONObject dinerData=(JSONObject)JSONValue.parse(reader);
			System.out.println(dinerData);
			
			String name=(String)dinerData.get("name");
			System.out.println("\ndiner name: "+name);
			
			String gender=(String)dinerData.get("gender");
			System.out.println("diner gender");
			
			long age=(long)dinerData.get("age");
			System.out.println("diner age: "+age);
			
			double amountSpent=(double)dinerData.get("amountSpent");
			System.out.println("diner spending: "+amountSpent);
			
			Boolean isAllergic=(Boolean)dinerData.get("isAllergic");
			System.out.println("diner isAllergic: "+isAllergic);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		}
	}

