package scripts.file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utility.*;


public class LoginClass extends InitilzeBrowser{

	WebDriver driver;
	
	@Test
	public void test_login()
	{
		driver = null;
		driver.findElement(By.xpath("//input[@name='callback_0']")).sendKeys("QA_traininguser39");
		driver.findElement(By.xpath("//input[@name='callback_1']")).sendKeys("Empirix!");
		driver.findElement(By.xpath("//div[@class='group-field-block float-right']")).click();
		WebElement element = driver.findElement(By.xpath("//div[@class='container']/ul"));
		
		/**
		 * locate header div header Dashboard, Alert, Test, Variable, Notification.
		 */
		boolean expected  = element.isDisplayed();
		assert expected == true;
		// TODO Auto-generated method stub	
	}
	
	
}



