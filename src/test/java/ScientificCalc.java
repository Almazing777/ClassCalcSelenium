import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

    public class ScientificCalc extends BaseTest {

        WebElement calculatorButtons;

        @Test
        public void clickAllNumbers(){

            //Will optimize with forloop at some point
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

            WebElement numbers = driver.findElement(By.cssSelector("[class='guppy-render']"));
            Assert.assertEquals(true, numbers.isDisplayed());
        }

        @Test
        public void clickPlus(){
            driver.findElement(By.cssSelector("[id='button-add']")).click();
            assertDisplayed();
        }

        @Test
        public void clickMinus(){
            driver.findElement(By.cssSelector("[id='button-subtract']")).click();
            assertDisplayed();
        }

        @Test
        public void clickDivision(){
            driver.findElement(By.cssSelector("[id='button-divide']")).click();
            assertDisplayed();
        }

        @Test
        public void clickMultiply(){
            driver.findElement(By.cssSelector("[id='button-multiply']")).click();
            assertDisplayed();
        }

        @Test
        public void clickExponent(){
            driver.findElement(By.cssSelector("[id='button-exponent']")).click();
            assertDisplayed();
        }

        @Test
        public void clickComma(){
            driver.findElement(By.cssSelector("[id='button-comma']")).click();
            assertDisplayed();
        }

        @Test
        public void clickIntegral(){
            driver.findElement(By.cssSelector("[id='button-integral']")).click();
            assertDisplayed();
        }

        @Test
        public void clickDegRad(){
            driver.findElement(By.cssSelector("[id='__classcalc-main-settings-checkbox']")).click();
            driver.findElement(By.cssSelector("[class='sc-jlyJG gIsTba']")).click();
            assertDisplayed();
        }

        @Test
        public void assertDisplayed(){
            calculatorButtons = driver.findElement(By.cssSelector("[class='editable-math guppy_active ']"));
            Assert.assertTrue( calculatorButtons.isDisplayed());
        }



    }
        
