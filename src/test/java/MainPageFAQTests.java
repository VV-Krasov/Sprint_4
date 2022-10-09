import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.praktikum.model.MainPage;
import java.util.concurrent.TimeUnit;
import static ru.praktikum.model.MainPage.*;

//Здесь можно было применить параметризацию, создав тест и к нему
// набор данных, с текстами ответов, вопросов, а также локаторами,
// но из-за условий задания сделал все в отдельных тестах.
public class MainPageFAQTests{

    private WebDriver driver;
    private MainPage mainPage;

    public MainPageFAQTests() {

    }

    @Before
    public void setUp()
    {
        this.driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickAcceptCookies();
    }

    @Test
    public void checkFAQHowMuchItCosts_AnswerIsShowsAndBothTextsIsCorrect()
    {

        String textOfQuestion = driver.findElement(FAQ_QUESTION_HOW_MUCH_IT_COSTS).getText();
        driver.findElement(FAQ_QUESTION_HOW_MUCH_IT_COSTS).click();

        (new WebDriverWait(driver, 1)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.findElement(FAQ_ANSWER_HOW_MUCH_IT_COSTS).getText().length() != 0;
            }
        });
        String textOfAnswer = driver.findElement(FAQ_ANSWER_HOW_MUCH_IT_COSTS).getText();

        Assert.assertEquals("Incorrect text in FAQ question", "Сколько это стоит? И как оплатить?", textOfQuestion);
        Assert.assertEquals("Incorrect text in FAQ answer", "Сутки — 400 рублей. Оплата курьеру — наличными или картой.", textOfAnswer);
    }

    @Test
    public void checkFAQFewScooters_AnswerIsShowsAndBothTextsIsCorrect()
    {

        String textOfQuestion = driver.findElement(FAQ_QUESTION_FEW_SCOOTERS).getText();
        driver.findElement(FAQ_QUESTION_FEW_SCOOTERS).click();

        (new WebDriverWait(driver, 1)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.findElement(FAQ_ANSWER_FEW_SCOOTERS).getText().length() != 0;
            }
        });
        String textOfAnswer = driver.findElement(FAQ_ANSWER_FEW_SCOOTERS).getText();

        Assert.assertEquals("Incorrect text in FAQ question", "Хочу сразу несколько самокатов! Так можно?", textOfQuestion);
        Assert.assertEquals("Incorrect text in FAQ answer", "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.", textOfAnswer);
    }

    @Test
    public void checkFAQHowTimeIsCalculated_AnswerIsShowsAndBothTextsIsCorrect2()
    {

        String textOfQuestion = driver.findElement(FAQ_QUESTION_TIME_CALCULATING).getText();
        driver.findElement(FAQ_QUESTION_TIME_CALCULATING).click();

        (new WebDriverWait(driver, 1)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.findElement(FAQ_ANSWER_TIME_CALCULATING).getText().length() != 0;
            }
        });
        String textOfAnswer = driver.findElement(FAQ_ANSWER_TIME_CALCULATING).getText();

        Assert.assertEquals("Incorrect text in FAQ question", "Как рассчитывается время аренды?", textOfQuestion);
        Assert.assertEquals("Incorrect text in FAQ answer", "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.", textOfAnswer);
    }

    @Test
    public void checkFAQOrderForToday_AnswerIsShowsAndBothTextsIsCorrect4()
    {

        String textOfQuestion = driver.findElement(FAQ_QUESTION_ORDER_FOR_TODAY).getText();
        driver.findElement(FAQ_QUESTION_ORDER_FOR_TODAY).click();

        (new WebDriverWait(driver, 1)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.findElement(FAQ_ANSWER_ORDER_FOR_TODAY).getText().length() != 0;
            }
        });
        String textOfAnswer = driver.findElement(FAQ_ANSWER_ORDER_FOR_TODAY).getText();

        Assert.assertEquals("Incorrect text in FAQ question", "Можно ли заказать самокат прямо на сегодня?", textOfQuestion);
        Assert.assertEquals("Incorrect text in FAQ answer", "Только начиная с завтрашнего дня. Но скоро станем расторопнее.", textOfAnswer);
    }

    @Test
    public void checkFAQProlongateOrderOrReturnEarlier_AnswerIsShowsAndBothTextsIsCorrect5()
    {

        String textOfQuestion = driver.findElement(FAQ_QUESTION_PROLONGATE_OR_RETURN_EARLIER).getText();
        driver.findElement(FAQ_QUESTION_PROLONGATE_OR_RETURN_EARLIER).click();

        (new WebDriverWait(driver, 1)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.findElement(FAQ_ANSWER_PROLONGATE_OR_RETURN_EARLIER).getText().length() != 0;
            }
        });
        String textOfAnswer = driver.findElement(FAQ_ANSWER_PROLONGATE_OR_RETURN_EARLIER).getText();

        Assert.assertEquals("Incorrect text in FAQ question", "Можно ли продлить заказ или вернуть самокат раньше?", textOfQuestion);
        Assert.assertEquals("Incorrect text in FAQ answer", "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.", textOfAnswer);
    }

    @Test
    public void checkFAQIsChargerIncluded_AnswerIsShowsAndBothTextsIsCorrect6()
    {

        String textOfQuestion = driver.findElement(FAQ_QUESTION_IS_CHARGER_INCLUDED).getText();
        driver.findElement(FAQ_QUESTION_IS_CHARGER_INCLUDED).click();

        (new WebDriverWait(driver, 1)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.findElement(FAQ_ANSWER_IS_CHARGER_INCLUDED).getText().length() != 0;
            }
        });
        String textOfAnswer = driver.findElement(FAQ_ANSWER_IS_CHARGER_INCLUDED).getText();

        Assert.assertEquals("Incorrect text in FAQ question", "Вы привозите зарядку вместе с самокатом?", textOfQuestion);
        Assert.assertEquals("Incorrect text in FAQ answer", "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.", textOfAnswer);
    }

    @Test
    public void checkFAQOrderCancellation_AnswerIsShowsAndBothTextsIsCorrect6()
    {

        String textOfQuestion = driver.findElement(FAQ_QUESTION_ORDER_CANCELLATION).getText();
        driver.findElement(FAQ_QUESTION_ORDER_CANCELLATION).click();

        (new WebDriverWait(driver, 1)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.findElement(FAQ_ANSWER_ORDER_CANCELLATION).getText().length() != 0;
            }
        });
        String textOfAnswer = driver.findElement(FAQ_ANSWER_ORDER_CANCELLATION).getText();

        Assert.assertEquals("Incorrect text in FAQ question", "Можно ли отменить заказ?", textOfQuestion);
        Assert.assertEquals("Incorrect text in FAQ answer", "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.", textOfAnswer);
    }

    @Test
    public void checkFAQOrderToOutsideMKAD_AnswerIsShowsAndBothTextsIsCorrect6()
    {

        String textOfQuestion = driver.findElement(FAQ_QUESTION_ORDER_OUTSIDE_MKAD).getText();
        driver.findElement(FAQ_QUESTION_ORDER_OUTSIDE_MKAD).click();

        (new WebDriverWait(driver, 1)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.findElement(FAQ_ANSWER_ORDER_OUTSIDE_MKAD).getText().length() != 0;
            }
        });
        String textOfAnswer = driver.findElement(FAQ_ANSWER_ORDER_OUTSIDE_MKAD).getText();

        Assert.assertEquals("Incorrect text in FAQ question", "Я живу за МКАДом, привезёте?", textOfQuestion);
        Assert.assertEquals("Incorrect text in FAQ answer", "Да, обязательно. Всем самокатов! И Москве, и Московской области.", textOfAnswer);
    }

    @After
    public void onTestComplete()
    {
        driver.quit();
    }
}
