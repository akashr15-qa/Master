package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class InitilzeBrowser {

	WebDriver driver = null;
	@BeforeClass
	public void start()
	{
		  
		System.setProperty("webdriver.gecko.driver","D:\\latest_gecko\\geckodriver.exe");

		WebDriver driver  = new FirefoxDriver();
		driver.get("https://services.empirix.com/)");
		driver.manage().window().maximize();
		driver.manage().timeouts();
		
	}
	

	@AfterClass
	public void close()
	{
		driver = null;
		driver.close();
	}
}
