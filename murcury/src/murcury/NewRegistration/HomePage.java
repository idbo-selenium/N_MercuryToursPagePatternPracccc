package murcury.NewRegistration;

public class HomePage {

	public static void GoTo() { 
		Browser.driver.navigate().to("http://example.local/auth/login");		
	}

	public static boolean Is_At_HomePage() {
		// TODO Auto-generated method stub		
		return Browser.Driver().getTitle().equals("Laravel");
	}

	public static SignInCommands LoginAs(String username) {
		// TODO Auto-generated method stub
		SignInCommands signinCmd = new SignInCommands(username);
		return signinCmd;
	}

	public static Profile Profile() {
		// TODO Auto-generated method stub
		return new Profile();
	}	
}