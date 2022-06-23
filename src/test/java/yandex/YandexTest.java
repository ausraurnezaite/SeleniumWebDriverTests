package yandex;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


public class YandexTest {
    public WebDriver driver = new ChromeDriver();
    final String userName = "selenium.test.account";
    final String password = "seleniumtestaccount";

    @BeforeEach
    void setUp() {
        driver.get("https://mail.yandex.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }

    void logIn() {
        driver.findElement(Locators.logInOption).click();
        driver.findElement(Locators.usernameInput).sendKeys(userName);
        driver.findElement(Locators.logInButton).click();

        driver.findElement(Locators.passwordInput).sendKeys(password);
        driver.findElement(Locators.logInButton).click();
    }

    @Test
    void testLogInPage() {
        logIn();
        Assertions.assertTrue(driver.findElement(Locators.userInfo).isDisplayed());
        Assertions.assertTrue(driver.findElement(Locators.mailLogo).isDisplayed());
        Assertions.assertTrue(driver.findElement(Locators.compose).isEnabled());
    }

    @Test
    public void languagesOptionsAreDisplayedTest() {
        logIn();
        driver.findElement(Locators.languageLogo).click();

        List<String> languages = new ArrayList<>(List.of("Русский", "Türkçe", "Українська", "Беларуская", "Қазақ", "O‘zbekiston"));
        WebElement languagesSelect = driver.findElement(Locators.languagesSelection);
        languagesSelect.findElements(Locators.allLanguageElements).forEach(element -> Assertions.assertTrue(languages.contains(element.getText())));
    }

    @Test
    public void composeEmailTest() {
        logIn();
        driver.findElement(Locators.compose).click();
        String composeHeader = driver.findElement(Locators.composeHeader).getText();
        Assertions.assertEquals("New message", composeHeader, "header text should be 'New message'");
        Assertions.assertTrue(driver.findElement(Locators.send).isEnabled());
    }

    @AfterEach
    void cleanUp() {
        driver.quit();
    }
}