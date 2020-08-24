package com.kodilla.testing2.facebook;

import java.util.concurrent.TimeUnit;
import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_REGISTER_BUTTON = "//form[contains(@class,\"_featuredLogin\")]/div[5]/a";
    public static final String XPATH_NAME = "//div[contains(@class,\"clearfix _58mh\")]/div[1]/div/input";
    public static final String XPATH_SURNAME = "//div[contains(@class,\"clearfix _58mh\")]/div[2]/div/div/input";
    public static final String XPATH_DAY= "//span[contains(@class,\"_5k_4\")]/span/select[1]";
    public static final String XPATH_MONTH= "//span[contains(@class,\"_5k_4\")]/span/select[2]";
    public static final String XPATH_YEAR= "//span[contains(@class,\"_5k_4\")]/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        assert driver != null;
        driver.get("https://www.facebook.com");

        WebElement registerButton = driver.findElement(By.xpath(XPATH_REGISTER_BUTTON));
        registerButton.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement selectName = driver.findElement(By.xpath(XPATH_NAME));
        selectName.sendKeys("Rafal");

        WebElement selectSurname = driver.findElement(By.xpath(XPATH_SURNAME));
        selectSurname.sendKeys("Mazuchowski");

        WebElement selectDay = driver.findElement(By.xpath(XPATH_DAY));
        Select dayBox = new Select (selectDay);
        dayBox.selectByIndex(30);

        WebElement selectMonth = driver.findElement(By.xpath(XPATH_MONTH));
        Select monthBox = new Select (selectMonth);
        monthBox.selectByIndex(8);

        WebElement selectYear = driver.findElement(By.xpath(XPATH_YEAR));
        Select yearBox = new Select (selectYear);
        yearBox.selectByValue("1992");
    }
}