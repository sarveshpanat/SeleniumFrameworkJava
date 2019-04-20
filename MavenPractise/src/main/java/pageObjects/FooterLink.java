package pageObjects;

import java.util.Set;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class FooterLink {
	
	public WebDriver driver;
	
	public FooterLink(WebDriver driver) {
		this.driver = driver;
	}
	
	By footerSection = By.id("footer");
	By columnLink = By.id("block_various_links_footer");
	
	public int footerLinkCount() {
		WebElement footerDriver = driver.findElement(footerSection);
		return footerDriver.findElements(By.tagName("a")).size(); 
	}
	
	public void columnLinkClick() throws InterruptedException {
		
		WebElement column = driver.findElement(columnLink);
		System.out.println(column.findElements(By.tagName("a")).size());
		for(int i=0; i<column.findElements(By.tagName("a")).size();i++) {
			
			String clickOnLink = Keys.chord(Keys.CONTROL,Keys.ENTER);
			column.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
			Thread.sleep(4000L);
		}
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> its = ids.iterator();
		while(its.hasNext()) {
			driver.switchTo().window(its.next());
			System.out.println(driver.getTitle());
		}
		
		
	}

}
