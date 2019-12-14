package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestLogIn extends WebDriverSettings{

    @Parameters({ "mail", "password" })
    @Test
    public void getURL(String mail, String password) throws InterruptedException {

        Assert.assertTrue(driver.findElement(By.cssSelector("paper-button#button.style-scope.ytd-button-renderer.style-suggestive.size-small")).isEnabled());
        driver.findElement(By.cssSelector("paper-button#button.style-scope.ytd-button-renderer.style-suggestive.size-small")).click();

        Assert.assertTrue(driver.findElement(By.id("identifierId")).isDisplayed());
        driver.findElement(By.id("identifierId")).sendKeys(mail);

        Assert.assertTrue(driver.findElementByCssSelector("span.RveJvd.snByac").isDisplayed());
        driver.findElementByCssSelector("span.RveJvd.snByac").click();
        Thread.sleep(1000);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input.whsOnd.zHQkBf")));

        Assert.assertTrue(driver.findElementByCssSelector("input.whsOnd.zHQkBf").isDisplayed());
        driver.findElementByCssSelector("input.whsOnd.zHQkBf").sendKeys(password);

        Assert.assertTrue(driver.findElementByCssSelector("span.RveJvd.snByac").isDisplayed());
        driver.findElementByCssSelector("span.RveJvd.snByac").click();
    }
}