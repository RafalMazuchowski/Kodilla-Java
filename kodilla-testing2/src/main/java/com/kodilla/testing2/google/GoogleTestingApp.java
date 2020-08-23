package com.kodilla.testing2.google;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleTestingApp {
    public static final String SERCHFIELD = ".gLFyf.gsfi";
    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        assert driver != null;
        driver.get("https://www.google.com");

        //WebElement searchField = driver.findElement(By.id("lst-ib")); ---> Maybe in 2017 it worked
        WebElement searchField = driver.findElement(By.cssSelector(SERCHFIELD));
        searchField.sendKeys("Kodilla");
        searchField.submit();
    }
}
