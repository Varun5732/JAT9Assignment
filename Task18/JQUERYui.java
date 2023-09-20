import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class JQUERYui {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        // Navigate to the jQuery UI Droppable demo page
        driver.get("https://jqueryui.com/droppable/");

     
        driver.switchTo().frame(0);

        // Locate the source element ("Drag me to my target")
        WebElement sourceElement = driver.findElement(By.id("draggable"));

        // Locate the target element ("Drop here")
        WebElement targetElement = driver.findElement(By.id("droppable"));
       
        Actions actions = new Actions(driver);
        actions.dragAndDrop(sourceElement, targetElement).build().perform();
        
        
        // Verifying that the drop operation was successful
        String targetText = targetElement.getText();
        if (targetText.equals("Dropped!")) {
            System.out.println("Drag-and-drop operation was successful!");
        } else {
            System.out.println("Drag-and-drop operation was not successful.");
        }

        // Close the browser
        driver.quit();
    }
}
