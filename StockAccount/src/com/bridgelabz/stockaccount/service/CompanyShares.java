package com.bridgelabz.stockaccount.service;

public class CompanyShares {
private String symbol;
private int num;
private int price;
public String getSymbol() {
	return symbol;
}
public void setSymbol(String symbol) {
	this.symbol = symbol;
}
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String toString()
{	
	return symbol+" "+num+" "+price;	
}
}
