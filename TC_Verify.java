package webdriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
public class TC_Verify {
	public static void main(String args[]) throws Exception{
	    //Test Steps
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	//Verify Title
	// Actual Result   compare  Exp.Result
	if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
	System.out.println("Title matched");    
	}
	else {
	System.out.println("Title not matched");
	System.out.println(driver.getTitle());
	}
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	Thread.sleep(3000);
	driver.findElement(By.name("Submit")).click();
	System.out.println("Login completed");
	Thread.sleep(3000);
	//Verify Title
	if(driver.getTitle().equals("OrangeHRM")) {
	System.out.println("Title matched");
	}
	else {
	System.out.println("Title not matched");
	System.out.println(driver.getTitle());
	}
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(3000);
	System.out.println("Logout completed");
	driver.close();
	}
}
