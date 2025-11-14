package Lesson_9;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MtsConnectionServis {
    @Test
    public void MtsConnectionServis()throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        WebElement moreInfo  = driver.findElement(By.xpath("//*[@id='cookie-agree']"));
        moreInfo.click(); // Прошли Куки
        // Нашли Онлайн пополнение
        //WebElement blockTitle = driver.findElement(By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/h2"));
        //клик по выбору
        WebElement serviceOption = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/button/span[2]/svg")); // Выбираем нужный вариант
        serviceOption.click();
        // выбор Услуги связи
        WebElement serviceOption1 = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[1]/p"));
        serviceOption1.click();

//        Actions phone = new Actions(driver);
//        phone.keyUp("297777777");
//        phone.build();
//        phone.perform();

        WebElement phoneNumberInput = driver.findElement(By.id("//*[@id=\"connection-phone\"]"));
        phoneNumberInput.sendKeys("297777777");

        WebElement continueButton = driver.findElement(By.id("//*[@id=\"pay-connection\"]/button"));
        continueButton.click();

        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("confirmation"));
//        driver.findElement(By.id("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/button")).click();
//        driver.findElement(By.id("//*[@id=\"connection-phone\"]")).sendKeys("297777777");

        driver.quit();
    }
}