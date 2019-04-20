package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutJourney {
	
	public WebDriver driver;
	
	By button = By.xpath("//p[@class='cart_navigation clearfix']/a/span");
	By email = By.id("email");
	By password = By.id("passwd");
	By SignIn = By.xpath("//button[@id='SubmitLogin']");
	By checkout = By.xpath("//button[@name='processAddress']/span");
	By termsOfService = By.xpath("//input[@type='checkbox']");
	By shippingCheckout = By.xpath("//button[@name='processCarrier']");
	By popUp = By.xpath("//a@[title='Close']");
	By paymentMode = By.xpath("//a[@class='bankwire']");
	By confirmOrder = By.xpath("//*[@id=\"cart_navigation\"]/button/span");
	By text = By.xpath("//*[@id=\"center_column\"]/div/p/strong");
	
	
	
	
	public CheckoutJourney(WebDriver driver) {
		
		this.driver = driver;
	}

	
	public WebElement clickonCheckoutButton() {
		return driver.findElement(button);
	}
	
	public WebElement enterEmail() {
		return driver.findElement(email);
	}
	
	public WebElement enterPassword() {
		return driver.findElement(password);
	}
	
	public WebElement clickSignIn() {
		return driver.findElement(SignIn);
	}
	
	public WebElement proceedtoCheckout() {
		return driver.findElement(checkout);
	}
	
	public WebElement selectCheck() {
		return driver.findElement(termsOfService);
	}
	
	public WebElement selectCheckout() {
		return driver.findElement(shippingCheckout);
	}
	
	public WebElement closePopUp() {
		return driver.findElement(popUp);
	}
	
	public WebElement selectPayment() {
		return driver.findElement(paymentMode);
	}
	
	public WebElement clickConfirm() {
		return driver.findElement(confirmOrder);
	}
	
	public WebElement verifyText() {
		return driver.findElement(text);
	}
}
