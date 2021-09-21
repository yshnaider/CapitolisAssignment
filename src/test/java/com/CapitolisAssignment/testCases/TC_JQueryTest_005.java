package com.CapitolisAssignment.testCases;

import com.CapitolisAssignment.pageObjects.JQueryUIPage;
import com.CapitolisAssignment.utilities.XLUtils;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_JQueryTest_005 extends BaseClass{

    @Test
    public void JQueryTest() throws InterruptedException, IOException {

        String excelPath = "C:\\Users\\k\\Downloads\\menu.xls";
        String shitName = "Sheet 1 - Table 1";
        JQueryUIPage jq = new JQueryUIPage(driver);

        jq.goToPage();
        jq.downloadExcel();
        Thread.sleep(5000);

        logger.info("tax value is: " + XLUtils.getCellData(excelPath, shitName, 2,3));

    }
}
