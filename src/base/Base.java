package base;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

public class Base {

	static protected WebDriver driver;
	public void launchBuildAbear()
	{
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver=new ChromeDriver(opt);
		driver.get("https://www.buildabear.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		Reporter.log("Launched Build-A-Bear application", true);		
	}
	public void closeBrowser() {
		driver.quit();
		Reporter.log("Closed Browser", true);
	}
}
