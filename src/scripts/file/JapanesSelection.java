package scripts.file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utility.*;

public class JapanesSelection extends InitilzeBrowser {

	WebDriver driver = null;
	@Test
	public void japanesSelection() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name='callback_0']")).sendKeys("QA_traininguser39");
		driver.findElement(By.xpath("//input[@name='callback_1']")).sendKeys("Empirix!");
		driver.findElement(By.xpath("//div[@class='group-field-block float-right']")).click();
		WebElement element = driver.findElement(By.xpath("//div[@class='container']/ul"));
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='dropdown-toggle ng-binding']")));
		driver.findElement(By.xpath("//a[@class='dropdown-toggle ng-binding']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Japanese']")));
		driver.findElement(By.xpath("//a[text()='Japanese']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		/**
		 * locate header div header Dashboard, Alert, Test, Variable, Notification.
		 */
		boolean expected_jpn  = element.isDisplayed();
		assert expected_jpn == true;
	}
}
