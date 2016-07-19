package murcury.NewRegistration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	public static WebDriver driver;
	public static void Open(){
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\sravan\\Desktop\\important\\ChromeDriver\\chromedriver.exe");		 
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
	}
	
	public static void Close(){
		driver.close();		
	}
	
	public static WebDriver Driver(){
		return driver;
	}
	
}
