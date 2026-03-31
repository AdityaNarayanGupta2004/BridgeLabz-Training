package com.Aditya.JSON;

import org.json.JSONObject;

public class MergeTwoJSONObject {
	public static void main(String[] args) {
		JSONObject json1 = new JSONObject();
        json1.put("name", "Alice");
        json1.put("age", 25);

        JSONObject json2 = new JSONObject();
        json2.put("city", "New York");
        json2.put("age", 30);

        for (String key : json2.keySet()) {
            json1.put(key, json2.get(key)); 
        }

        System.out.println(json1.toString());
	}
}
