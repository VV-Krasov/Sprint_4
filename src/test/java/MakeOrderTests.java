import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.praktikum.model.MainPage;
import ru.praktikum.model.OrderPage;

import java.util.concurrent.TimeUnit;

import static ru.praktikum.model.OrderPage.*;

@RunWith(Parameterized.class)
public class MakeOrderTests {
    private WebDriver driver;
    private MainPage mainPage;
    private OrderPage orderPage;
    private String firstName;
    private String lastName;
    private String address;
    private String phone;
    private String orderDate;
    private String commentForCourier;
    private String rentalPeriod;

    public MakeOrderTests(String firstName, String lastName, String address, String phone, String orderDate, String commentForCourier, String rentalPeriod) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;

        this.orderDate = orderDate;
        this.commentForCourier = commentForCourier;
        this.rentalPeriod = rentalPeriod;
    }

    @Before
    public void setUp()
    {
        this.driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        mainPage = new MainPage(driver);
        orderPage = new OrderPage(driver);
        mainPage.open();
        mainPage.clickAcceptCookies();
    }

    @Parameterized.Parameters
    public static Object[][] getTestData()
    {
        return new Object[][]{
                {"Илья","Кириенко","ул. преображенская, дом 4, квартира 3", "89031234455", "24.03.2023", "комментарий для курьера", "сутки"},
                {"Владимир","Петров","ул. Абрамцевская, дом 124, квартира 98", "89044234433", "24.05.2024", "не звоните в дверь", "пятеро суток"}
        };
    }

    @Test
    public void makeOrderWithClickOnButtonInHeader(){
        mainPage.clickOrderButtonInHeader();

        driver.findElement(ORDER_FORM_FIRSTNAME).sendKeys(firstName);
        driver.findElement(ORDER_FORM_LASTNAME).sendKeys(lastName);
        driver.findElement(ORDER_FORM_ADDRESS).sendKeys(address);
        driver.findElement(ORDER_FORM_PHONE).sendKeys(phone);
        orderPage.selectFirstMetroStation();
        orderPage.clickNextButton();

        driver.findElement(ORDER_FORM_DELIVERY_DATE).sendKeys(orderDate);
        driver.findElement(ORDER_FORM_DELIVERY_DATE).sendKeys(Keys.ENTER);
        orderPage.selectRentalPeriod(rentalPeriod);
        driver.findElement(ORDER_FORM_CHECKBOX_SCOOTER_COLOR_BLACK).click();
        driver.findElement(ORDER_FORM_CHECKBOX_SCOOTER_COLOR_GREY).click();


        driver.findElement(ORDER_FORM_COMMENT_FOR_COURIER).sendKeys(commentForCourier);
        driver.findElement(ORDER_FORM_ORDER_BUTTON).click();
        driver.findElement(ORDER_FORM_YES_BUTTON).click();
        driver.findElement(ORDER_FORM_STATUS_BUTTON).click();
    }

    @Test
    public void makeOrderWithClickOnButtonAfterRoadMap(){
        mainPage.clickOrderButtonAfterRoadMap();

        driver.findElement(ORDER_FORM_FIRSTNAME).sendKeys(firstName);
        driver.findElement(ORDER_FORM_LASTNAME).sendKeys(lastName);
        driver.findElement(ORDER_FORM_ADDRESS).sendKeys(address);
        driver.findElement(ORDER_FORM_PHONE).sendKeys(phone);
        orderPage.selectFirstMetroStation();
        orderPage.clickNextButton();

        driver.findElement(ORDER_FORM_DELIVERY_DATE).sendKeys(orderDate);
        driver.findElement(ORDER_FORM_DELIVERY_DATE).sendKeys(Keys.ENTER);
        orderPage.selectRentalPeriod(rentalPeriod);
        driver.findElement(ORDER_FORM_CHECKBOX_SCOOTER_COLOR_BLACK).click();
        driver.findElement(ORDER_FORM_CHECKBOX_SCOOTER_COLOR_GREY).click();


        driver.findElement(ORDER_FORM_COMMENT_FOR_COURIER).sendKeys(commentForCourier);
        driver.findElement(ORDER_FORM_ORDER_BUTTON).click();
        driver.findElement(ORDER_FORM_YES_BUTTON).click();
        driver.findElement(ORDER_FORM_STATUS_BUTTON).click();
    }

    @After
    public void onTestComplete()
    {
        driver.quit();
    }
}
