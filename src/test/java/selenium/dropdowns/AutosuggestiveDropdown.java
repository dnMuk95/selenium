package selenium.dropdowns;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AutosuggestiveDropdown extends BeforeTestExecution{

	@Override
	@Test
	public void test() throws Exception {
		driver.findElement(By.id("autosuggest")).sendKeys("New");
		List<WebElement> options = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		Iterator<WebElement> it = options.iterator();
		while(it.hasNext())
		{
			WebElement i = it.next();
			String txt = i.getText();
			if(txt.equals("Papua New Guinea"))
			{
				i.click();
				break;
			}
		}
	}

}
