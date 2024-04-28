package com.Regression;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class TestRunWithTestngPayment3 {

	//@Factory
	//@BeforeSuite
	//@BeforeTest
	//@BeforeMethod
	//@AfterSuite
	//@AfterTest
	//@AfterClass
	//@DataProvider
	
	@Test(enabled = true, priority = 1, description = "Payment Function",groups = {"Functional"})
	public void getPayment() throws Exception {
		//LoginFunction3 obj =new LoginFunction3();
		//obj.getLogin();
}
}