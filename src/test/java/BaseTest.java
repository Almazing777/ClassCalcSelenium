import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public WebDriver driver;
    public static WebDriverWait wait;
    public static WebElement iFrame;


    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://classcalc.com/scientific-calculator");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 4);
        iFrame = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(iFrame);
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }




}
