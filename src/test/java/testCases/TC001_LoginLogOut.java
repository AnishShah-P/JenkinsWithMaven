package testCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import wrapper.ProjectSpecificWrapper;

public class TC001_LoginLogOut extends ProjectSpecificWrapper{
	
	@BeforeTest
	public void setData() {
		testCaseName = "TC001_CreateLead";
		testCaseDec = "Create a new Lead in Opentaps";
		author = "Gopi";
		category = "Smoke";
		device = "Mac";
		dataSheet = "TC001";
	}
	
	
	@Test(dataProvider = "fetchData")
	public void login(String uname, String pwd) {
		new LoginPage(driver, test)
		.enterUserName(uname)
		.enterPassword(pwd)
		.clickLogin()
		.clickLogOut();	
	}

}
