package controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;

import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class Client extends Controller{
	
	public Result show(long id)
	{
		return ok("client ID Requested :"+id);
	}
	
	public Result showPersonDetails()
	{
		Map<String,String> singlePerson = new HashMap<String,String>();
		
		singlePerson.put("name","Prasanth");
		singlePerson.put("Native","Kerala");
		singlePerson.put("work","Software Engineer");
		
		
		JsonNode json = Json.toJson(singlePerson);
		
		
		return ok(json);
	}

}
