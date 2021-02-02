package selenium.dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DynamicDropdown extends BeforeTestExecution{

	@Override
	@Test
	public void test() throws Exception {
		WebElement origin = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		origin.sendKeys("ja");
		driver.findElement(By.xpath("//div[@id='dropdownGroup1']//div[@class='dropdownDiv']/ul/li/a[contains(text(),'Jaisalmer')]")).click();
		Thread.sleep(3000);
	}

}
