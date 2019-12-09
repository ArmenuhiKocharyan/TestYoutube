package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestSubtitle extends WebDriverSettings {

    @Test
    public void testSubtitles() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"img\"]")).click();
        Thread.sleep(2000);

        if (driver.findElement(By.xpath("//*/div[2]/div[2]/button[2]")).isDisplayed()) {
            actions.sendKeys(Keys.CONTROL + "c").build().perform();
            Thread.sleep(5000);
            actions.sendKeys(Keys.CONTROL + "c").build().perform();
            Thread.sleep(5000);
        } else {
            System.out.println("Subtitles not exist.");
        }

    }
}




