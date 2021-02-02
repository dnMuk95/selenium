package selenium.dropdowns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class BeforeTestExecution {

	public static WebDriver driver;
	@BeforeTest
	public void setupDropdown()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Desktop\\selenium\\jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		String title = "QAClickJet - Flight Booking for Domestic and International, Cheap Air Tickets";
		Assert.assertEquals(title, driver.getTitle());
	}
	
	@AfterTest
	public void shutDropdown()
	{
		driver.close();
	}
	public abstract void test() throws Exception;
}
