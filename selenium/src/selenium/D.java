package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class D {
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.gmail.com");
		//usage of absolute/complete xpath generated using firebug and firepath.
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]"
				+ "/div[1]/form/div[1]/div/div[1]/div/div/input[1]"))
				.sendKeys("testingcampus@gmail.com");
		//Usage of partial/incomplete xpath generated using firebug and firepath.
		driver.findElement(By.xpath(".//*[@id='next']")).click();
	}

}
// absolute/complete xpath is used when there is no attributes available to form simple xpaths
// absolute xpath is formed based on the html tag hierarchies.
// partial xpath is formed based on the attributes avilable to the filed.
// partials xpath reduces the length of the path.
// it also remains same when developer make changes in tag hierarchies.
