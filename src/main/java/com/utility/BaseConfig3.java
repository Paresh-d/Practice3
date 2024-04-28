package com.utility;

import java.io.FileInputStream;

import java.util.Properties;

public class BaseConfig3 {

public String getConfig(String value) throws Exception{
	String filepath = "./Com.Property3";
	FileInputStream fis = new FileInputStream(filepath);
	Properties pro = new Properties();
	pro.load(fis);
	String  eachValue = pro.get(value).toString();
	System.out.println(eachValue);
		
	return eachValue;
}
public static void main(String[] args) throws Exception {
	BaseConfig3 obj = new BaseConfig3();
	obj.getConfig("URL");
}
}
