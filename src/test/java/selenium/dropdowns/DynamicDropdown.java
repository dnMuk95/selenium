package selenium.dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DynamicDropdown extends BeforeTestExecution{

	@Override
	@Test(priority=2)
	public void test() throws Exception {
		By el = By.id("ctl00_mainContent_ddl_originStation1_CTXT");
		WebElement origin = driver.findElement(el);
		
		origin.sendKeys("ja");
		driver.findElement(By.xpath("//div[@id='dropdownGroup1']//div[@class='dropdownDiv']/ul/li/a[contains(text(),'Jaisalmer')]")).click();
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.textToBePresentInElementValue(el, "Jaisalmer (JSA)"));
		System.out.println(origin.getAttribute("value"));
	}

}
