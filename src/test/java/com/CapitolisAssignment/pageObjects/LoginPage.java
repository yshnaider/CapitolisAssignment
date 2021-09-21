package com.CapitolisAssignment.pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver ldriver;

    public LoginPage(WebDriver rdriver) {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(linkText="Basic Auth")
    @CacheLookup
    WebElement loginPageLink;

    public void goToLoginPage()
    {
        loginPageLink.click();
    }

    public void fillLoginInfo()
    {
        ldriver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
    }


}
