package com.CapitolisAssignment.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckboxesPage {

    WebDriver ldriver;

    public CheckboxesPage(WebDriver rdriver) {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(linkText="Checkboxes")
    @CacheLookup
    WebElement checkboxesLink;

    @FindBy(xpath="//*[@id=\"checkboxes\"]/input[1]")
    @CacheLookup
    WebElement checkbox1;

    @FindBy(xpath="//*[@id=\"checkboxes\"]/input[2]")
    @CacheLookup
    WebElement checkbox2;

    public WebElement getCheckbox1() {
        return checkbox1;
    }

    public void setCheckbox1(WebElement checkbox1) {
        this.checkbox1 = checkbox1;
    }

    public WebElement getCheckbox2() {
        return checkbox2;
    }

    public void setCheckbox2(WebElement checkbox2) {
        this.checkbox2 = checkbox2;
    }

    public void goToCheckboxesPage()
    {
        checkboxesLink.click();
    }

    public void toggleCheckbox1()
    {
        checkbox1.click();
    }

    public void toggleCheckbox2()
    {
        checkbox2.click();
    }


}
