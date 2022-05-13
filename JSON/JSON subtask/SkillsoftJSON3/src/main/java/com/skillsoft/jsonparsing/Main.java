package com.skillsoft.jsonparsing;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;

public class Main {

	
@SuppressWarnings("unchecked")
public static void main(String[] args) {
		
		System.err.println("*************Creating JSONArray of JSONObject");
		
		JSONArray dinerList=new JSONArray();
		
		Diners diner1=new Diners("Sansa Stark",22,"Female",153.5f);
		Diners diner2=new Diners("Arya Stark",20,"Female",700.5f);
		
		dinerList.add(diner1);
		dinerList.add(diner2);
		
		System.out.println(dinerList);
		
		try(FileWriter file=new FileWriter("diners.json")){
			dinerList.writeJSONString(file);
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
}	