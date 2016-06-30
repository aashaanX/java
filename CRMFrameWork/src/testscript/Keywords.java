package testscript;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Keywords {
	static FirefoxDriver driver;
	
	public static void openBrowser(){
		driver = new FirefoxDriver();
	}
	public static void navigate(String data){
		driver.get(data);
	}

}
