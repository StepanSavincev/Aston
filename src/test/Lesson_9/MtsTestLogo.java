package Lesson_9;

import jdk.jfr.Description;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MtsTestLogo {
    @Test
    @Description("Visa")
    public void MtsTestLogo()throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");

        assertTrue(driver.findElement(By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/div[2]/ul/li[1]/img")));
        driver.navigate().back();

        driver.quit();
    }
    private void assertTrue(WebElement element) {
    }
    @Test
    @Description("Verified By Visa")
    public void MtsTestLogo1()throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");

        assertTrue(driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[2]/img")));
        driver.navigate().back();

        driver.quit();
    }
    @Test
    @Description("MasterCard")
    public void MtsTestLogo2()throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");

        assertTrue(driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[3]/img")));
        driver.navigate().back();

        driver.quit();
    }
    @Test
    @Description("MasterCard Secure Code")
    public void MtsTestLogo3()throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");

        assertTrue(driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[4]/img")));
        driver.navigate().back();

        driver.quit();
    }
    @Test
    @Description("Белкарт")
    public void MtsTestLogo4()throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");

        assertTrue(driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[5]/img")));
        driver.navigate().back();

        driver.quit();
    }
}
