package com.skillsoft.jsonparsing;

import java.io.IOException;
import java.io.Serializable;
import java.io.Writer;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONAware;
import org.json.simple.JSONStreamAware;
import org.json.simple.JSONValue;

//public class Diners implements JSONAware{
//
//	private String name;
//	private int age;
//	private String gender;
//	private float amountSpent;
//	
//	public Diners(String name,int age,String gender,float amountSpent) {
//		this.name=name;
//		this.age=age;
//		this.gender=gender;
//		this.amountSpent=amountSpent;
//		
//	}
//	
//	@Override
//	public String toJSONString() {
//		
//		return String.format("{\"name\":\"%s\",\"age\":%d,\"gender\":\"%s\",\"amountSpent\": %f}", name,age,gender,amountSpent);
//	}
//
//	
//}





public class Diners implements JSONStreamAware{

	private String name;
	private int age;
	private String gender;
	private float amountSpent;
	
	public Diners(String name,int age,String gender,float amountSpent) {
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.amountSpent=amountSpent;
		
	}
	
		public void writeJSONString(Writer writer)throws IOException {
		Map<String,Serializable>map=new LinkedHashMap<String,Serializable>();
		
		map.put("name",name);
		map.put("age",age);
		map.put("gender",gender);
		map.put("amountSpent",amountSpent);
		
		JSONValue.writeJSONString(map, writer);
	}

}



