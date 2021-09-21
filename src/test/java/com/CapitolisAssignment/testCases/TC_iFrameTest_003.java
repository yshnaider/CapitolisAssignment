package com.CapitolisAssignment.testCases;

import com.CapitolisAssignment.pageObjects.FramePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_iFrameTest_003 extends BaseClass{

    @Test
    public void iFrameTest() throws InterruptedException {
        FramePage fp = new FramePage(driver);
        String text = "some text";

        logger.info("Starting iFrame test");
        fp.goToIframePage();
        fp.fillText(text);

        if(driver.getPageSource().contains(text))
        {
            Assert.assertTrue(true);
            logger.info("Passed: " + text + " has been filled successfuly to the iFrame");
        }
        else
        {
            Assert.assertTrue(false);
            logger.info("Failed: " + text + " hasn't been filled to the iFrame");
        }
    }
}
