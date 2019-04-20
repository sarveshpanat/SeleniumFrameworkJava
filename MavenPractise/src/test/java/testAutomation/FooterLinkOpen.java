package testAutomation;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.FooterLink;
import resources.Basedriver;

public class FooterLinkOpen extends Basedriver {
	
	@BeforeTest
	public void setDriver() throws IOException {
		
		driver = initializeDriver();
		
		driver.manage().window().maximize();
		
	}
	@Test
	public void linkOpen() throws IOException, InterruptedException {
		
		
		driver.get(prop.getProperty("url"));
		FooterLink fl = new FooterLink(driver);
		int count = fl.footerLinkCount();
		System.out.println(count);
		fl.columnLinkClick();		
		
	}
	
	@AfterTest
	public void closeDriver() {
		driver.quit();;
	}
	
	

}
