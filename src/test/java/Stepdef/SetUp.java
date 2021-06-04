package Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class SetUp {
	
	static WebDriver driver;
	@Before
	public void setDriver() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
	}
	@After("@Sanity,@Smoke")
	public void closeDriver() {
		
		driver.close();
	}

}
