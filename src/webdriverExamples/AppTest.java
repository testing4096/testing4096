package webdriverExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {
	protected WebDriver driver;
	//@Test
	@SuppressWarnings("deprecation")
	public void credosystemz() throws InterruptedException 
	{
	System.setProperty ("webdriver.chrome.driver",".\\chromedriver.exe" );
	driver = new ChromeDriver(); 
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
	String eTitle = "credosystemz";
	String aTitle = "" ;
	// launch Chrome and redirect it to the Base URL
	driver.get("https://www.credosystemz.com/" );
	//Maximizes the browser window
	driver.manage().window().maximize() ;
	//get the actual value of the title
	aTitle = driver.getTitle();
	//compare the actual title with the expected title
	if (aTitle.equals(eTitle))
	{
	System.out.println( "Test Passed") ;
	}
	else {
	System.out.println( "Test Failed" );
	}
	//close browser
	driver.close();
}
}