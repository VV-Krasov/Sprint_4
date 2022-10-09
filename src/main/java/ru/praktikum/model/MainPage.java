package ru.praktikum.model;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    public static final String PAGE_URL = "https://qa-scooter.praktikum-services.ru/";
    public static final By ORDER_BUTTON_IN_HEADER = By.xpath("//div[starts-with(@class, 'Header_Nav')]//button[text()='Заказать']");
    public static final By ORDER_BUTTON_AFTER_ROADMAP = By.xpath("//div[starts-with(@class, 'Home_FinishButton')]//button[text()='Заказать']");
    public static final By COOKIES_ACCEPT_BUTTON = By.id("rcc-confirm-button");
    //FAQ section

    //Сколько это стоит? И как оплатить?
    public static final By FAQ_QUESTION_HOW_MUCH_IT_COSTS = By.id("accordion__heading-0");
    //Сутки — 400 рублей. Оплата курьеру — наличными или картой.
    public static final By FAQ_ANSWER_HOW_MUCH_IT_COSTS = By.xpath("//*[@id='accordion__panel-0']/p");
    //Хочу сразу несколько самокатов! Так можно?
    public static final By FAQ_QUESTION_FEW_SCOOTERS = By.id("accordion__heading-1");
    //Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.
    public static final By FAQ_ANSWER_FEW_SCOOTERS= By.xpath("//*[@id='accordion__panel-1']/p");
    //Как рассчитывается время аренды?
    public static final By FAQ_QUESTION_TIME_CALCULATING= By.id("accordion__heading-2");
    //Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.
    public static final By FAQ_ANSWER_TIME_CALCULATING = By.xpath("//*[@id='accordion__panel-2']/p");

    //Можно ли заказать самокат прямо на сегодня?
    public static final By FAQ_QUESTION_ORDER_FOR_TODAY = By.id("accordion__heading-3");
    //Только начиная с завтрашнего дня. Но скоро станем расторопнее.
    public static final By FAQ_ANSWER_ORDER_FOR_TODAY  = By.xpath("//*[@id='accordion__panel-3']/p");
    //Можно ли продлить заказ или вернуть самокат раньше?
    public static final By FAQ_QUESTION_PROLONGATE_OR_RETURN_EARLIER = By.id("accordion__heading-4");
    //Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.
    public static final By FAQ_ANSWER_PROLONGATE_OR_RETURN_EARLIER = By.xpath("//*[@id='accordion__panel-4']/p");
    //Вы привозите зарядку вместе с самокатом?
    public static final By FAQ_QUESTION_IS_CHARGER_INCLUDED = By.id("accordion__heading-5");
    //Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.
    public static final By FAQ_ANSWER_IS_CHARGER_INCLUDED = By.xpath("//*[@id='accordion__panel-5']/p");
    //Можно ли отменить заказ?
    public static final By FAQ_QUESTION_ORDER_CANCELLATION= By.id("accordion__heading-6");
    //Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.
    public static final By FAQ_ANSWER_ORDER_CANCELLATION = By.xpath("//*[@id='accordion__panel-6']/p");

    //Я живу за МКАДом, привезёте?
    public static final By FAQ_QUESTION_ORDER_OUTSIDE_MKAD = By.id("accordion__heading-7");
    //Да, обязательно. Всем самокатов! И Москве, и Московской области.
    public static final By FAQ_ANSWER_ORDER_OUTSIDE_MKAD = By.xpath("//*[@id='accordion__panel-7']/p");


    private WebDriver driver;


    public MainPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public MainPage open()
    {
        driver.get(PAGE_URL);
        return this;
    }

    public void clickOrderButtonInHeader()
    {
        driver.findElement(ORDER_BUTTON_IN_HEADER).click();
    }

    public void clickOrderButtonAfterRoadMap()
    {
        driver.findElement(ORDER_BUTTON_AFTER_ROADMAP).click();
    }

    public void clickAcceptCookies()
    {
        driver.findElement(COOKIES_ACCEPT_BUTTON).click();
    }

}
