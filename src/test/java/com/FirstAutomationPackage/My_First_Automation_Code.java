package com.FirstAutomationPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class My_First_Automation_Code {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		driver.quit();
		
		
		WebDriver driver2 = new FirefoxDriver(); 
		driver2.manage().window().maximize();
		driver2.get("https://www.facebook.com");
		driver2.quit();
		
		WebDriver driver3 = new SafariDriver();
		driver3.manage().window().maximize();
		driver3.get("https://www.google.com");
		driver3.quit();

	}

}
