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
        mainPage.clickFAQQuestionHowMuchItCosts();

        Assert.assertEquals("Incorrect text in FAQ question", "Сколько это стоит? И как оплатить?", mainPage.getTextFAQQuestionHowMuchItCosts());
        Assert.assertEquals("Incorrect text in FAQ answer", "Сутки — 400 рублей. Оплата курьеру — наличными или картой.", mainPage.getTextFAQAnswerHowMuchItCosts());
    }

    @Test
    public void checkFAQFewScooters_AnswerIsShowsAndBothTextsIsCorrect()
    {
        mainPage.clickFAQQuestionFewScooters();

        Assert.assertEquals("Incorrect text in FAQ question", "Хочу сразу несколько самокатов! Так можно?", mainPage.getTextFAQQuestionFewScooters());
        Assert.assertEquals("Incorrect text in FAQ answer", "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.", mainPage.getTextFAQAnswerFewScooters());
    }

    @Test
    public void checkFAQHowTimeIsCalculated_AnswerIsShowsAndBothTextsIsCorrect()
    {
        mainPage.clickFAQQuestionTimeCalculating();

        Assert.assertEquals("Incorrect text in FAQ question", "Как рассчитывается время аренды?", mainPage.getTextFAQQuestionTimeCalculating());
        Assert.assertEquals("Incorrect text in FAQ answer", "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.", mainPage.getTextFAQAnswerTimeCalculating());
    }

    @Test
    public void checkFAQOrderForToday_AnswerIsShowsAndBothTextsIsCorrect()
    {
        mainPage.clickFAQQuestionOrderForToday();

        Assert.assertEquals("Incorrect text in FAQ question", "Можно ли заказать самокат прямо на сегодня?", mainPage.getTextFAQQuestionOrderForToday());
        Assert.assertEquals("Incorrect text in FAQ answer", "Только начиная с завтрашнего дня. Но скоро станем расторопнее.", mainPage.getTextFAQAnswerOrderForToday());
    }

    @Test
    public void checkFAQProlongateOrderOrReturnEarlier_AnswerIsShowsAndBothTextsIsCorrect()
    {
        mainPage.clickFAQQuestionProlongateOrReturnEarlier();

        Assert.assertEquals("Incorrect text in FAQ question", "Можно ли продлить заказ или вернуть самокат раньше?", mainPage.getTextFAQQuestionProlongateOrReturnEarlier());
        Assert.assertEquals("Incorrect text in FAQ answer", "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.", mainPage.getTextFAQAnswerProlongateOrReturnEarlier());
    }

    @Test
    public void checkFAQIsChargerIncluded_AnswerIsShowsAndBothTextsIsCorrect()
    {
        mainPage.clickFAQQuestionIsChargerIncluded();

        Assert.assertEquals("Incorrect text in FAQ question", "Вы привозите зарядку вместе с самокатом?", mainPage.getTextFAQQuestionIsChargerIncluded());
        Assert.assertEquals("Incorrect text in FAQ answer", "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.", mainPage.getTextFAQAnswerIsChargerIncluded());
    }

    @Test
    public void checkFAQOrderCancellation_AnswerIsShowsAndBothTextsIsCorrect()
    {
        mainPage.clickFAQQuestionOrderCancellation();

        Assert.assertEquals("Incorrect text in FAQ question", "Можно ли отменить заказ?", mainPage.getTextFAQQuestionOrderCancellation());
        Assert.assertEquals("Incorrect text in FAQ answer", "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.", mainPage.getTextFAQAnswerOrderCancellation());
    }

    @Test
    public void checkFAQOrderToOutsideMKAD_AnswerIsShowsAndBothTextsIsCorrect()
    {
        mainPage.clickFAQQuestionOrderOutsideMKAD();

        Assert.assertEquals("Incorrect text in FAQ question", "Я живу за МКАДом, привезёте?", mainPage.getTextFAQQuestionOrderOutsideMKAD());
        Assert.assertEquals("Incorrect text in FAQ answer", "Да, обязательно. Всем самокатов! И Москве, и Московской области.", mainPage.getTextFAQAnswerOrderOutsideMKAD());
    }

    @After
    public void onTestComplete()
    {
        driver.quit();
    }
}
