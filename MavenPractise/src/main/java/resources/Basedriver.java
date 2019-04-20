package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basedriver {
	public WebDriver driver;
	public Properties prop;
	public WebDriver initializeDriver() throws IOException {
		
		prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\admin\\MavenPractise\\src\\main\\java\\resources\\data.properties");
		prop.load(file);
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			
			
		}
		return driver;
		
	}
	
	public void getScreenshot(String result) throws IOException {
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C://test//"+result+"screenshot.png"));
		
	}

}
