package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.*;


public class TestLogIn extends WebDriverSettings {

    @Test
    public void getURL() throws InterruptedException {

        driver.findElementByXPath("//*/div[2]/div[2]/ytd-button-renderer/a/paper-button").click();

        //Write your email.
        driver.findElement(By.id("identifierId")).sendKeys("your email");

        driver.findElementByXPath("//*/div[2]/div/div[1]/div/span").click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*/div[1]/div/div[1]/input")));

        Thread.sleep(1000);

        //Write your password.
        driver.findElementByXPath("//*/div[1]/div/div[1]/input").sendKeys("your password");

        driver.findElementByXPath("//*/div/div[1]/div/span/span").click();
    }
}
