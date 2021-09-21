package com.CapitolisAssignment.testCases;

import com.CapitolisAssignment.pageObjects.DynamicLoadingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_DinamicLoadingTest_004 extends BaseClass{

    @Test
    public void test()
    {
        DynamicLoadingPage dl = new DynamicLoadingPage(driver);

        dl.goToPage();
        dl.pressButton();
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(driver.getPageSource().contains("Hello World!"))
        {
            Assert.assertTrue(true);
            logger.info("Passed: Hello World! appeared on the screen");
        }
        else
        {
            Assert.assertTrue(false);
            logger.info("Failed: Hello World! didn't appeare on the screen");
        }
    }
}
