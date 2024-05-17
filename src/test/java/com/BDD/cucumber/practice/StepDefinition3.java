package com.BDD.cucumber.practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Page.Object.Model.LoginPage3;
import com.utility.BaseConfig3;
import com.utility.SeleniumHighlighter3;
import com.utility.SeleniumWait3;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition3 {
	WebDriver driver;
	BaseConfig3 obj = new BaseConfig3();
	LoginPage3 pom = new LoginPage3();
	
	@Given("Open a browser")
public void open_a_browser() {
	driver = new ChromeDriver();
}
@Given("go to application Url")
public void go_to_application_Url() throws Exception {
	driver.get(obj.getConfig("URL"));
	//to maximize windows
	driver.manage().window().maximize();
	//to wait for page load to Gui
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	//to wait for HTML to load 
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@When("click signUp Btn")
public void click_signUp_Btn() {
	driver.findElement(pom.SignUp).click();
	//To highlight color we are calling SeleniumHighlighter
    }
@When("put a valid User")
public void put_a_valid_User() throws Exception {
	SeleniumHighlighter3.getColor(driver, driver.findElement(pom.User));
	//to find user name
	driver.findElement(pom.User).sendKeys(obj.getConfig("USER"));
    }
@When("put a valid Password")
public void put_a_valid_Password() throws Exception {
	///To highlight color we are calling SeleniumHighlighter
	SeleniumHighlighter3.getColor(driver, driver.findElement(pom.Password),"red");
	//to find Password
	driver.findElement(pom.Password).sendKeys(obj.getConfig("PASSWORD"));
    }
@When("click Login Btn")
public void click_Login_Btn() {
	SeleniumHighlighter3.getColor(driver, driver.findElement(pom.LoginBtn),"green");
	//to Click Login Button
	driver.findElement(pom.LoginBtn).click();
}
@When("click dropDown Btn")
public void click_dropDown_Btn() throws Exception {
	//to highlight the color for DropDown Button, call the SeleniumHighlighter class here
			Thread.sleep(30000);
			//To highlight color we are calling SeleniumHighlighter
			SeleniumHighlighter3.getColor(driver, driver.findElement(pom.DropDown),"purple");
			//to find drop down button should be visible for successful Login
			driver.findElement(pom.DropDown).click();
    }
@Then("Test will pass if logOut Btn found")
public void test_will_pass_if_logOut_Btn_found() throws Exception {
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
