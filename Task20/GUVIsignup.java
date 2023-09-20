package com.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GUVIsignup {

    public static void main(String[] args) {
    
        WebDriver driver = new ChromeDriver();

        // Navigate to the Guvi website
        driver.get("https://www.guvi.in/");

        // Click on the "Sign Up" button
        WebElement SignUpButton = driver.findElement(By.linkText("Sign up"));
        SignUpButton.click();

        // Fill in the sign-up form
        WebElement firstNameInput = driver.findElement(By.id("firstName"));
        firstNameInput.sendKeys("Varun");

        WebElement lastNameInput = driver.findElement(By.id("lastName"));
        lastNameInput.sendKeys("Sureshbabu");

        WebElement emailInput = driver.findElement(By.id("emailInput"));
        emailInput.sendKeys("varun_suresh@outlook.com");

        WebElement passwordInput = driver.findElement(By.id("passwordInput"));
        passwordInput.sendKeys("Melaniethawne@2");

        WebElement mobilenumberInput = driver.findElement(By.id("mobileNumberInput"));
        mobilenumberInput.sendKeys("8754468978");

        // Submit the sign-up form
        WebElement signUpSubmitButton = driver.findElement(By.xpath("//button[@id='signup']"));
        signUpSubmitButton.click();


        //let's login using the credentials
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
