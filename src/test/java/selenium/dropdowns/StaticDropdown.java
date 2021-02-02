package selenium.dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class StaticDropdown extends BeforeTestExecution{
	@Test(priority=1)
	@Override
	public void test() throws Exception
	{
		WebElement it = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select s = new Select(it);
		s.selectByVisibleText("USD");
		Thread.sleep(3000);
	}
}
