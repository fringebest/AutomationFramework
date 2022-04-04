package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {

    WebDriver driver = null ;

    By textBoxSearch = By.name("q");
    By buttonSearch = By.name("btnK");
    By popUpFrame = By.xpath("//button[@id='L2AGLb']");

    public GoogleSearchPageObjects(WebDriver driver){
        this.driver = driver;
    }

    public void setTextBoxSearch(String text){
        driver.findElement(textBoxSearch).sendKeys(text);
    }

    public void clickSearchButton(){
        driver.findElement(buttonSearch).sendKeys(Keys.RETURN);
    }

    public void closePopUpFrame (){
        driver.findElement(popUpFrame).click();
    }
}
