package testAutomation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.AddtoCart;
import pageObjects.CheckoutJourney;
import pageObjects.Landingpage;

import resources.Basedriver;

public class Homepage extends Basedriver {
	
	@BeforeTest
	public void setDriver() throws IOException {
		
		driver = initializeDriver();
		
		driver.manage().window().maximize();
		
	}
	@Test(dataProvider = "getData")
	public void baseNavigation(String userName, String Password) throws InterruptedException {
		
		driver.get(prop.getProperty("url"));
		Landingpage lp = new Landingpage(driver);
		lp.enterText().sendKeys("Dress");
		lp.clickonSearch().click();

		AddtoCart ro = new AddtoCart(driver);
		ro.selectProduct().click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']")));
		ro.addProduct().click();
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		ro.proceedCheckout().click();
		
		CheckoutJourney cj = new CheckoutJourney(driver);
		cj.clickonCheckoutButton().click();
		cj.enterEmail().sendKeys(userName);
		cj.enterPassword().sendKeys(Password);
		cj.clickSignIn().click();
		cj.proceedtoCheckout().click();
		if(cj.selectCheck().isSelected() == false) {
			cj.selectCheck().click();
			cj.selectCheckout().click();
			
		}
		else
		{
			cj.closePopUp().click();
			cj.selectCheckout().click();
		}
		cj.selectPayment().click();
		cj.clickConfirm().click();
		String value = cj.verifyText().getText();
		Assert.assertEquals(value, "Your order on My Store is complete.");
		System.out.println("passed");
	}
	
	@AfterTest
	public void closeDriver() {
		driver.close();
	}
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data = new Object[1][2];
		data[0][0] = "demouser12@gmail.com";
		data[0][1] = "test1234";
		
		return data;
		
	}
	

	
	

}
