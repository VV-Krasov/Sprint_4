package ru.praktikum.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {

    private String PAGE_URL = "https://qa-scooter.praktikum-services.ru/";
    private static final By orderButtonInHeader = By.xpath("//div[starts-with(@class, 'Header_Nav')]//button[text()='Заказать']");
    private static final By orderButtonAfterRoadmap = By.xpath("//div[starts-with(@class, 'Home_FinishButton')]//button[text()='Заказать']");
    private static final By cookiesAcceptButton = By.id("rcc-confirm-button");

    //FAQ section
    //Сколько это стоит? И как оплатить?
    private static final By FAQQuestionHowMuchItCosts = By.id("accordion__heading-0");
    //Сутки — 400 рублей. Оплата курьеру — наличными или картой.
    private static final By FAQAnswerHowMuchItCosts = By.xpath("//*[@id='accordion__panel-0']/p");
    //Хочу сразу несколько самокатов! Так можно?
    private static final By FAQQuestionFewScooters = By.id("accordion__heading-1");
    //Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.
    private static final By FAQAnswerFewScooters = By.xpath("//*[@id='accordion__panel-1']/p");
    //Как рассчитывается время аренды?
    private static final By FAQQuestionTimeCalculating = By.id("accordion__heading-2");
    //Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.
    private static final By FAQAnswerTimeCalculating = By.xpath("//*[@id='accordion__panel-2']/p");

    //Можно ли заказать самокат прямо на сегодня?
    private static final By FAQQuestionOrderForToday = By.id("accordion__heading-3");
    //Только начиная с завтрашнего дня. Но скоро станем расторопнее.
    private static final By FAQAnswerOrderForToday  = By.xpath("//*[@id='accordion__panel-3']/p");
    //Можно ли продлить заказ или вернуть самокат раньше?
    private static final By FAQQuestionProlongateOrReturnEarlier = By.id("accordion__heading-4");
    //Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.
    private static final By FAQAnswerProlongateOrReturnEarlier = By.xpath("//*[@id='accordion__panel-4']/p");
    //Вы привозите зарядку вместе с самокатом?
    private static final By FAQQuestionIsChargerIncluded = By.id("accordion__heading-5");
    //Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.
    private static final By FAQAnswerIsChargerIncluded = By.xpath("//*[@id='accordion__panel-5']/p");
    //Можно ли отменить заказ?
    private static final By FAQQuestionOrderCancellation = By.id("accordion__heading-6");
    //Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.
    private static final By FAQAnswerOrderCancellation = By.xpath("//*[@id='accordion__panel-6']/p");

    //Я живу за МКАДом, привезёте?
    private static final By FAQQuestionOrderOutsideMKAD = By.id("accordion__heading-7");
    //Да, обязательно. Всем самокатов! И Москве, и Московской области.
    private static final By FAQAnswerOrderOutsideMKAD = By.xpath("//*[@id='accordion__panel-7']/p");
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
        driver.findElement(orderButtonInHeader).click();
    }

    public void clickOrderButtonAfterRoadMap()
    {
        driver.findElement(orderButtonAfterRoadmap).click();
    }

    public void clickAcceptCookies()
    {
        driver.findElement(cookiesAcceptButton).click();
    }

    public String getTextFAQQuestionHowMuchItCosts()
    {
        return driver.findElement(FAQQuestionHowMuchItCosts).getText();

    }
    public void clickFAQQuestionHowMuchItCosts()
    {
        driver.findElement(FAQQuestionHowMuchItCosts).click();
    }

    public String getTextFAQAnswerHowMuchItCosts()
    {
        (new WebDriverWait(driver, 1)).until((ExpectedCondition<Boolean>) d -> d.findElement(FAQAnswerHowMuchItCosts).getText().length() != 0);

        return driver.findElement(FAQAnswerHowMuchItCosts).getText();
    }

    public String getTextFAQQuestionFewScooters()
    {
        return driver.findElement(FAQQuestionFewScooters).getText();

    }

    public void clickFAQQuestionFewScooters()
    {
        driver.findElement(FAQQuestionFewScooters).click();
    }

    public String getTextFAQAnswerFewScooters()
    {
        (new WebDriverWait(driver, 1)).until((ExpectedCondition<Boolean>) d -> d.findElement(FAQAnswerFewScooters).getText().length() != 0);

        return driver.findElement(FAQAnswerFewScooters).getText();
    }
    public String getTextFAQQuestionTimeCalculating()
    {
        return driver.findElement(FAQQuestionTimeCalculating).getText();

    }

    public void clickFAQQuestionTimeCalculating()
    {
        driver.findElement(FAQQuestionTimeCalculating).click();
    }

    public String getTextFAQAnswerTimeCalculating()
    {
        (new WebDriverWait(driver, 1)).until((ExpectedCondition<Boolean>) d -> d.findElement(FAQAnswerTimeCalculating).getText().length() != 0);

        return driver.findElement(FAQAnswerTimeCalculating).getText();
    }

    public String getTextFAQQuestionOrderForToday()
    {
        return driver.findElement(FAQQuestionOrderForToday).getText();

    }

    public void clickFAQQuestionOrderForToday()
    {
        driver.findElement(FAQQuestionOrderForToday).click();
    }

    public String getTextFAQAnswerOrderForToday ()
    {
        (new WebDriverWait(driver, 1)).until((ExpectedCondition<Boolean>) d -> d.findElement(FAQAnswerOrderForToday).getText().length() != 0);

        return driver.findElement(FAQAnswerOrderForToday).getText();
    }

    public String getTextFAQQuestionProlongateOrReturnEarlier()
    {
        return driver.findElement(FAQQuestionProlongateOrReturnEarlier).getText();

    }

    public void clickFAQQuestionProlongateOrReturnEarlier()
    {
        driver.findElement(FAQQuestionProlongateOrReturnEarlier).click();
    }

    public String getTextFAQAnswerProlongateOrReturnEarlier()
    {
        (new WebDriverWait(driver, 1)).until((ExpectedCondition<Boolean>) d -> d.findElement(FAQAnswerProlongateOrReturnEarlier).getText().length() != 0);

        return driver.findElement(FAQAnswerProlongateOrReturnEarlier).getText();
    }

    public String getTextFAQQuestionIsChargerIncluded()
    {
        return driver.findElement(FAQQuestionIsChargerIncluded).getText();

    }

    public void clickFAQQuestionIsChargerIncluded()
    {
        driver.findElement(FAQQuestionIsChargerIncluded).click();
    }

    public String getTextFAQAnswerIsChargerIncluded()
    {
        (new WebDriverWait(driver, 1)).until((ExpectedCondition<Boolean>) d -> d.findElement(FAQAnswerIsChargerIncluded).getText().length() != 0);

        return driver.findElement(FAQAnswerIsChargerIncluded).getText();
    }

    public String getTextFAQQuestionOrderCancellation()
    {
        return driver.findElement(FAQQuestionOrderCancellation).getText();

    }

    public void clickFAQQuestionOrderCancellation()
    {
        driver.findElement(FAQQuestionOrderCancellation).click();
    }

    public String getTextFAQAnswerOrderCancellation()
    {
        (new WebDriverWait(driver, 1)).until((ExpectedCondition<Boolean>) d -> d.findElement(FAQAnswerOrderCancellation).getText().length() != 0);

        return driver.findElement(FAQAnswerOrderCancellation).getText();
    }

    public String getTextFAQQuestionOrderOutsideMKAD()
    {
        return driver.findElement(FAQQuestionOrderOutsideMKAD).getText();

    }

    public void clickFAQQuestionOrderOutsideMKAD()
    {
        driver.findElement(FAQQuestionOrderOutsideMKAD).click();
    }

    public String getTextFAQAnswerOrderOutsideMKAD()
    {
        (new WebDriverWait(driver, 1)).until((ExpectedCondition<Boolean>) d -> d.findElement(FAQAnswerOrderOutsideMKAD).getText().length() != 0);

        return driver.findElement(FAQAnswerOrderOutsideMKAD).getText();
    }
}
