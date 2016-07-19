package murcury.TestCases;

import murcury.NewRegistration.Browser;
import murcury.NewRegistration.HomePage;
import murcury.NewRegistration.Profile;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.testng.Assert;

public class Murcury_Login {
	
	@Before
	public void Init(){
		Browser.Open();
	}
	
	@After
	public void Cleanup(){
		//Browser.Close();
	}
	
	@Test
	public void User_Login() throws InterruptedException{
		HomePage.GoTo();
		Assert.assertTrue(HomePage.Is_At_HomePage());		
		HomePage.LoginAs("knskumari@gmail.com").WithPassword("123456").Login();
		HomePage.Profile().Select();
		Profile.Save();
	}
	
}
