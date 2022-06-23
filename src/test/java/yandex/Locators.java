package yandex;

import org.openqa.selenium.By;

public class Locators {
    static String userName = "selenium.test.account";
    final static By logInOption = By.partialLinkText("Log in");
    final static By usernameInput = By.id("passp-field-login");
    final static By logInButton = By.className("passp-sign-in-button");
    final static By logInButton2 = By.id("passp:sign-in");
    final static By passwordInput = By.id("passp-field-passwd");
    final static By userInfo = By.partialLinkText(userName);
    final static By mailLogo = By.xpath("//div[contains(@class, 'PSHeaderIcon-Image_Mail')]");
    final static By compose = By.linkText("Compose");
    final static By languageLogo = By.cssSelector("img.mail-ui-Icon");
    final static By send = By.partialLinkText("Send");
    final static By composeHeader = By.xpath("//*[text()='New message']");
    final static By languagesSelection = By.id("footer-langs-dropdown");
    final static By allLanguageElements = By.xpath("//span[@class='mail-ui-Link-Content']");
}
