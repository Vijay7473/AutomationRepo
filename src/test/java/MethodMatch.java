import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class MethodMatch {

    WebDriver driver;
    @BeforeMethod
    public void beforetestcase(){
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\VISHU\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        options.addArguments("--remote-allow-origin=*");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\VISHU\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
         driver = new ChromeDriver();

    }
    @Test
    public void testcase1(){
        System.out.println("testcase 1");
        driver.get("http//www.google.com");
    }
    @Test
    public void testcase2(){
        System.out.println("testcae @");
        driver.get("http//www.yahoo.com");
    }
    @Test
    public void testcase3(){
        System.out.println("testcase 3");
        driver.get("http//www.facebook.com");
    }
    @AfterMethod
    public void aftertestcase(){
        System.out.println("after method anootations runs after successful execucation of test method");
        driver.close();
}
}
