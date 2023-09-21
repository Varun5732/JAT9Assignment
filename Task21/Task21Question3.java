package com.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Task21Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			driver.get("http://the-internet.herokuapp.com/nested_frames");
			// Find all frames on the page using XPath
			java.util.List<WebElement> frames = driver.findElements(By.xpath("//frame"));

			if (frames.size() == 2) {
			    System.out.println("There are three frames on the page.");
			} else {
			    System.out.println("There are not three frames on the page.");
			}
			driver.switchTo().frame("frame-top");	
			driver.switchTo().frame("frame-left");
			// Verify the text in the left frame
			String expectedTextLeft = "LEFT";
			WebElement leftFrameElement = driver.findElement(By.tagName("body"));
			String actualTextLeft = leftFrameElement.getText();
			if (actualTextLeft.contains(expectedTextLeft)) {
			    System.out.println("Text 'left' is present in the left frame.");
			} else {
			    System.out.println("Text 'left' is not present in the left frame.");
			}
			// Switch back to the default content (top frame)
			driver.switchTo().defaultContent();
			// Switch to the middle frame by name
			driver.switchTo().frame("frame-middle");
			String expectedTextMiddle = "MIDDLE";
	        WebElement middleFrameElement = driver.findElement(By.tagName("body"));
	        String actualTextMiddle = middleFrameElement.getText();

			if (actualTextMiddle.contains(expectedTextMiddle)) {
			    System.out.println("Text 'middle' is present in the middle frame.");
			} else {
			    System.out.println("Text 'middle' is not present in the middle frame.");
			}
			driver.switchTo().defaultContent();
			driver.switchTo().frame("frame-right");
			String expectedTextRight = "RIGHT";
	        WebElement rightFrameElement = driver.findElement(By.tagName("body"));
	        String actualTextRight = rightFrameElement.getText();

			if (actualTextRight.contains(expectedTextRight)) {
			    System.out.println("Text 'right' is present in the middle frame.");
			} else {
			    System.out.println("Text 'right' is not present in the middle frame.");
			}
			driver.switchTo().defaultContent();
			driver.switchTo().frame("frame-bottom");
			String expectedTextBottom = "BOTTOM";
	        WebElement bottomFrameElement = driver.findElement(By.tagName("body"));
	        String actualTextBottom = bottomFrameElement.getText();

			if (actualTextBottom.contains(expectedTextBottom)) {
			    System.out.println("Text 'bottom' is present in the middle frame.");
			} else {
			    System.out.println("Text 'bottom' is not present in the middle frame.");
			}	
			driver.close();
	}		
	
}
