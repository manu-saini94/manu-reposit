package com.bridgelabz.clinique.model;

import com.bridgelabz.clinique.service.Queue;

public class Doctor {
private String docName;
private String docId;
private String docSpec;
private String docAvail;
private Queue<String> docQueue;
private int docCount;
public String getDocName() {
	return docName;
}
public void setDocName(String docName) {
	this.docName = docName;
}
public String getDocId() {
	return docId;
}
public void setDocId(String docId) {
	this.docId = docId;
}
public String getDocSpec() {
	return docSpec;
}
public void setDocSpec(String docSpec) {
	this.docSpec = docSpec;
}
public String getDocAvail() {
	return docAvail;
}
public void setDocAvail(String docAvail) {
	this.docAvail = docAvail;
}
public Queue<String> getDocQueue() {
	return docQueue;
}
public void setDocQueue(Queue<String> docQueue) {
	this.docQueue = docQueue;
}
public int getDocCount() {
	return docCount;
}
public void setDocCount(int docCount) {
	this.docCount = docCount;
}




}
