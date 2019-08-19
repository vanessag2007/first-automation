import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import static java.lang.System.*;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        setProperty("webdriver.chrome.driver", "/Users/casita/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("9970 North Central Park Boulevard, Boca Raton, FL, USA");
        Thread.sleep(1000);

        WebElement autocompleteResults = driver.findElement(By.className("pac_item"));
        autocompleteResults.click();

        driver.quit();
    }
}
