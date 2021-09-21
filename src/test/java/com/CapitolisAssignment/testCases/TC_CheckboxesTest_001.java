package com.CapitolisAssignment.testCases;

import com.CapitolisAssignment.pageObjects.CheckboxesPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_CheckboxesTest_001 extends BaseClass{

    @Test
    public void checkboxesTest() throws IOException, InterruptedException {

        CheckboxesPage cbPage = new CheckboxesPage(driver);
        cbPage.goToCheckboxesPage();

        logger.info("Checkboxes page is open");

        if (cbPage.getCheckbox1().isSelected()) {
            cbPage.toggleCheckbox1();
            logger.info("Checkbox 1 toggled to non selected status");
            if (!cbPage.getCheckbox1().isSelected()) {
                Assert.assertTrue(true);
                logger.info(" success: checkbox 1 is unselected as expected");
            } else {
                Assert.assertTrue(false);
                logger.info("Failure: checkbox 1 is selected but should be unselected expected");
            }

        } else if (!cbPage.getCheckbox1().isSelected()) {
            cbPage.toggleCheckbox1();
            logger.info("Checkbox 1 toggled to selected status");
            if (cbPage.getCheckbox1().isSelected()) {
                Assert.assertTrue(true);
                logger.info(" success: checkbox 1 is selected as expected");
            } else {
                Assert.assertTrue(false);
                logger.info("Failure: checkbox 1 is unselected but should be selected expected");
            }

        }


        if (cbPage.getCheckbox2().isSelected()) {
            cbPage.toggleCheckbox2();
            logger.info("Checkbox 2 toggled to non selected status");
            if (!cbPage.getCheckbox2().isSelected()) {
                Assert.assertTrue(true);
                logger.info(" success: checkbox 2 is unselected as expected");
            } else {
                Assert.assertTrue(false);
                logger.info("Failure: checkbox 2 is selected but should be unselected expected");
            }

        } else if (!cbPage.getCheckbox2().isSelected()) {
            cbPage.toggleCheckbox2();
            logger.info("Checkbox 2 toggled to selected status");
            if (cbPage.getCheckbox2().isSelected()) {
                Assert.assertTrue(true);
                logger.info(" success: checkbox 2 is selected as expected");
            } else {
                Assert.assertTrue(false);
                logger.info("Failure: checkbox 2 is unselected but should be selected expected");
            }

        }
    }
}
