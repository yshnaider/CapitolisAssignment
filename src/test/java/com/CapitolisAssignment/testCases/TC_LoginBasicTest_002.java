package com.CapitolisAssignment.testCases;

import com.CapitolisAssignment.pageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_LoginBasicTest_002 extends BaseClass{

    @Test
    public void basicLogin()
    {
        LoginPage lp = new LoginPage(driver);

        logger.info("Login try...");

        lp.fillLoginInfo();

        if(driver.getPageSource().contains("Congratulations! You must have the proper credentials."))
        {
            Assert.assertTrue(true);
            logger.info("Login passed successfuly");
        }
        else
        {
            Assert.assertTrue(false);
            logger.info("Login failed");
        }
    }
}
