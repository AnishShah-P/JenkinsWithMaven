package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;

import wrapper.ProjectSpecificWrapper;

public class HomePage extends ProjectSpecificWrapper{
	
	public HomePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	
	
	public LoginPage clickLogOut() {
		click(locSelector("class", prop.getProperty("home.logout.class")));
		return new LoginPage(driver, test);
	}

}
