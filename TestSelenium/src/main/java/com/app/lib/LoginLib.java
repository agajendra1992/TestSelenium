package com.app.lib;

import org.openqa.selenium.WebElement;

import com.app.TestBase.TestBase;
import com.app.config.ApplicationFilePath;
import com.relevantcodes.extentreports.LogStatus;

public class LoginLib extends TestBase {

	public void loginusername(String username) {
		try {
			ApplicationFilePath.logger.log(LogStatus.INFO, "Clear the Username");
			getWebElement("app.loginuser").clear();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			getWebElement("app.loginuser").sendKeys(username);
			ApplicationFilePath.logger.log(LogStatus.INFO, "Enter the Username");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void loginpasswrd(String passw) {
		try {
			getWebElement("app.loginpass").clear();
			ApplicationFilePath.logger.log(LogStatus.INFO, "Clear the Password");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			getWebElement("app.loginpass").sendKeys(passw);
			ApplicationFilePath.logger.log(LogStatus.INFO, "Enter the Password");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void loginbtn() {
		try {
			getWebElement("app.loginbutton").click();
			ApplicationFilePath.logger.log(LogStatus.INFO, "Click on LoginButton");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public WebElement loginerror() throws Exception {
		ApplicationFilePath.logger.log(LogStatus.INFO, "Verify the Invalid Username  Password Error Message");
		return getWebElement("app.loginerror");

	}

	public WebElement loginsuccess() throws Exception {
		ApplicationFilePath.logger.log(LogStatus.INFO, "!!!Login Successfully!!!");
		return getWebElement("app.loginsuccess");

	}
}
