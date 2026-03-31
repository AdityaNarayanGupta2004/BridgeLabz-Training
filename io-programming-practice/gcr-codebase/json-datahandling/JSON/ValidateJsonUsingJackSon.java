package com.Aditya.JSON;

import java.io.IOException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ValidateJsonUsingJackSon {
	public static void main(String[] args)  throws IOException{
		 String jsonString = "{ \"name\": \"Alice\", \"age\": 25 }";
	     String invalidJson = "{ \"name\": \"Alice\", \"age\": 25 "; // missing closing }

	     ObjectMapper mapper = new ObjectMapper();

	     System.out.println("Validating jsonString:");
	     validateJson(jsonString, mapper);

	     System.out.println("\nValidating invalidJson:");
	     validateJson(invalidJson, mapper);
	    }
	    public static void validateJson(String json, ObjectMapper mapper) {
	        try {
	            JsonNode node = mapper.readTree(json);
	            System.out.println("Valid JSON: " + node.toString());
	        } catch (Exception e) {
	            System.out.println("Invalid JSON: " + e.getMessage());
	        }
	}
}
	    
