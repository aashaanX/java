package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A {
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.google.co.in");
		driver.findElement(By.name("q")).sendKeys("Arjun");
	}
	

}
