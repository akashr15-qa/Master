package scripts.file;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.*;

public class Switchlanguage extends InitilzeBrowser{
	
	WebDriver driver = null;
	public void test_switchLanguage() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name='callback_0']")).sendKeys("QA_traininguser39");
		driver.findElement(By.xpath("//input[@name='callback_1']")).sendKeys("Empirix!");
		driver.findElement(By.xpath("//div[@class='group-field-block float-right']")).click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='dropdown-toggle ng-binding']")));
		driver.findElement(By.xpath("//a[@class='dropdown-toggle ng-binding']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Japanese']")));
		driver.findElement(By.xpath("//a[text()='Japanese']")).click();
		
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		WebElement element = driver.findElement(By.xpath("//div[@class='container']/ul"));
		
		/**
		 * locate header div header Dashboard, Alert, Test, Variable, Notification.
		 */
		boolean expect_jpn  = element.isDisplayed();
		assert expect_jpn == true;
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='dropdown-toggle ng-binding']")));
		driver.findElement(By.xpath("//a[@class='dropdown-toggle ng-binding']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='English']")));
		driver.findElement(By.xpath("//div[text()='English']")).click();
		Thread.sleep(3000);		
		driver.switchTo().alert().accept();
		/**
		 * locate header div header Dashboard, Alert, Test, Variable, Notification.
		 */
		boolean expected_eng  = element.isDisplayed();
		assert expected_eng == true;
	}

}
