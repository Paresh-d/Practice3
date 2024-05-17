package com.TestNG.Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgPractice {
	@BeforeSuite
	 public void beforeSuite(){
		System.out.println("Before Suite: Before everything") ;
		
	}
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("Before Method: before each test") ;
	}
	@BeforeTest
	public void beforeTest(){
		System.out.println("Before Test: Set Up") ;
	}
		@BeforeClass
		public void beforeClass(){
			System.out.println("Before Class: Before all classes");
		}
		@Test
		public void getLogin(){
			System.out.println("Login test Code will be here");
	}
		@Test
		public void getPayment(){
			System.out.println("Payment test code will be here");
	}
		@Test
		public void getProduct(){
			System.out.println("Product test code will be here");
		}
		@AfterClass
		public void afterClass(){
			System.out.println("After Class: after all classes");
		}
		@AfterSuite
		public void afterSuite(){
			System.out.println("After Suite: after everything");
		}
		@AfterTest
		public void tearDown(){
			System.out.println("After Test: close all connections") ;
	}
		@AfterMethod
			public void afterMethod(){
			System.out.println("After Method: after each test") ;
		}
	}

