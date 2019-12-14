package com.bridgelabs.inventory.Dao;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONException;
import org.json.simple.parser.ParseException;

public interface MyInventory {

	public void addItems(File f) throws IOException, Exception;
	
	public void printItems(File f) throws IOException,ParseException,JSONException;
	
	public void createFile(String file) throws IOException;
}
