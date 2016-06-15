package selenium;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class F {
	public static void main(String[] args) throws Exception {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.olx.in/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='postNewAdLink']/span")).click();
		driver.findElement(By.xpath(".//*[@id='add-file-1']/div/a/span")).click();
		// ctrl+c
		StringSelection selection = new StringSelection("/home/edathadan/Downloads/11988339_10207654855233798_7178702505337665220_n.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		// Ctrl + L
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyRelease(KeyEvent.VK_L);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		// ctrl+v
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		// pressing Enter
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		//Robot okRobot = new Robot();
		//okRobot.keyPress(KeyEvent.VK_ENTER);
		//okRobot.keyRelease(KeyEvent.VK_ENTER);
	}

}
