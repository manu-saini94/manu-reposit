package com.bridgelabz.clinique.service;

import java.io.File;
import java.io.IOException;

import org.json.JSONException;
import org.json.simple.parser.ParseException;

public interface Clinique {
public void addDoctors(File f) throws IOException, JSONException;
public void addPatients(File f) throws IOException, JSONException;
public boolean bookAppointment(String s3,String s4,File f1,File f2) throws IOException, JSONException, ParseException;
public boolean searchDoctor(String data,File f) throws JSONException, IOException, ParseException;
public boolean searchPatient(String data,File f) throws JSONException, IOException, ParseException;
public void createFile(String file) throws IOException;

}
