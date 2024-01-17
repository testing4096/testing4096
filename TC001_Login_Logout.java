package webdriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
    //to access firefox browser
	//To access object/element methods
	public class TC001_Login_Logout {
	public static void main(String args[])throws Exception {
	    //Test Steps
	WebDriver driver = new EdgeDriver();
	driver.get("http:/facebook.com");
	Thread.sleep(3000);//wait time 
	driver.close();
	}
	}


	