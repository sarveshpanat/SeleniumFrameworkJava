package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NewAddress {
	
	public WebDriver driver;
	
	public NewAddress(WebDriver driver) {
		this.driver = driver;
	}
	
	By signIn = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
	By email = By.id("email");
	By password = By.id("passwd");
	By logIn = By.xpath("//*[@id=\"SubmitLogin\"]/span");
	By text = By.xpath("//*[@id=\"center_column\"]/h1");
	By address = By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[3]/a/span");
	By addAddress = By.xpath("//*[@id=\"center_column\"]/div[2]/a/span");
	By addressField = By.id("address1");
	By addressCity = By.id("city");
	By State = By.id("id_state");
	By postalCode = By.id("postcode");
	By mobileNumber = By.id("phone_mobile");
	By save = By.xpath("//*[@id=\"submitAddress\"]/span");
	
	
	public WebElement clickOnSignIn() {
		return driver.findElement(signIn);
	}
	
	public WebElement enterEmail() {
		return driver.findElement(email);
	}
	
	public WebElement enterPassword() {
		return driver.findElement(password);
	}
	
	public WebElement clickLogIn() {
		return driver.findElement(logIn);
	}
	
	public WebElement verifyText() {
		return driver.findElement(text);
	}
	
	public WebElement clickAddress() {
		return driver.findElement(address);
	}
	
	public WebElement clickAddressButton() {
		return driver.findElement(addAddress);
	}
	
	public WebElement enterAddressField() {
		return driver.findElement(addressField);
	}
	
	public WebElement enterCityField() {
		return driver.findElement(addressCity);
	}
	
	public Select enterStateField() {
		Select s = new Select(driver.findElement(State));
		return s;
	}
	
	public WebElement enterPostalCode() {
		return driver.findElement(postalCode);
	}
	
	public WebElement enterMobile() {
		return driver.findElement(mobileNumber);
	}
	
	public WebElement clickSave() {
		return driver.findElement(save);
	}
	

}
