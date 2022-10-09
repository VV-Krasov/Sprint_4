package ru.praktikum.model;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class OrderPage {
    private WebDriver driver;
    public static final By ORDER_BUTTON = By.className("Button_Button__ra12g Button_Middle__1CSJM");
    public static final By NEXT_BUTTON = By.xpath("//div[@class='Order_NextButton__1_rCA']//button");
    public static final By ORDER_FORM_ORDER_BUTTON = By.xpath("//div[@class='Order_Content__bmtHS']//button[text()='Заказать']");
    public static final By ORDER_FORM_STATUS_BUTTON = By.xpath("//button[text()='Посмотреть статус']");
    public static final By ORDER_FORM_YES_BUTTON = By.xpath("//button[text()='Да']");
    public static final By ORDER_FORM_FIRSTNAME = By.xpath("//input[@placeholder='* Имя']");
    public static final By ORDER_FORM_LASTNAME = By.xpath("//input[@placeholder='* Фамилия']");
    public static final By ORDER_FORM_ADDRESS= By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");
    public static final By ORDER_FORM_METRO = By.xpath("//input[@placeholder='* Станция метро']");
    public static final By ORDER_FORM_PHONE = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");
    public static final By ORDER_FORM_DELIVERY_DATE = By.xpath("//input[@placeholder='* Когда привезти самокат']");
    public static final By ORDER_FORM_RENTAL_PERIOD = By.xpath("//div[text()='* Срок аренды']");
    public static final By ORDER_FORM_CHECKBOX_SCOOTER_COLOR_BLACK = By.id("black");
    public static final By ORDER_FORM_CHECKBOX_SCOOTER_COLOR_GREY = By.id("grey");
    public static final By ORDER_FORM_COMMENT_FOR_COURIER = By.xpath("//input[@placeholder='Комментарий для курьера']");

    public OrderPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void selectRentalPeriod(String period)
    {
        driver.findElement(ORDER_FORM_RENTAL_PERIOD).click();
        driver.findElement(By.xpath("//div[text()='" + period + "']")).click();
    }

    public void clickNextButton()
    {
        driver.findElement(NEXT_BUTTON).click();
    }

    public void selectFirstMetroStation()
    {
        driver.findElement(ORDER_FORM_METRO).click();
        driver.findElement(ORDER_FORM_METRO).sendKeys(Keys.DOWN);
        driver.findElement(ORDER_FORM_METRO).sendKeys(Keys.ENTER);
    }

}
