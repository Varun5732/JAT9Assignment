package tasks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleWebDriverScript {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create an instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Step 3: Perform actions with the WebDriver
        try {
            // Navigate to a website (In this example, we'll use Google)
            driver.get("https://www.google.com");

            // Find the search box element
            WebElement searchBox = driver.findElement(By.name("q"));

            // Type "Selenium WebDriver" into the search box
            searchBox.sendKeys("Selenium WebDriver");

            // Perform a search by submitting the form (In this case, we'll use the ENTER key)
            searchBox.submit();

            // Wait for the search results to load (optional)
            Thread.sleep(5000);

            // Capture and print the page title
            String pageTitle = driver.getTitle();
            System.out.println("Page Title: " + pageTitle);

            // Click on the first search result (for demonstration purposes)
            WebElement firstSearchResult = driver.findElement(By.cssSelector("div.g a"));
            firstSearchResult.click();

            // Wait for a few seconds to see the effect (optional)
            Thread.sleep(5000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Step 4: Clean up and close the browser
            driver.quit();
        }
    }
}
