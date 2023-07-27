import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SELENIUMBROWSERDRIVERSCRIPT {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create an instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to Google
        driver.get("https://www.google.com");

        // Find the search box element and enter the search query
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium Browser driver");

        // Submit the search query
        searchBox.submit();

        // Wait for the search results to load (optional)
        // Here, we'll pause execution for 5 seconds, but you can use more robust waits.
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }
}
