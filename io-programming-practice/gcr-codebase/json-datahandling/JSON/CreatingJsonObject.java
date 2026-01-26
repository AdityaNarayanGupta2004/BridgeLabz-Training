package com.Aditya.JSON;

import org.json.JSONArray;

import org.json.JSONObject;

public class CreatingJsonObject {
	public static void main(String[] args) {
		JSONObject student = new JSONObject();
        student.put("name", "Alice");
        student.put("age", 25);
        JSONArray subjects = new JSONArray();
        subjects.put("JAVA");
        subjects.put("MAthematics");
        subjects.put("Chemistry");
        subjects.put("MAchine Learning");
        
        student.put("subjects", subjects);
        System.out.println(student.toString());

	}
}
