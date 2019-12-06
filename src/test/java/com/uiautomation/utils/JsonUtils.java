package com.uiautomation.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.wechatify.models.MessageDetails;

import jline.internal.Log;

public class JsonUtils {

	static BufferedReader br;
	static Gson gson;
	static String messageName;
	static String remarkCount1;
	static String remarkCount2;
	static String scheduleTime;
	static MessageDetails msgDetails;

	public static MessageDetails readDataFromJSON(String filePath) {
		Gson gson = new Gson();
		try {
			msgDetails = gson.fromJson(new JsonReader(new java.io.FileReader(filePath)), MessageDetails.class);
		} catch (JsonIOException | JsonSyntaxException | FileNotFoundException e1) {
			Log.info("Exception occured while reading json file: " + filePath);
			e1.printStackTrace();
		}
		return msgDetails;
	}

	public static void writeDataToJson(MessageDetails messageDetails, String filePath) {

		Gson gson = new Gson();
		String json = gson.toJson(messageDetails);

		try {
			FileWriter writer = new FileWriter(filePath);
			writer.write(json);
			writer.close();

		} catch (IOException e) {
			Log.info("Exception occured while writing json file: " + filePath);
			e.printStackTrace();
		}
		System.out.println(json);
	}
}
