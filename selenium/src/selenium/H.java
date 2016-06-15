package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

// Synchronization
// implicit wait
// implicit wait will be applicable for all the fields that is coming after it's initialization
public class H {
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.gmail.com");
		// the below line is setting an implicit wait.
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("testingcampus@gmail.com");
		driver.findElement(By.xpath("//*[@id='next']")).click();
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("abc@123");
	}

}
