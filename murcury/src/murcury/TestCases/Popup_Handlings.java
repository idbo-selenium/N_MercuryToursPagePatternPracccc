package murcury.TestCases;

import murcury.NewRegistration.Browser;
import murcury.NewRegistration.Modal_Homepage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Popup_Handlings {
	
	@Before
	public void Init(){
		Browser.Open();
	}
	
	@Test
	public void PopUp(){
		//Browser.Close();
	}
	
	@After
	public void Cleanup() throws InterruptedException{
		Modal_Homepage.GoTo();
		Modal_Homepage.Modal_Click();
	}
	
}
