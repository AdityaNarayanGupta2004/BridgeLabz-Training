package com.Aditya.JSON;

import java.nio.file.Files;
import java.nio.file.Path;

import org.json.JSONArray;
import org.json.JSONObject;

public class FilteringJSON {
    public static void main(String[] args) throws Exception {
    	String json = Files.readString(Path.of("data\\person.json"));

            JSONArray array = new JSONArray(json);

            for (int i = 0; i < array.length(); i++) {
                JSONObject obj = array.getJSONObject(i);
                if (obj.getInt("age") > 25) {
                    System.out.println(obj);
                }
            }
    }
}
