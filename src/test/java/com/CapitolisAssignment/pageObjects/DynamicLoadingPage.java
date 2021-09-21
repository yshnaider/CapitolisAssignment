package com.CapitolisAssignment.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoadingPage {

    WebDriver ldriver;

    public DynamicLoadingPage(WebDriver rdriver) {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(linkText="Dynamic Loading")
    @CacheLookup
    WebElement dinamicLoadingPageLink;

    @FindBy(linkText="Example 2: Element rendered after the fact")
    @CacheLookup
    WebElement example2PageLink;

    @FindBy(xpath="//*[@id=\"start\"]/button")
    @CacheLookup
    WebElement startButton;

    public void goToPage()
    {
        dinamicLoadingPageLink.click();
        example2PageLink.click();
    }

    public void pressButton()
    {
        startButton.click();
    }


}
