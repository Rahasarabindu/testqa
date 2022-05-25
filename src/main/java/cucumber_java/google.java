package cucumber_java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class google {

	public static WebDriver driver;
	
	public static void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.google.com");

	}

	public void gettitle()
	{
		System.out.println(driver.getTitle());
	}
	
}



