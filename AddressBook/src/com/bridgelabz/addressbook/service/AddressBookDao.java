package com.bridgelabz.addressbook.service;

import java.io.IOException;

import org.json.JSONException;
import org.json.simple.parser.ParseException;

public interface AddressBookDao {
public void addRecord() throws IOException, Exception;
public void deleteRecord(String fname) throws IOException,ParseException,JSONException;
public void updateRecord(String fname)throws IOException,ParseException,JSONException;
public void printRecord() throws IOException,ParseException,JSONException;
public boolean checkRecord(String fname) throws Exception;
public boolean match(String fname);
public void sorting() throws IOException,ParseException,JSONException;
}
