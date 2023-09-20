package com.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DatePicker {
    public static void main(String[] args) {
      
      
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://jqueryui.com/datepicker/");

        driver.switchTo().frame(0); // You might need to adjust the frame index

        // Click on the input field to open the date picker
        WebElement dateInput = driver.findElement(By.id("datepicker"));
        dateInput.click();

        // Click the "Next" button to navigate to the next month
        WebElement nextButton = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
        nextButton.click();

        // Locate and click on the 22nd day of the month
        WebElement dateToSelect = driver.findElement(By.xpath("//a[text()='22']"));
        dateToSelect.click();

        // Optionally, you can retrieve the selected date to verify it
        String selectedDate = dateInput.getAttribute("value");
        System.out.println("Selected Date: " + selectedDate);

        // Close the WebDriver
        driver.quit();
    }
}
