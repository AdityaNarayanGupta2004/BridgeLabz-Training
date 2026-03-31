package com.Aditya.JSON;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONObject;

public class ReadingJsonFile {
	public static void main(String[] args) throws Exception{
		String content = new String(Files.readAllBytes(Paths.get("data\\student.json")));

        JSONObject jsonObject = new JSONObject(content);

        String name = jsonObject.getString("name");
        String email = jsonObject.getString("email");
        int age = jsonObject.getInt("age");

        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);
	}
}
