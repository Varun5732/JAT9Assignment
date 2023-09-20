package com.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuviLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.guvi.in/");

			WebElement loginButton = driver.findElement(By.linkText("Login"));
	        loginButton.click();

	        WebElement loginEmailInput = driver.findElement(By.id("login_email"));
	        loginEmailInput.sendKeys("varun_suresh@outlook.com");

	        WebElement loginPasswordInput = driver.findElement(By.id("login_password"));
	        loginPasswordInput.sendKeys("Melaniethawne@2");

	        // Submit the login form
	        WebElement loginSubmitButton = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
	        loginSubmitButton.click();
	        
	        WebElement userMenu = driver.findElement(By.id("user-menu")); // Locate the user menu element
	        if (userMenu.isDisplayed()) {
	            System.out.println("Login successful!");
	        } else {
	            System.out.println("Login failed!");
	        }
	}

}

