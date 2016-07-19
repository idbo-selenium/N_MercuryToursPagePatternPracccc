package murcury.NewRegistration;

import org.openqa.selenium.By;

public class SignInCommands {

	public String username;
	public String password;
	
	public SignInCommands(String username) {
		// TODO Auto-generated constructor stub
		this.username = username;
	}
	
	public 	SignInCommands WithPassword(String password){
		this.password = password;
		return this;		
	}
	
	public void Login(){
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div/div/div/div[2]/form/div[1]/div/input"), 5000).sendKeys(username);
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div/div/div/div[2]/form/div[2]/div/input"), 5000).sendKeys(password);
		Utility.waitForPageUntilElementIsVisible(By.xpath("/html/body/div/div/div/div/div[2]/form/div[4]/div/button"), 5000).click();
	}
	
}
