package com.CapitolisAssignment.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class FramePage {

    WebDriver ldriver;

    public FramePage(WebDriver rdriver) {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(linkText="Frames")
    @CacheLookup
    WebElement framePageLink;

    @FindBy(linkText="iFrame")
    @CacheLookup
    WebElement iframePageLink;

    @FindBy(xpath="//*[@id=\"content\"]/div/div/div[1]/div[1]/div[1]/button[1]/span")
    @CacheLookup
    WebElement fileOption;

    @FindBy(xpath="//*[text() = 'New document']")
    @CacheLookup
    WebElement newDoc;


    public void goToIframePage()
    {
        framePageLink.click();
        iframePageLink.click();
    }

    public void fillText(String str) throws InterruptedException {

        ldriver.switchTo().frame("mce_0_ifr");
        ldriver.findElement(By.xpath("//*[@id=\"tinymce\"]")).clear();
        ldriver.findElement(By.xpath("//*[@id=\"tinymce\"]")).sendKeys(str);
    }
}
