package Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridExample {
	
	
	@Test
	public void testgrid() throws MalformedURLException {
		
	//System.setProperty(null, null);
		//WebDriverManager.chromedriver().setup();
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setPlatform(Platform.WINDOWS);
		capabilities.setBrowserName("chrome");
		
		URL hubURL = new URL("http://localhost:4444/wd/hub");
		
		WebDriver driver = new RemoteWebDriver(hubURL,capabilities );
		
		driver.get("https://www.saucedemo.com/");
		
		driver.quit();
		
	}
}
