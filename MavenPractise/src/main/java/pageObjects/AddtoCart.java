package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddtoCart {
	
	public WebDriver driver;
	
	
	By product = By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img");
	
	By addCart = By.xpath("//*[@id=\"add_to_cart\"]/button/span");
	
	By checkout = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span");

	public AddtoCart(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement selectProduct() {
		
		return driver.findElement(product);
	}
	
	public WebElement addProduct() {
		
		return driver.findElement(addCart);
	}
	
	public WebElement proceedCheckout() {
		
		return driver.findElement(checkout);
	}
	
	
	

	

}
