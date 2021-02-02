package selenium.dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DynamicDropdown extends BeforeTestExecution{

	@Override
	public void test() throws Exception {
		WebElement origin = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1"));
	}

}
