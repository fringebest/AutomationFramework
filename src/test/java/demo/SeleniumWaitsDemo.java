package demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SeleniumWaitsDemo {
    public static void main(String[] args) {
        seleniumWaits();
    }

    public static void seleniumWaits(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://google.com");
        driver.findElement(By.xpath("//button[@id='L2AGLb']")).click();

        WebElement searchInput =  driver.findElement(By.name("q"));
        searchInput.sendKeys("Automation step by step");
        searchInput.sendKeys(Keys.RETURN);

        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("abcd")));
        driver.findElement(By.name("abce"));

        driver.close();
        driver.quit();

    }
}
