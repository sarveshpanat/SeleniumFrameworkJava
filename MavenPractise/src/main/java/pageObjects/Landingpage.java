package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Landingpage {
	
	public WebDriver driver;
	
	
	@FindBy(id = "search_query_top") 
	WebElement searchBox;
	
	By search = By.xpath("//button[@name='submit_search']");
	
	
	
	public Landingpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement enterText() {
		return searchBox;
	}
	
	public WebElement clickonSearch() {
		return driver.findElement(search);
	}
	
	

}
