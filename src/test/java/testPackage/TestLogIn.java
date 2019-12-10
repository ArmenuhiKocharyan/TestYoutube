package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.*;


public class TestLogIn extends WebDriverSettings {

    @Test
    public void getURL() throws InterruptedException {

        driver.findElement(By.cssSelector("paper-button#button.style-scope.ytd-button-renderer.style-suggestive.size-small")).click();

        //Write your email.
        driver.findElement(By.id("identifierId")).sendKeys("your email");

        driver.findElementByCssSelector("span.RveJvd.snByac").click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("span.RveJvd.snByac")));

        //Write your password.
        driver.findElementByCssSelector("input.whsOnd.zHQkBf").sendKeys("your password");

        driver.findElementByCssSelector("span.RveJvd.snByac").click();
    }
}
