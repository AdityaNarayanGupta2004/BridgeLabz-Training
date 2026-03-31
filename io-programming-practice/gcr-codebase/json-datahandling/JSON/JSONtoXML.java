package com.Aditya.JSON;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.json.JSONObject;
import org.json.XML;

public class JSONtoXML {
	public static void main(String[] args) throws IOException {
		 Path path = Path.of("data//jsondata.json");
		 String json = Files.readString(path);
		 JSONObject jsonObject = new JSONObject(json);
	     String xml = "<person>" + XML.toString(jsonObject) + "</person>";
	     System.out.println(xml);
	}

}
