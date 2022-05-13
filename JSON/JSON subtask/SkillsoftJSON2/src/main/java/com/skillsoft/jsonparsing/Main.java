package com.skillsoft.jsonparsing;

import java.io.FileReader;


import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
//
//public class Main {
//
//	
//@SuppressWarnings("unchecked")
//public static void main(String[] args) {
//		
//		System.err.println("*************Creating JSONArray of JSONObject");
//		
//		JSONArray dinerList=new JSONArray();
//		
//		JSONObject diner1=new JSONObject();
//		diner1.put("name", "Jane Stark");
//		diner1.put("age", 22);
//		diner1.put("gender", "Female");
//		diner1.put("isAllergic", false);
//		diner1.put("amountSpent", 153.27);
//		
//		JSONObject diner2=new JSONObject();
//		diner2.put("name", "Jon Snow");
//		diner2.put("age", 25);
//		diner2.put("gender", "Male");
//		diner2.put("isAllergic", false);
//		diner2.put("amountSpent", 750.5);
//		
//		dinerList.add(diner1);
//		dinerList.add(diner2);
//		
//		System.out.println(dinerList);
//		
//		try(FileWriter file=new FileWriter("diners.json")){
//			dinerList.writeJSONString(file);
//		}catch(IOException e){
//			e.printStackTrace();
//		}
//		
//	}
//}


/*Reading ArrayList*/

//public class Main{
//
//	public static void main(String[] args) {
//		
//		System.out.println("**********Reading JSON");
//		
//		try(FileReader reader =new FileReader("diners.json")){
//			JSONArray dinerList=(JSONArray)JSONValue.parse(reader);
//			System.out.println(dinerList);
//			
//			for(Object object:dinerList) {
//				JSONObject diner=(JSONObject)object;
//				
//				System.out.println("\n*****Diner");
//				
//				String name=(String)diner.get("name");
//				System.out.println("\ndiner name: "+name);
//				
//				String gender=(String)diner.get("gender");
//				System.out.println("diner gender: "+gender);
//				
//				long age=(long)diner.get("age");
//				System.out.println("diner age:"+age);
//				
//				double amountSpent=(double)diner.get("amountSpent");
//				System.out.println("diner spending: "+amountSpent);
//				
//				Boolean isAllergic=(Boolean)diner.get("isAllergic");
//				System.out.println("diner isAllergic: "+isAllergic);
//				
//			}
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
//		System.out.println("************Completed reading");
//	}
//}

/*nested list*/

//public class Main {
//
//	
//@SuppressWarnings("unchecked")
//public static void main(String[] args) {
//		
//		System.err.println("*************Creating JSONArray of JSONObject");
//		JSONObject dinerListObject=new JSONObject();
//		
//		JSONArray dinerList=new JSONArray();
//		
//		JSONObject diner1=new JSONObject();
//		diner1.put("name", "Jane Stark");
//		diner1.put("age", 22);
//		diner1.put("gender", "Female");
//		diner1.put("isAllergic", false);
//		diner1.put("amountSpent", 153.27);
//		
//		JSONObject diner2=new JSONObject();
//		diner2.put("name", "Jon Snow");
//		diner2.put("age", 25);
//		diner2.put("amountSpent", 750.5);
//		
//		dinerList.add(diner1);
//		dinerList.add(diner2);
//		
//		dinerListObject.put("diners", dinerList);
//		
//		System.out.println(dinerListObject);
//		
//		try(FileWriter file=new FileWriter("diners.json")){
//			dinerListObject.writeJSONString(file);
//		}catch(IOException e){
//			e.printStackTrace();
//		}
//		
//	}
//}


//public class Main{
//	
//	public static void main(String[] args) {
//		
//		System.out.println("********Reading JSON");
//		
//		try(FileReader reader=new FileReader("diners.json")){
//			
//			JSONObject dinerListObject=(JSONObject)JSONValue.parse(reader);
//			System.out.println(dinerListObject);
//			
//			JSONArray dinerList=(JSONArray)dinerListObject.get("diners");
//			
//			for(Object object:dinerList) {
//				JSONObject diner=(JSONObject)object;
//				
//				System.out.println("\n*********Diner");
//				
//				for (Object field:diner.entrySet()) {
//					System.out.println(field);
//				}
//			}
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
//		System.out.println("******Completed reading JSON");
//	}
//}




/*Complex JSON*/
//
//public class Main{
//	
//	@SuppressWarnings("unchecked")
//	public static void main(String[]args) {
//		
//		System.out.println("******Creating JSONArray of JSONObject");
//		
//		JSONObject dinerListObject=new JSONObject();
//		
//		JSONArray dinerList=new JSONArray();
//		
//		JSONObject diner1=new JSONObject();
//		diner1.put("name", "Jane Stark");
//		diner1.put("age", 22);
//		diner1.put("gender", "Female");
//		diner1.put("isAllergic", false);
//		diner1.put("amountSpent", 153.27);
//		
//		JSONArray contactList =new JSONArray();
//		JSONObject contact1=new JSONObject();
//		
//		contact1.put("type", "home");
//		contact1.put("number", "212-321-221");
//		
//		JSONObject contact2 =new JSONObject();
//		
//		contact2.put("type", "mobile");
//		contact2.put("number", "646-555-4653");
//		
//		contactList.add(contact1);
//		contactList.add(contact2);
//		
//		diner1.put("contact", contactList);
//		
//		dinerList.add(diner1);
//		
//		dinerListObject.put("diners", dinerList);
//		
//		System.out.println(dinerListObject);
//		
//		try(FileWriter file =new FileWriter("diners.json")){
//			dinerListObject.writeJSONString(file);
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
//		System.out.println("********Writing out JSONArray of JSONObjects");
//	}
//}

/*Reading*/

//public class Main{
//	
//	public static void main(String[] args) {
//		
//		System.out.println("*******Reading JSON");
//		
//		try(FileReader reader=new FileReader("diners.json")){
//			
//			JSONObject dinerListObject=(JSONObject)JSONValue.parse(reader);
//			System.out.println(dinerListObject);
//			
//			JSONArray dinerList=(JSONArray)dinerListObject.get("diners");
//			
//			for(Object object:dinerList) {
//				JSONObject diner=(JSONObject)object;
//				
//				System.out.println("\n******Diner");
//				
//				for(Object keyObj: diner.keySet()) {
//					String key=(String)keyObj;
//					
//					if(key.equals("contact")) {
//						
//						JSONArray contactList = (JSONArray)diner.get(key);
//						
//						System.out.println("contacts: ");
//						for(Object contact: contactList) {
//						
//						JSONObject contactJSON = (JSONObject)contact;
//						
//						System.out.format("{**Number: %s,Type: %s**}\n",contactJSON.get("number"),contactJSON.get("type"));
//					}
//					
//				}
//			}
//		}
//	}catch(IOException e) {
//		e.printStackTrace();
//	}
//		System.out.println("complete reading");
//}
//}




/*parse*/


//public class Main{
//	
//	public static void main(String[] args) throws ParseException {
//		
//		System.out.println("*******Reading JSON");
//		
//		try(FileReader reader=new FileReader("diners.json")){
//			
//			JSONParser jsonParser=new JSONParser();
//			
//			JSONObject dinerListObject=(JSONObject)jsonParser.parse(reader);
//			System.out.println(dinerListObject);
//			
//			JSONArray dinerList=(JSONArray)dinerListObject.get("diners");
//			
//			for(Object object:dinerList) {
//				JSONObject diner=(JSONObject)object;
//				
//				System.out.println("\n******Diner");
//				
//				for(Object keyObj: diner.keySet()) {
//					String key=(String)keyObj;
//					
//					if(key.equals("contact")) {
//						
//						JSONArray contactList = (JSONArray)diner.get(key);
//						
//						System.out.println("contacts: ");
//						for(Object contact: contactList) {
//						
//						JSONObject contactJSON = (JSONObject)contact;
//						
//						System.out.format("{**Number: %s,Type: %s**}\n",contactJSON.get("number"),contactJSON.get("type"));
//					}
//					
//				}
//			}
//		}
//	}catch(IOException | ParseException e) {
//		e.printStackTrace();
//	}
//		System.out.println("complete reading");
//}
//}




/*SAX interface*/
//public class Main{
//	
//	public static void main(String[] args) {
//		System.out.println("**********reading very large Json file");
//		
//		JSONParser jsonParser=new JSONParser();
//		
//		try(FileReader reader =new FileReader("src/test/employees.json")){
//			Object obj =jsonParser.parse(reader);
//			
//			ParsingHandler parsingHandler=new ParsingHandler();
//			
//			JSONArray jsonObject =(JSONArray)obj;
//			System.out.println(jsonObject);
//			
//			jsonParser.parse(obj.toString(),parsingHandler,true);
//		}catch(IOException |ParseException e) {
//			e.printStackTrace();
//		}
//		System.out.println("***********Completed reading JSON");
//	}
//}


/*String Encoding*/


//public class Main{
//	
//	@SuppressWarnings("unchecked")
//	public static void main(String[] args) {
//		
//		System.out.println("*********Creating JSONObject");
//		
//		JSONObject movie=new JSONObject();
//		
//		movie.put("name", "Back to the Future");
//		movie.put("releaseYear", 1985);
//		movie.put("boxoffice", 388.8);
//		movie.put("director", "Robert Zemeckis");
//		
//		System.out.println(movie.toJSONString());
//		System.out.println(movie.toJSONString());
//		
//		System.out.println("**************String encoding of JSON object");
//	}
//}




//public class Main{
////	
//	@SuppressWarnings("unchecked")
//	public static void main(String[] args) throws IOException {
//		
//		System.out.println("*********Creating JSONObject");
//		
//		JSONObject movie=new JSONObject();
//		
//		movie.put("name", "Back to the Future");
//		movie.put("releaseYear", 1985);
//		movie.put("boxoffice", 388.8);
//		movie.put("director", "Robert Zemeckis");
//		
//		StringWriter out=new StringWriter();
//		movie.writeJSONString(out);
//		
//		System.out.println(out.toString());
//		
//		System.out.println("**************String encoding of JSON object");
//	}
//}




//public class Main{
//	
//	@SuppressWarnings("unchecked")
//	public static void main(String[] args) {
//		
//		System.out.println("*********Creating JSONObject");
//		
//		Map<String, Object>movie=new TreeMap();
//		
//		movie.put("name", "Back to the Future");
//		movie.put("releaseYear", 1985);
//		movie.put("boxoffice", 388.8);
//		movie.put("director", "Robert Zemeckis");
//		
//		System.out.println(JSONValue.toJSONString(movie));
//		
//		System.out.println("**************String encoding of JSON object");
//	}
//}



//public class Main{
//	
//	@SuppressWarnings("unchecked")
//	public static void main(String[] args) throws IOException {
//		System.out.println("*******Creating JSON Object");
//		
//		Map<String,Object>movie=new TreeMap(new Comparator<String>() {
//			@Override
//			public int compare(String o1,String o2) {
//				return o1.compareTo(o2)*-1;
//			}
//		});
//		
//		movie.put("name", "Back to the Future");
//		movie.put("releaseYear", 1985);
//		movie.put("boxoffice", 388.8);
//		movie.put("director", "Robert Zemeckis");
//		
//		StringWriter out=new StringWriter();
//		JSONValue.writeJSONString(movie,out);
//		
//		System.out.println(out.toString());
//		
//		System.out.println("**************String encoding of JSON object");
//	}
//}
