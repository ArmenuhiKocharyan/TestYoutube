package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestVolume extends WebDriverSettings {

    @Test
    public void testVolumeUpDown() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"img\"]")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*/div[2]/div[1]/button")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*/div[2]/div[1]/button")).click();

        actions.sendKeys(Keys.CONTROL + "m").build().perform();
        Thread.sleep(2000);

        actions.sendKeys(Keys.CONTROL + "m").build().perform();
        Thread.sleep(2000);

        Integer valBeforDown = Integer.valueOf(driver.findElement(By.className("ytp-volume-panel")).getAttribute("aria-valuenow"));
        System.out.println(valBeforDown);

        for (int i = 0; i < 6; i++) {
            actions.sendKeys(Keys.ARROW_DOWN).build().perform();
            Thread.sleep(500);
        }

        Integer valAfterDown = Integer.valueOf(driver.findElement(By.className("ytp-volume-panel")).getAttribute("aria-valuenow"));
        System.out.println(valAfterDown);

        if (valAfterDown < valBeforDown) {
            for (int i = 0; i < 6; i++) {
                actions.sendKeys(Keys.ARROW_UP).build().perform();
                Thread.sleep(500);
            }
        }
    }
}
