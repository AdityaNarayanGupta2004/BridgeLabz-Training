package com.Aditya.JSON;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class CSVtoJSON {
	public static void main(String[] args) throws IOException {
		Path path = Path.of("data//csvdata.csv");
        List<String> lines = Files.readAllLines(path);
        String[] headers = lines.get(0).split(",");

        JSONArray jsonArray = new JSONArray();

        for (int i = 1; i < lines.size(); i++) {
            String[] values = lines.get(i).split(",");
            JSONObject obj = new JSONObject();
            for (int j = 0; j < headers.length; j++) {
                obj.put(headers[j], values[j]);
            }
            jsonArray.put(obj);
        }
        System.out.println(jsonArray.toString(2));
	}
}
