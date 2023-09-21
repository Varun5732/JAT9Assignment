package com.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task21Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			WebDriver driver = new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com/iframe");
			driver.manage().window().maximize();
			driver.switchTo().frame(0);
			driver.findElement(By.tagName("p")).clear();
			driver.findElement(By.tagName("p")).sendKeys("Hello People");
			driver.switchTo().defaultContent();
			driver.close();	
	}
}
