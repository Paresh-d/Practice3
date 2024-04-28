package com.generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Page.Object.Model.LoginPage3;
import com.utility.BaseConfig3;
import com.utility.SeleniumHighlighter3;
import com.utility.SeleniumWait3;

public class LoginFunction3 {
		
		public void getLogin() throws Exception{
		
		//open browse
		WebDriver driver = new ChromeDriver();
		//go the application
		BaseConfig3 obj = new BaseConfig3();
				
		driver.get(obj.getConfig("URL"));
		//to maximize windows
		driver.manage().window().maximize();
		//to wait for page load to Gui
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		//to wait for HTML to load 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//to highlight the color for USER, call the SeleniumHighlighter class here
		LoginPage3 pom = new LoginPage3();
				
		//To click on Sign up/login button on the home page
		driver.findElement(pom.SignUp).click();
		//To highlight color we are calling SeleniumHighlighter
		SeleniumHighlighter3.getColor(driver, driver.findElement(pom.User));
		//to find user name
		driver.findElement(pom.User).sendKeys(obj.getConfig("USER"));
		
		///To highlight color we are calling SeleniumHighlighter
		SeleniumHighlighter3.getColor(driver, driver.findElement(pom.Password),"red");
		//to find Password
		driver.findElement(pom.Password).sendKeys(obj.getConfig("PASSWORD"));
		//to highlight the color for Login Button, call the SeleniumHighlighter class here
		//To highlight color we are calling SeleniumHighlighter
		SeleniumHighlighter3.getColor(driver, driver.findElement(pom.LoginBtn),"green");
		
		//to Click Login Button
		driver.findElement(pom.LoginBtn).click();
		//to highlight the color for DropDown Button, call the SeleniumHighlighter class here
		Thread.sleep(30000);
		//To highlight color we are calling SeleniumHighlighter
		SeleniumHighlighter3.getColor(driver, driver.findElement(pom.DropDown),"purple");
		
		//to find drop down button should be visible for successful Login
		driver.findElement(pom.DropDown).click();
		//to wait for logOut button visible-Here we comment out logout as it doesn't work
		//driver.findElement(By.xpath("//*[@class='fa fa-lock']")).click();
		
		//To highlight color we are calling SeleniumHighlighter
		SeleniumHighlighter3.getColor(driver, driver.findElement(pom.LogOutBtn),"yellow");
		
		//to wait for LogOut button visible
		WebElement logOut = driver.findElement(pom.LogOutBtn);
				//driver.findElement(By.xpath("(//*[@role=class="fa fa-lock'menuitem'])[4]")).click();
		//Calling Explicit Wait/Use WebDriverWait to wait logOut button is visible: (i.s.o thread.sleep)
		SeleniumWait3.getExplicitWait(driver, logOut);
		//to check LogOut button visible or not
		boolean logOutFound = logOut.isDisplayed();
		//to close the Browser
		Thread.sleep(30000);
          //driver.close();
		

		}

		

		
	
}
