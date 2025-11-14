package Lesson_9;

import jdk.jfr.Description;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MtsOnlineTest {
    @Test
    @Description("открыть страницу")
    public void MtsOnlineTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        WebElement blockTitle = driver.findElement(By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/h2"));
        Thread.sleep(10000);
        driver.quit();
    }
}