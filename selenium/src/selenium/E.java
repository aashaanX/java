package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
// To select drop down box we use the Select class with selenium.
// we can select using two methods 1)ByIndex 2)ByValue
public class E {
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.airindia.in/");
		Select select = new Select(driver.findElement(By.xpath(".//*[@id='ddladult1']")));
		select.selectByIndex(1);
	}
}
