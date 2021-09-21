package com.CapitolisAssignment.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JQueryUIPage {

    WebDriver ldriver;

    public JQueryUIPage(WebDriver rdriver) {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(linkText="JQuery UI Menus")
    @CacheLookup
    WebElement pageLink;

    @FindBy(xpath="//*[@id=\"ui-id-2\"]")
    @CacheLookup
    WebElement firstLevel;

    @FindBy(xpath="//*[@id=\"ui-id-4\"]")
    @CacheLookup
    WebElement secondLevel;

    @FindBy(xpath="//*[@id=\"ui-id-8\"]")
    @CacheLookup
    WebElement finalLevel;

    public void goToPage()
    {
        pageLink.click();
    }

    public void downloadExcel() throws InterruptedException {
        Actions ac = new Actions(ldriver);
        ac.moveToElement(firstLevel).perform();
        Thread.sleep(2000);
        ac.moveToElement(secondLevel).perform();
        Thread.sleep(2000);
        ac.moveToElement(finalLevel).click().perform();

    }
}
