package com.coherensolutions.traning.automation.java.web.urnezaite.yandex;

import org.openqa.selenium.By;

public class Locators {
    static String userName = "selenium.test.account";
    public static final By logInOption = By.partialLinkText("Log in");
    public static final By usernameInput = By.id("passp-field-login");
    public static final By logInButton = By.className("passp-sign-in-button");
    public static final By logInButton2 = By.id("passp:sign-in");
    public static final By passwordInput = By.id("passp-field-passwd");
    public static final By userInfo = By.partialLinkText(userName);
    public static final By mailLogo = By.xpath("//div[contains(@class, 'PSHeaderIcon-Image_Mail')]");
    public static final By compose = By.linkText("Compose");
    public static final By languageLogo = By.cssSelector("img.mail-ui-Icon");
    public static final By send = By.partialLinkText("Send");
    public static final By composeHeader = By.xpath("//*[text()='New message']");
    public static final By languagesSelection = By.id("footer-langs-dropdown");
    public static final By allLanguageElements = By.xpath("//span[@class='mail-ui-Link-Content']");
}
