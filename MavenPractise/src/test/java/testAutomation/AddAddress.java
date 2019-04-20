package testAutomation;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.NewAddress;
import resources.Basedriver;

public class AddAddress extends Basedriver {

	@BeforeTest
	public void setDriver() throws IOException {
		
		driver = initializeDriver();
		
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void addNewAddress() throws IOException {
		
		driver.get(prop.getProperty("url"));
		
		NewAddress address = new NewAddress(driver);
		address.clickOnSignIn().click();
		address.enterEmail().sendKeys("demouser12@gmail.com");
		address.enterPassword().sendKeys("test1234");
		address.clickLogIn().click();
		String str = address.verifyText().getText();
		Assert.assertEquals(str, "MY ACCOUNT");
		address.clickAddress().click();
		address.clickAddressButton().click();
		address.enterAddressField().sendKeys("570 10th Ave");
		address.enterCityField().sendKeys(" New York");
		address.enterStateField().selectByValue("32");
		address.enterPostalCode().sendKeys("10036");
		address.enterMobile().sendKeys("8974775505555");
		address.clickSave().click();
	
	}
	
	@AfterTest
	public void closeDriver() {
		driver.close();
	}
}
