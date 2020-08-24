package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_NAME = "//div[contains(@class,\"_5dbb\")]/div/input";
    public static final String XPATH_SURNAME = "//div[contains(@class,\"mbm _1iy_ _a4y rfloat _ohf\")]/div/div/input";
    public static final String XPATH_DAY = "//span[contains(@class,\"_5k_4\")]/span/select[1]";
    public static final String XPATH_MONTH = "//span[contains(@class,\"_5k_4\")]/span/select[2]";
    public static final String XPATH_YEAR = "//span[contains(@class,\"_5k_4\")]/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        assert driver != null;
        driver.get("https://www.facebook.com/reg/?rs=1");

    while (!driver.findElement(By.xpath(XPATH_NAME)).isDisplayed());

        WebElement selectNameField = driver.findElement(By.xpath(XPATH_NAME));
        selectNameField.sendKeys("Rafal");

        WebElement selectSurnameField = driver.findElement(By.xpath(XPATH_SURNAME));
        selectSurnameField.sendKeys("Mazuchowski");

        WebElement selectDayField = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select (selectDayField);
        selectDay.selectByIndex(30);

        WebElement selectMonthField = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMont = new Select (selectMonthField);
        selectMont.selectByIndex(8);

        WebElement selectYearField = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYear = new Select (selectYearField);
        selectYear.selectByValue(String.valueOf(1992));
    }
}
