package testCases;

import org.testng.annotations.Test;

import pages.LoginPage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import wrapper.ProjectSpecificWrapper;

public class TC002_CreateLead extends ProjectSpecificWrapper{
	
	@BeforeTest
	public void setData() {
		testCaseName = "TC001_CreateLead";
		testCaseDec = "Create a new Lead in Opentaps";
		author = "Gopi";
		category = "Smoke";
		device = "Mac";
		dataSheet = "TC002";
	}
	
	@Test(dataProvider = "fetchData")
	public void createLead(String uname, String pwd) {
		new LoginPage(driver, test)
		.enterUserName(uname)
		.enterPassword(pwd);
//		.clickLogin()
//		.clickLogOut();	
	}

}
