package com.Aditya.JSON;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.json.JSONObject;

public class PrintJsonFileValue {
	public static void main(String[] args) throws IOException {
		String json = Files.readString(Path.of("data//example.json"));
        JSONObject obj = new JSONObject(json);

        for (String key : obj.keySet()) {
            System.out.println(key + " : " + obj.get(key));
        }
	}
}
