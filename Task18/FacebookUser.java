package com.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookUser {
    public static void main(String[] args) {
       
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to the Facebook sign-up page
        driver.get("https://www.facebook.com/r.php");

        // Locate and interact with the sign-up elements
        WebElement firstName = driver.findElement(By.name("firstname"));
        WebElement lastName = driver.findElement(By.name("lastname"));
        WebElement mobileOrEmail = driver.findElement(By.name("reg_email__"));
        WebElement reenteremailInput = driver.findElement(By.name("reg_email_confirmation__"));
        WebElement password = driver.findElement(By.name("reg_passwd__"));
        WebElement birthMonthDropdown = driver.findElement(By.name("birthday_month"));
        WebElement birthDayInput = driver.findElement(By.name("birthday_day"));
        WebElement birthYearInput = driver.findElement(By.name("birthday_year"));
        WebElement genderRadio = driver.findElement(By.xpath("//input[@value='2']"));
        WebElement signUpButton = driver.findElement(By.name("websubmit"));

        // Fill in the sign-up form
        firstName.sendKeys("Mckensie");
        lastName.sendKeys("Shawn");
        mobileOrEmail.sendKeys("Mckenzie_Shaw@yahoo.com");
        reenteremailInput.sendKeys("Mckenzie_Shaw@yahoo.com");
        password.sendKeys("9150568978");
        birthMonthDropdown.sendKeys("May");
        birthDayInput.sendKeys("11");
        birthYearInput.sendKeys("1985"); 
        genderRadio.click();

        // Click the sign-up button
        signUpButton.click();

        // Close the WebDriver
        
    }
}
