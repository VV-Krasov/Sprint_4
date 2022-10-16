package ru.praktikum.model;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class OrderPage {
    private WebDriver driver;
    private static final By nextButton = By.xpath("//div[@class='Order_NextButton__1_rCA']//button");
    private static final By orderFormOrderButton = By.xpath("//div[@class='Order_Content__bmtHS']//button[text()='Заказать']");
    private static final By orderFormStatusButton = By.xpath("//button[text()='Посмотреть статус']");
    private static final By orderFormYesButton = By.xpath("//button[text()='Да']");
    private static final By orderFormFirstName = By.xpath("//input[@placeholder='* Имя']");
    private static final By orderFormLastName = By.xpath("//input[@placeholder='* Фамилия']");
    private static final By orderFormAddress = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");
    private static final By orderFormMetro = By.xpath("//input[@placeholder='* Станция метро']");
    private static final By orderFormPhone = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");
    private static final By orderFormDeliveryDate = By.xpath("//input[@placeholder='* Когда привезти самокат']");
    private static final By orderFormRentalPeriod = By.xpath("//div[text()='* Срок аренды']");
    private static final By orderFormCheckboxScooterColorBlack = By.id("black");
    private static final By orderFormCheckboxScooterColorGrey = By.id("grey");
    private static final By orderFormCommentForCourier = By.xpath("//input[@placeholder='Комментарий для курьера']");

    public OrderPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void selectRentalPeriod(String period)
    {
        driver.findElement(orderFormRentalPeriod).click();
        driver.findElement(By.xpath("//div[text()='" + period + "']")).click();
    }

    public void clickNextButton()
    {
        driver.findElement(nextButton).click();
    }

    public void selectFirstMetroStation()
    {
        driver.findElement(orderFormMetro).click();
        driver.findElement(orderFormMetro).sendKeys(Keys.DOWN);
        driver.findElement(orderFormMetro).sendKeys(Keys.ENTER);
    }

    public void fillFirstName(String text)
    {
        driver.findElement(orderFormFirstName).sendKeys(text);
    }

    public void fillLastName(String text)
    {
        driver.findElement(orderFormLastName).sendKeys(text);
    }

    public void fillAddress(String text)
    {
        driver.findElement(orderFormAddress).sendKeys(text);
    }

    public void fillPhone(String text)
    {
        driver.findElement(orderFormPhone).sendKeys(text);
    }

    public void fillDeliveryDate(String text)
    {
        driver.findElement(orderFormDeliveryDate).sendKeys(text);
        driver.findElement(orderFormDeliveryDate).sendKeys(Keys.ENTER);
    }

    public void selectScooterColorBlack()
    {
        driver.findElement(orderFormCheckboxScooterColorBlack).click();
    }

    public void selectScooterColorGrey()
    {
        driver.findElement(orderFormCheckboxScooterColorGrey).click();
    }

    public void fillCommentForCourier(String text)
    {
        driver.findElement(orderFormCommentForCourier).sendKeys(text);
    }

    public void clickFormOrderButton()
    {
        driver.findElement(orderFormOrderButton).click();
    }

    public void clickFormYesButton()
    {
        driver.findElement(orderFormYesButton).click();
    }

    public void clickFormStatusButton()
    {
        driver.findElement(orderFormStatusButton).click();
    }

}
