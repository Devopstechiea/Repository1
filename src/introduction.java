import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("WebDriver.chrome.driver","C:\\Users\\scheb\\Downloads\\chromedriver_win32 (4)");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	
		
		
	}

}
