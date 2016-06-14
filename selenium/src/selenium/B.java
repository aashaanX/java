package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class B {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/edathadan/chromedriver");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.google.co.in");
		driver.findElement(By.name("q")).sendKeys("arjun");
		driver.findElement(By.name("btnG")).click();
	}

}
