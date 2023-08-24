import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\VISHU\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2019/11/double-click.html");
        Actions actions = new Actions(driver);
        WebElement btn = driver.findElement(By.xpath("//button[text()='Double-Click me to see Alert message']"));
        actions.doubleClick(btn).perform();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].ScrollIntoView();",btn);
        Thread.sleep(3000);
        Alert alert=driver.switchTo().alert();
        alert.accept();
        Thread .sleep(3000);
        driver.close();

    }
}
