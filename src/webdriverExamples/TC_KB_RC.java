package webdriverExamples;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.By;

public class TC_KB_RC {
	public static void main(String args[]) throws Exception{
	    //Test Steps
	 WebDriver driver = new FirefoxDriver();
	 driver.navigate().to("http://183.82.103.245/nareshit/login.php&quot");
	 driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	 driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	 Thread.sleep(4000);
	 //Click on btn : Keyboard : TAB , ENTER
	 Robot r = new Robot();
	 r.keyPress(KeyEvent.VK_TAB);
	 r.keyRelease(KeyEvent.VK_TAB);
	 Thread.sleep(4000);
	 System.out.println("TAB");
	 r.keyPress(KeyEvent.VK_ENTER);
	 r.keyRelease(KeyEvent.VK_ENTER);
	 System.out.println("ENTER");
	 Thread.sleep(4000);
	 System.out.println("login completed");
	 driver.findElement(By.linkText("Logout")).click();
	 driver.close();
	}
	}

