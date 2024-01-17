package webdriverExamples;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

import io.netty.util.AsciiString;
	public class AppTest {
	
	//	protected WebDriver driver;
		//@Test
		@SuppressWarnings({ "deprecation" })
		public static void main(AsciiString args) throws Exception 
		{
			System.setProperty("webdriver.chromedriver", "F:\\Java Developer- File\\New folder\\chromedriver_win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
		String eTitle = "automationpractice";
		String aTitle = "" ;
		// launch Chrome and redirect it to the Base URL
		driver.get("https://www.automationpractice.com");
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

