package com.app.script;

import org.testng.annotations.Test;

import com.app.TestBase.TestBase;
import com.app.config.ApplicationFilePath;
import com.app.excelRead.Dataprovider;
import com.app.lib.LoginLib;
import com.relevantcodes.extentreports.LogStatus;

public class LoginScript extends TestBase {

	@Test(dataProvider = "login", dataProviderClass = Dataprovider.class)
	public void Slogin(String InputType, String usern, String passw, String ExpectedMessage) {
		ApplicationFilePath.logger = ApplicationFilePath.report.startTest("Verify Login");
		new LoginLib().loginusername(usern);
		waitforpageload(10);
		new LoginLib().loginpasswrd(passw);
		waitforpageload(10);
		new LoginLib().loginbtn();
		waitforpageload(10);
		if (InputType.equalsIgnoreCase("N")) {
			try {
				if (ExpectedMessage.trim().contains(new LoginLib().loginerror().getText().trim())) {
					ApplicationFilePath.logger.log(LogStatus.PASS, "Pass  Negative TestCases");

				}
			} catch (Exception e) {
				ApplicationFilePath.logger.log(LogStatus.FAIL, "Fail Negative TestCases");
			}
		} else {
			try {
				if (ExpectedMessage.trim().contains(new LoginLib().loginsuccess().getText().trim())) {
					ApplicationFilePath.logger.log(LogStatus.PASS, "Pass Positive TestCases");

				}
			} catch (Exception e) {
				ApplicationFilePath.logger.log(LogStatus.FAIL, "Fail Positive TestCases");

			}
		}
	}

}
