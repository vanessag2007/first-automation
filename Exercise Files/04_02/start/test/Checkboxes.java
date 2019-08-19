import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class Checkboxes {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/casita/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://formy-project.herokuapp.com/checkbox");

        WebElement checkBox1 = driver.findElement(By.id("checkbox-1"));
        checkBox1.click();

        WebElement checkBox2 = driver.findElement(By.id("checkbox-2"));
        checkBox2.click();

        WebElement checkBox3 = driver.findElement(By.id("checkbox-3"));
        checkBox3.click();

        driver.quit();

    }
}
