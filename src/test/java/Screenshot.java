import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.File;
import java.time.Duration;

public class Screenshot {
    @Test
    public void verifyTakeAScreenShot() {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\VISHU\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        options.addArguments("--remote-allow-origin=*");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\VISHU\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileHandler.copy(screenshot, new File("C:\\Users\\VISHU\\Pictures\\Screenshots.jpeg"));
        } catch (Exception e) {
            System.out.println(e);
        }
        driver.close();
    }
}
