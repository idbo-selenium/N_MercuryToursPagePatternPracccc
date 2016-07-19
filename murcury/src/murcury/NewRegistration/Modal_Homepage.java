package murcury.NewRegistration;

import org.openqa.selenium.By;

public class Modal_Homepage {
	
	public static void GoTo() {
		Browser.driver.navigate().to("file:///C:/Users/sravan/Desktop/error.html");
	}

	public static void Modal_Click() throws InterruptedException {
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/button"), 5000).click();	
		//Browser.driver.switchTo().activeElement();		 
	    Browser.driver.switchTo().activeElement();Thread.sleep(4000);
	    Utility.waitForPageUntilElementIsVisible(By.xpath("//*[@id='myModal']/div/div/div[3]/button[1]"), 5000).click();Thread.sleep(4000);
	    Browser.Close();
	}
}
