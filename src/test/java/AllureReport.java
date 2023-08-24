import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AllureReport {
    @Test
    public void testcase(){
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\VISHU\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        options.addArguments("--remote-allow-origin=*");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\VISHU\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");


    }
}
