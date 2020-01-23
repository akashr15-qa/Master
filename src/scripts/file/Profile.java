package scripts.file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utility.*;

public class Profile extends InitilzeBrowser{
	WebDriver driver = null;

	@Test
	public void profile_selection()
	{
		driver.findElement(By.xpath("//input[@name='callback_0']")).sendKeys("QA_traininguser39");
		driver.findElement(By.xpath("//input[@name='callback_1']")).sendKeys("Empirix!");
		driver.findElement(By.xpath("//div[@class='group-field-block float-right']")).click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='dropdown-toggle ng-binding']")));
		driver.findElement(By.xpath("//a[@class='dropdown-toggle ng-binding']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Profile']")));
		driver.findElement(By.xpath("//span[text()='Client']")).click();
		WebElement element_2 = driver.findElement(By.xpath("//h3[text()='Client Details']"));
		boolean elem_expect  = element_2.isDisplayed();
		assert elem_expect == true;
	}
}
