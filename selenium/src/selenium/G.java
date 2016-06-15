package selenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;
// taking ScreenShot of the page.
// can be used in projects to find the error page
public class G {
	public static void main(String[] args) throws Exception{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.gmail.com");
		File srcFile = driver.getScreenshotAs(OutputType.FILE);
		File destFile = new File("/tmp/img1.png");
		FileUtils.copyFile(srcFile, destFile);
	}

}
