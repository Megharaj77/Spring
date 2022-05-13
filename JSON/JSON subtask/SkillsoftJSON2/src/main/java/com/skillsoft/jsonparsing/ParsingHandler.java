package com.skillsoft.jsonparsing;

import java.io.IOException;
import org.json.simple.parser.ParseException;

import org.json.simple.parser.ContentHandler;

public class ParsingHandler implements ContentHandler{
	
	@Override
	public void startJSON() throws ParseException,IOException{
		
		System.out.println("start");
	}

	@Override 
	public void endJSON() throws ParseException,IOException{
		System.out.println("End");
	}
	
	@Override
	public boolean startObject() throws ParseException, IOException{
		System.out.println("start object");
		return true;
	}
	
	@Override
	public boolean endObject() throws ParseException, IOException{
		System.out.println("end object");
		return true;
	}
	
	@Override
	public boolean startObjectEntry(String s) throws ParseException, IOException{
		System.out.println("start object entry: "+s);
		return true;
	}
	
	@Override
	public boolean endObjectEntry() throws ParseException, IOException{
		System.out.println("end object entry: ");
		return true;
}
	
	@Override
	public boolean startArray() throws ParseException, IOException{
		System.out.println("start array");
		return true;
}
	@Override
	public boolean endArray() throws ParseException, IOException{
		System.out.println("end array");
		return true;
}
	
	@Override
	public boolean primitive(Object o) throws ParseException, IOException{
		System.out.println("-----"+o+"-------");
		return true;
}
}
