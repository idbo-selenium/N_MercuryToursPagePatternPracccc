package murcury.NewRegistration;

import org.openqa.selenium.By;

public class Profile {

	public void Select() {
		// TODO Auto-generated method stub
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div/div/ul/li[1]/a"), 5000).click();
	}

	public static void Save() throws InterruptedException {
		// TODO Auto-generated method stub
		Utility.waitForPageUntilElementIsVisible(By.xpath("//*[@id='gender']"), 5000).click();
		Utility.waitForPageUntilElementIsVisible(By.xpath("//*[@id='saveProfile']"), 5000).click();
		Thread.sleep(5000);
	    Browser.driver.switchTo().alert().accept();Thread.sleep(5000);
	    Browser.driver.switchTo().alert().accept();
	}

}
