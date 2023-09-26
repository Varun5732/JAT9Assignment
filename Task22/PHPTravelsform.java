package com.util;

import java.time.Duration;
import java.util.Random;

import javax.script.ScriptException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PHPTravelsform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
		driver.manage().window().maximize();
		// fill up the form
		WebElement firstNameInput = driver.findElement(By.name("first_name"));
		firstNameInput.sendKeys("Varun");
		WebElement lastNameInput = driver.findElement(By.name("last_name"));
		lastNameInput.sendKeys("Suresh");
		WebElement businessNameInput = driver.findElement(By.name("business_name"));
		businessNameInput.sendKeys("ADIDAS");
		WebElement emailInput = driver.findElement(By.name("email"));
		emailInput.sendKeys("varunsuresh89@gmail.com");
		 
		String n1 = driver.findElement(By.xpath("//*[@id='numb1']")).getText();
		String n2 = driver.findElement(By.xpath("//span[@id='numb2']")).getText();
		
		int num1 = Integer.parseInt(n1);
		int num2 = Integer.parseInt(n2);
		int total = num1 + num2;
		
		WebElement result = driver.findElement(By.xpath("//input[@id='number']"));
		
		result.clear();
		
		result.sendKeys(String.valueOf(total));
		
		driver.findElement(By.xpath("//button[@id='demo']")).click();
		
		WebElement msg = driver.findElement(By.xpath("//strong[text()=Thank you!]"));
		
		String message = msg.getText();
		
		System.out.println(message);
		
		// Verify the form is submitted successfully
		if (message.contains("Thank you!")) {
			System.out.println("Form submitted successfully!");
		} else {
			 System.out.println("Form submission failed.");
		}
		//driver.quit();
	}
}

