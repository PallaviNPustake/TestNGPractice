package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import base.Base;

public class Utility extends Base{

	public static void scrollIntoview(WebElement element)
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", element);
	}
	public static void scrollBy()
	{
		((JavascriptExecutor)driver).executeScript("window.scrollBy(100,300)");
	}
	
}
