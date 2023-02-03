package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramya\\Downloads\\chromedriver_win32 (1)");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.amazon.in/");
	}

}
