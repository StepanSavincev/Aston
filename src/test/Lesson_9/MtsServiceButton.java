package Lesson_9;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class MtsServiceButton {
    @Test
    public void MtsServiceButton()throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");

        WebElement moreInfo = driver.findElement(By.xpath("//*[@id='cookie-agree']"));
        moreInfo.click();
        WebElement moreInfoLink = driver.findElement(By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/a"));
        moreInfoLink.click();
        assertTrue(driver.getCurrentUrl().contains("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/"));
        driver.quit();
    }
}