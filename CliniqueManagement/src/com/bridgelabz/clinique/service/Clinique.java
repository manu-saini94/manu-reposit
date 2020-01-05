package com.bridgelabz.clinique.service;

import java.io.File;
import java.io.IOException;

import org.json.JSONException;
import org.json.simple.parser.ParseException;

public interface Clinique {
public void addDoctors(File f) throws IOException, JSONException;
public void addPatients(File f) throws IOException, JSONException;
public void bookAppointment();
public void searchDoctor(String data,File f) throws JSONException, IOException, ParseException;
public void searchPatient(String data,File f) throws JSONException, IOException, ParseException;
public void createFile(String file) throws IOException;

}
