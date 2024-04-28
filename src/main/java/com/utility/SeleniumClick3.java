package com.utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SeleniumClick3 {

	public void getActionsclick(WebDriver driver, WebElement element ){
		Actions act = new Actions(driver);
		act.click(element).build().perform();
		
	}
	public void javaScriptClick(WebDriver driver, WebElement element){
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);	
	}
}

