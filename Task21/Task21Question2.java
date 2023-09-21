package com.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task21Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='Click Here']")).click();
		String originalWindowHandle = driver.getWindowHandle();
		for (String windowHandle : driver.getWindowHandles()) {
		    if (!windowHandle.equals(originalWindowHandle)) {
		        // Switch to the new window
		        driver.switchTo().window(windowHandle);
		        break;		        
		    }
		}
		// Verify the text "New Window" in the new window
		String expectedText = "New Window";
		String actualText = driver.findElement(By.tagName("h3")).getText();
		if (actualText.equals(expectedText)) {
		    System.out.println("Text verification in the new window successful.");
		} else {
		    System.out.println("Text verification in the new window failed.");
		}
		// Close the new window
		driver.close();
		// Switch back to the original window
		driver.switchTo().window(originalWindowHandle);
		//Close the active window
		driver.close();
		
		
		
		
	}

}

