import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.List;

    public class ScientificCalc extends BaseTest {

        @Test
        public void scientificCalc() throws InterruptedException {

            driver.get("https://classcalc.com/scientific-calculator");

            Actions action = new Actions(driver);

            action.sendKeys(Keys.NUMPAD0).build().perform();
            action.sendKeys(Keys.NUMPAD1).build().perform();
            action.sendKeys(Keys.NUMPAD2).build().perform();
            action.sendKeys(Keys.NUMPAD3).build().perform();
            action.sendKeys(Keys.NUMPAD4).build().perform();
            action.sendKeys(Keys.NUMPAD5).build().perform();
            action.sendKeys(Keys.NUMPAD6).build().perform();
            action.sendKeys(Keys.NUMPAD7).build().perform();
            action.sendKeys(Keys.NUMPAD8).build().perform();
            action.sendKeys(Keys.NUMPAD9).build().perform();
        }
    }
        
